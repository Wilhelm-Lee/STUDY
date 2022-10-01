package base.execute;

import base.essention.BasicVariables;
import base.essention.exegesis.ProjectPrivacy;
import org.jetbrains.annotations.NotNull;
import work.shall.sys.CommandSet;
import work.shall.sys.Commands;
import work.shall.usr.Shall;

import java.util.List;

import static base.essention.BasicVariables.*;
import static work.shall.sys.CommandSet.DONE;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
@ProjectPrivacy (level = 6)
public class ProcessCommand {

    public ProcessCommand( @NotNull List<Commands> commands ) {

        final String INITIATOR =
                Shall.class.getName() + CHARACTER_COMMON_SYMBOLS_SPACE + CHARACTER_COMMON_SYMBOLS_MINUS +
                CHARACTER_COMMON_SYMBOLS_SPACE;

        /* Not an empty input */
        if ( !commands.isEmpty() &&
               !commands.get( 0 ).getName().equalsIgnoreCase( BasicVariables.STRING_COMMON_SYMBOLS_EMPTY ) &&
               !commands.get( commands.size() - 1 ).getName().equals( DONE.getName() ) ) {
            new ProcessIO.ProcessOutput(
                    BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_WARN,
                    INITIATOR + commands.get( commands.size() - 1 ).getName(),
                    BasicVariables.STRING_PROCESS_COMMANDS_ERR_DID_NOT_FIND_DONE + STRING_REGEX_ENDL
            );
            /* not empty, has DONE at the end -> Legal input */
        } else if ( commands.size() != 1 ) {
            for (
                    int index = 0;
                    index < commands.size() - 1;
                    index += commands.get( index ).getReadLength()
            ) {
                int rtnCode = recognition( ( index >= 1
                                             ? commands.get( index - 1 )
                                             : new Commands( BasicVariables.STRING_COMMON_SYMBOLS_EMPTY )
                                           ), commands.get( index ), commands.get( index + 1 ), index );

                if ( rtnCode == 1 ) {
                    new ProcessIO.ProcessOutput(
                            BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR, INITIATOR + commands.get( index >= 1
                                                                                                         ? index - 1
                                                                                                         : 0 )
                            .getName(),
                            BasicVariables.STRING_PROCESS_COMMANDS_ERR_ILLEGAL_COMMAND + STRING_REGEX_ENDL
                    );
                    break;
                }
            }
            /* commands.size() == 0 */
        }
    }

    private int recognition(
            @NotNull Commands previous,
            @NotNull Commands present,
            @NotNull Commands next,
            int index
    ) {

        if ( present.getName().equalsIgnoreCase( "DONE" ) ) { return 0; }

        if ( present.getName().equalsIgnoreCase( "HELP" ) ) {
            new CommandSet.Help( previous, index ).behaviour( next );
            return 0;
        }

        if ( present.getName().equalsIgnoreCase( "EXIT" ) ) {
            new CommandSet.Exit( previous, index ).behaviour( next );
            return 0;
        }

        if ( present.getName().equalsIgnoreCase( "TIME" ) ) {
            new CommandSet.Time( previous, index ).behaviour( next );
            return 0;
        }

        return 1; // error reached

    }

}
