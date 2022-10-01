package base.execute;

import base.echo.BasicOutput;
import base.enter.BasicInput;
import base.essention.exegesis.ProjectPrivacy;
import org.jetbrains.annotations.NotNull;
import work.shall.sys.Commands;
import work.speculator.exception.ActionOverAbstractiveException;

import java.util.ArrayList;
import java.util.List;

import static base.essention.BasicVariables.*;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
@ProjectPrivacy (level = 6)
public class ProcessIO {

    private ProcessIO() {
        throw new UnsupportedOperationException();
    }

    @ProjectPrivacy (level = 6)
    public static class ProcessInput
            extends BasicInput {

        public ProcessInput()
                throws ActionOverAbstractiveException {
            super(); // input: getLine()
            @NotNull String input = super.getInputResult();
            onCreate( input );
        }

        private void onCreate( @NotNull String userInputRaw ) {

            final String[] userInputSplit = removeExtraSpaces( userInputRaw, 0 ).split(
                    String.valueOf( CHARACTER_COMMON_SYMBOLS_SPACE ) );
            final List<String> userInputSplitArray = new ArrayList<>( List.of( userInputSplit ) );
            final List<Commands> userInputSplitArrayCommands = new ArrayList<>( 0 );

            for (
                    int i = 0;
                    i < userInputSplitArray.size();
                    i++
            ) {
                userInputSplitArrayCommands.add( i, new Commands( userInputSplitArray.get( i ) ) );
            }

            new ProcessCommand( userInputSplitArrayCommands );

        }

        private @NotNull String removeExtraSpaces(
                @NotNull String raw,
                int lastIndex
        ) {

            if ( lastIndex < 0 ) {
                throw new StringIndexOutOfBoundsException();
            }

            int len = raw.length();

            /* Special cases */
            if ( len == 0 ) { return raw; }

            final boolean a = raw.charAt( 0 ) == CHARACTER_COMMON_SYMBOLS_SPACE ||
                              String.valueOf( raw.charAt( 0 ) ).equals( STRING_REGEX_TABULATION );

            if ( len == 1 && a ) { return STRING_COMMON_SYMBOLS_EMPTY; }

            final boolean b = raw.charAt( 1 ) == CHARACTER_COMMON_SYMBOLS_SPACE ||
                              String.valueOf( raw.charAt( 1 ) ).equals( STRING_REGEX_TABULATION );

            final boolean A = a && b;
            final boolean B = a && !b;
            final boolean C = !a && b;

            if ( len == 2 && A ) { return STRING_COMMON_SYMBOLS_EMPTY; }
            if ( len == 2 && B ) { return String.valueOf( raw.charAt( 1 ) ); }
            if ( len == 2 && C ) { return String.valueOf( raw.charAt( 0 ) ); }

//            boolean isAllInputJustSpaces = true;
//            for (
//                    int i = 0;
//                    i < len;
//                    i++
//            ) {
//                final boolean TAB = String.valueOf( raw.charAt( i ) ).equals( STRING_REGEX_TABULATION );
//                final boolean SPC = raw.charAt( i ) == CHARACTER_COMMON_SYMBOLS_SPACE;
//                if ( ( TAB && !SPC ) || ( !TAB && SPC ) ) {
//                    isAllInputJustSpaces = false;
//                    break;
//                }
//            }
//            if ( isAllInputJustSpaces ) { return STRING_COMMON_SYMBOLS_EMPTY; }

            if ( B ) {
                return removeExtraSpaces( raw.substring( 1, len ), lastIndex );
            }
            if ( ( raw.charAt( len - 1 ) == CHARACTER_COMMON_SYMBOLS_SPACE ) &&
                   raw.charAt( len - 2 ) != CHARACTER_COMMON_SYMBOLS_SPACE ) {
                return removeExtraSpaces( raw.substring( 0, len - 1 ), lastIndex );
            }

            /* start removing */
            if ( lastIndex >= len - 1 ) {
                return raw;
            }

            if ( raw.charAt( lastIndex ) == CHARACTER_COMMON_SYMBOLS_SPACE &&
                        raw.charAt( lastIndex + 1 ) == CHARACTER_COMMON_SYMBOLS_SPACE ) {
                return removeExtraSpaces(
                        raw.substring( 0, lastIndex ) + raw.substring( lastIndex + 1, len ), lastIndex );
            }
            return removeExtraSpaces( raw, lastIndex + 1 );

        }

    }

    @ProjectPrivacy (level = 6)
    public static class ProcessOutput
            extends BasicOutput {

        public ProcessOutput(
                @NotNull String outputType,
                @NotNull String initiator,
                @NotNull String content
        ) {
            super( outputType, initiator, content );
        }

    }

}
