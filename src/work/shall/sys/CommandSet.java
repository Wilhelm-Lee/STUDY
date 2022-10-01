package work.shall.sys;

import base.essention.Settings;
import base.essention.exegesis.ProjectPrivacy;
import base.essention.exemplification.AbstractCommands;
import base.execute.ProcessIO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static base.essention.BasicVariables.*;

@ProjectPrivacy (level = 1)
public class CommandSet {

    public static final Commands DONE = new Commands( "DONE" );
    public static final Commands HELP = new Commands( "HELP".toUpperCase(), new Commands[] {
            new Commands( "HELP", "COMMANDS_FOR_HELP_HELP", true ),
            new Commands( "TIME", "COMMANDS_FOR_HELP_TIME", true ),
            new Commands( "EXIT", "COMMANDS_FOR_HELP_EXIT", true ),
            new Commands( DONE, "PRINT_HELP_DOC", true )
    } );
    public static final Commands EXIT = new Commands( "EXIT".toUpperCase(), new Commands[] {
            new Commands( "ID", "THREAD_TO_BE_KILLED", true ),
            new Commands( DONE, "EXIT_STUDY", true )
    } );
    public static final Commands TIME = new Commands( "TIME".toUpperCase(), new Commands[] {
            new Commands( "FORMAT", "FORMAT_CUSTOM", true ),
            new Commands( "FULL", "FORMAT_LONG", true ),
            new Commands( DONE, "FORMAT_SHORT", true )
    } );

    private CommandSet() {
        throw new UnsupportedOperationException( "Utility class was called" );
    }

