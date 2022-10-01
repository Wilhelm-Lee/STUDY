package base.echo;

import base.essention.BasicFunctions;
import base.essention.BasicVariables;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class BasicOutput {

    public static final String CLASS_NAME = "BasicOutput";

    public BasicOutput(
            @NotNull String typeOfLog,
            @Nullable String content
    ) {
        log(
                typeOfLog,
                content
        );
    }

    public BasicOutput(
            @NotNull String typeOfLog,
            @NotNull String initiator,
            @Nullable String content
    ) {
        log(
                typeOfLog,
                initiator,
                content
        );
    }

    public BasicOutput(
            @NotNull String typeOfLog,
            Throwable initiator,
            @Nullable String content
    ) {
        log(
                typeOfLog,
                initiator,
                content
        );
    }

    public BasicOutput(
            @NotNull String typeOfLog,
            char costumeColor,
            @NotNull String content
    ) {
        log(
                typeOfLog,
                costumeColor,
                content
        );
    }

    public BasicOutput(
            @NotNull String typeOfLog,
            char costumeColor,
            @NotNull String initiator,
            @NotNull String content
    ) {
        log(
                typeOfLog,
                costumeColor,
                initiator,
                content
        );
    }

    public BasicOutput(
            Throwable initiator,
            @Nullable String content
    ) {
        log(
                initiator,
                content
        );
    }

    private void log(
            @NotNull String typeOfLog,
            @Nullable String content
    ) {

        if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_REQUEST.equalsIgnoreCase( typeOfLog ) ) {
            System.out.println( BasicFunctions.dyeing(
                    true,
                    BasicVariables.CHARACTER_TERMINAL_COLOR_CYAN
            ) + typeOfLog + ": " + content );
        } else {
            if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_INFO.equalsIgnoreCase( typeOfLog ) ) {
                System.out.println( BasicFunctions.dyeing(
                        true,
                        BasicVariables.CHARACTER_TERMINAL_COLOR_BLUE
                ) + typeOfLog + ": " + content );
            } else {
                if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_WARN.equalsIgnoreCase( typeOfLog ) ) {
                    System.out.println( BasicFunctions.dyeing(
                            true,
                            BasicVariables.CHARACTER_TERMINAL_COLOR_YELLOW
                    ) + typeOfLog + ": " + content );
                } else {
                    if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR.equalsIgnoreCase( typeOfLog ) ) {
                        System.out.println( BasicFunctions.dyeing(
                                true,
                                BasicVariables.CHARACTER_TERMINAL_COLOR_RED
                        ) + typeOfLog + ": " + content );
                    } else {
                        System.out.println( BasicFunctions.dyeing(
                                true,
                                BasicVariables.CHARACTER_TERMINAL_COLOR_RESET
                        ) + typeOfLog + ": " + content );
                    }
                }
            }
        }
    }

    private void log(
            @NotNull String typeOfLog,
            @NotNull String initiator,
            @Nullable String content
    ) {

        if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_REQUEST.equalsIgnoreCase( typeOfLog ) ) {
            System.out.print( BasicFunctions.dyeing(
                    true,
                    BasicVariables.CHARACTER_TERMINAL_COLOR_CYAN
            ) + typeOfLog + "(" + initiator + "): " + content );
        } else {
            if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_INFO.equalsIgnoreCase( typeOfLog ) ) {
                System.out.print( BasicFunctions.dyeing(
                        true,
                        BasicVariables.CHARACTER_TERMINAL_COLOR_BLUE
                ) + typeOfLog + "(" + initiator + "): " + content );
            } else {
                if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_WARN.equalsIgnoreCase( typeOfLog ) ) {
                    System.out.print( BasicFunctions.dyeing(
                            true,
                            BasicVariables.CHARACTER_TERMINAL_COLOR_YELLOW
                    ) + typeOfLog + "(" + initiator + "): " + content );
                } else {
                    if ( BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR.equalsIgnoreCase( typeOfLog ) ) {
                        System.out.print( BasicFunctions.dyeing(
                                true,
                                BasicVariables.CHARACTER_TERMINAL_COLOR_RED
                        ) + typeOfLog + "(" + initiator + "): " + content );
                    } else {
                        System.out.print( BasicFunctions.dyeing(
                                true,
                                BasicVariables.CHARACTER_TERMINAL_COLOR_RESET
                        ) + typeOfLog + "(" + initiator + "): " + content );
                    }
                }
            }
        }
    }

    /**
     * @Explaination The {@code content} exists
     * because {@code new BasicOutput( String, String, String )}
     * need {@code cause} here to be transferred into {@code String}.
     * But then {@code content} would duplicate it. So, {@code content}
     * could be {@code @Nullable}
     * @see #log(String, String, String)
     */
    private void log(
            @NotNull String typeOfLog,
            Throwable initiator,
            @Nullable String content
    ) {

        new BasicOutput(
                typeOfLog,
                initiator.getLocalizedMessage(),
                content
        );
    }

    /**
     * @Explaination The {@code content} exists
     * because {@code new BasicOutput( String, String, String )}
     * need {@code cause} here to be transferred into {@code String}.
     * But then {@code content} would duplicate it. So, {@code content}
     * could be {@code @Nullable}
     * @see #log(String, String, String)
     * @see #log(String, Throwable, String)
     */
    private void log(
            Throwable initiator,
            @Nullable String content
    ) {

        new BasicOutput(
                /* Default LOG TYPE */
                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                initiator.getLocalizedMessage(),
                content
        );
    }

    private void log(
            @NotNull String typeOfLog,
            char costumeColor,
            @NotNull String content
    ) {

        System.out.println( BasicFunctions.dyeing(
                true,
                costumeColor
        ) + typeOfLog + ": " + content );
    }

    private void log(
            @NotNull String typeOfLog,
            char costumeColor,
            @NotNull String initiator,
            @NotNull String content
    ) {

        System.out.println( BasicFunctions.dyeing(
                true,
                costumeColor
        ) + typeOfLog + "(" + initiator + "): " + content );
    }

}