    public static class Help
            extends Commands {

        // TODO: move these into specific doc library in the future versions
        static final String DONE_STRING_CONTENT = "Sign of finishing your typing as you type it at the end of line";
        static final String HELP_STRING_CONTENT = "Print help";
        static final String EXIT_STRING_CONTENT = "Exit Study";
        static final String TIME_STRING_CONTENT = "Print out local date & time in certain format you referenced or in default if you don't (EXPERIMENTAL)";
        static final String DOCS_STRING_CONTENT =
                "Usage: <Command> [...]" + STRING_REGEX_ENDL +
                "Command:" + STRING_REGEX_ENDL +
                STRING_REGEX_TABULATION + DONE.getName() + STRING_REGEX_TABULATION + DONE_STRING_CONTENT +
                STRING_REGEX_ENDL +
                STRING_REGEX_TABULATION + HELP.getName() + STRING_REGEX_TABULATION + HELP_STRING_CONTENT +
                STRING_REGEX_ENDL +
                STRING_REGEX_TABULATION + EXIT.getName() + STRING_REGEX_TABULATION + EXIT_STRING_CONTENT +
                STRING_REGEX_ENDL +
                STRING_REGEX_TABULATION + TIME.getName() + STRING_REGEX_TABULATION + TIME_STRING_CONTENT;
        static final String DOC_ABOUT =
                "Project: " + STRING_ABOUT_PROJECT_NAME + STRING_REGEX_ENDL + "Version: " +
                STRING_ABOUT_PROJECT_VERSION + STRING_REGEX_ENDL + "Author: " +
                STRING_ABOUT_PROJECT_AUTHOR_NAME + STRING_REGEX_ENDL + "Github: " +
                STRING_ABOUT_PROJECT_AUTHOR_GITHUB + STRING_REGEX_ENDL;

        /**
         * Initiate by legally existed AbstractCommands
         */
        public Help(
                Commands theOneBeforeIt,
                int indexOutOfInputCommandsArray
        ) {
            super( HELP );
            HELP.setIsAsSubCommands( HELP.evaluateIsAsSubCommand( theOneBeforeIt, indexOutOfInputCommandsArray ) );
        }

        /**
         * <p>You should not use this method without any class-substances<p/>
         *
         * <p>This method exists for more abstractive classes to base on<p/>
         */
        @Override
        public void behaviour( @NotNull AbstractCommands nextCommand ) {

            if ( HELP.getIsAsSubCommand() ) {
                return;
            }

            if ( nextCommand.getName()
                    .equalsIgnoreCase( Objects.requireNonNull( HELP.getSuccessors()[ 3 ] ).getName() ) ) {
                /* DONE -> DOC_ABOUT */
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        HELP.getName(),
                        STRING_REGEX_ENDL + DOC_ABOUT + DOCS_STRING_CONTENT + STRING_REGEX_ENDL
                );
            } else if ( nextCommand.getName()
                    .equalsIgnoreCase( Objects.requireNonNull( HELP.getSuccessors()[ 0 ] ).getName() ) ) {
                /* HELP -> HELP_STRING_CONTENT */
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        HELP.getName(),
                        HELP_STRING_CONTENT + STRING_REGEX_ENDL
                );
            } else if ( nextCommand.getName()
                    .equalsIgnoreCase( Objects.requireNonNull( HELP.getSuccessors()[ 1 ] ).getName() ) ) {
                /* TIME -> TIME_STRING_CONTENT */
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        HELP.getName(),
                        TIME_STRING_CONTENT + STRING_REGEX_ENDL
                );
            } else if ( nextCommand.getName()
                    .equalsIgnoreCase( Objects.requireNonNull( HELP.getSuccessors()[ 2 ] ).getName() ) ) {
                /* EXIT -> EXIT_STRING_CONTENT */
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        HELP.getName(),
                        EXIT_STRING_CONTENT + STRING_REGEX_ENDL
                );
            } else {
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                        HELP.getName(),
                        STRING_PROCESS_COMMANDS_ERR_ILLEGAL_COMMAND +
                        CHARACTER_COMMON_SYMBOLS_COLON + CHARACTER_COMMON_SYMBOLS_SPACE +
                        nextCommand.getName() + STRING_REGEX_ENDL
                );
            }
        }
    }

    public static class Exit
            extends Commands {

        /**
         * Initiate by legally existed AbstractCommands
         */
        public Exit(
                Commands theOneBeforeIt,
                int indexOutOfInputCommandsArray
        ) {
            super( EXIT );
            EXIT.setIsAsSubCommands( EXIT.evaluateIsAsSubCommand( theOneBeforeIt, indexOutOfInputCommandsArray ) );
        }

        /**
         * <p>You should not use this method without any class-substances<p/>
         *
         * <p>This method exists for more abstractive classes to base on<p/>
         *
         * @param nextCommand Behaviour of this AbstractCommands command
         */
        @Override
        public void behaviour( @Nullable AbstractCommands nextCommand ) {

            // TODO: killing application is yet to be done, just simply a sample here to kill main process :P
            if ( !EXIT.getIsAsSubCommand() ) {
                System.exit( 0 );
            }
        }
    }

    public static class Time
            extends Commands {


        public Time(
                Commands theOneBeforeIt,
                int indexOutOfInputCommandsArray
        ) {
            super( TIME );
            TIME.setIsAsSubCommands( TIME.evaluateIsAsSubCommand( theOneBeforeIt, indexOutOfInputCommandsArray ) );
        }

        /**
         * <p>You should not use this method without any class-substances<p/>
         *
         * <p>This method exists for more abstractive classes to base on<p/>
         *
         * @param nextCommand Behaviour of this AbstractCommands command
         */
        @Override
        public void behaviour( @NotNull AbstractCommands nextCommand ) {

            if ( TIME.getIsAsSubCommand() ) {
                return;
            }

            if ( nextCommand.getName()
                         .equalsIgnoreCase( Objects.requireNonNull( TIME.getSuccessors()[ 2 ] ).getName() ) &&
                 TIME.getSuccessors()[ 2 ].getIsAsSubCommand() ) {

                /* DONE -> default format(short) */
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        TIME.getName(),
                        LocalDateTime.now().format( Settings.getFormatterShort() ) +
                        STRING_REGEX_ENDL
                );
            } else if ( nextCommand.getName()
                                .equalsIgnoreCase( Objects.requireNonNull( TIME.getSuccessors()[ 0 ] ).getName() ) &&
                        TIME.getSuccessors()[ 0 ].getIsAsSubCommand() ) {

                // FORMAT -> CUSTOM
                if ( Settings.getFormatterCustom() == null ) {
                    /*

                    final Button YES = new Button(
                          "Yes",        // Asset text
                          true,         // Initiation of isClickable
                          Window.rightDown, // display initiation location (@Nullable -> default location (0, 0))
                          -1, -1,       // Width & height
                          ------------- // when less than 0, use default/ auto-resizable size
                          ------------- // Actions (@NotNull)
                          new Action(
                              1,        // times
                              RETURN.   // type
                              CONSOLE,  // receiver (@NotNull)
                              BasicVariables.Action.RETURN_Y, // value (@NotNull)
                          )
                    );

                    WM.newWin(
                          "Warn",             // title
                          "Your custom format of time output hasn't been initiated, still wish to proceed?" + ENDL +
                          "It may cause NullPointerException!" // message

                          Screen.center,      // display initiation location
                          0.4, 0.2,           // Width & height
                          ------------------- // when less than 1, Screen width multiply it
                          ------------------- // when greater than 1, actual characters' length
                          true,               // destroy immediately?
                                              // Buttons (@Nullable -> no buttons)
                          YES,

                          new Button(
                                "No",
                                true,
                                Window.rightDown,
                                YES.getWidth(), YES.getHeight(),
                                BasicFunctions.Action.borrow(
                                    YES.getAction(),
                                    YES.getAction().value,
                                    BasicVariables.Action.RETURN_N
                                )
                          )
                    );
                     */
                    Settings.setFormatterCustom( DateTimeFormatter.ISO_DATE_TIME );
                }

                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        TIME.getName(),
                        LocalDateTime.now().format( Settings.getFormatterCustom() ) +
                        STRING_REGEX_ENDL
                );
            } else if ( nextCommand.getName()
                                .equalsIgnoreCase( Objects.requireNonNull( TIME.getSuccessors()[ 1 ] ).getName() ) &&
                        TIME.getSuccessors()[ 1 ].getIsAsSubCommand() ) {

                /* FULL -> long format */
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        TIME.getName(),
                        LocalDateTime.now().format( Settings.getFormatterLong() ) +
                        STRING_REGEX_ENDL
                );
            } else {
                new ProcessIO.ProcessOutput(
                        STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                        TIME.getName(),
                        STRING_PROCESS_COMMANDS_ERR_ILLEGAL_COMMAND +
                        CHARACTER_COMMON_SYMBOLS_COLON + CHARACTER_COMMON_SYMBOLS_SPACE +
                        nextCommand.getName() + STRING_REGEX_ENDL
                );
            }
        }
    }


}
