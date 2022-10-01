package base.enter;

import base.essention.BasicFunctions;
import base.essention.BasicVariables;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class BasicInput {

    public static final String CLASS_NAME = "BasicInput";
    public static final Scanner BASIC_SCANNER = new Scanner(
            System.in,
            StandardCharsets.UTF_8
    );

    private final @NotNull String inputResult;

    public BasicInput() {
        inputResult = recorder();
    }

    public BasicInput( @NotNull String typeOfInput ) {
        this.inputResult = recorder( typeOfInput );
    }

    public BasicInput(
            @NotNull String typeOfInput,
            @NotNull String initiator
    ) {
        this.inputResult = recorder(
                typeOfInput,
                initiator
        );
    }

    public String getInputResult() {
        return inputResult;
    }

    private @NotNull String recorder() {

        return BasicInput.BASIC_SCANNER.nextLine();
    }

    private @NotNull String recorder( @NotNull String typeOfInput ) {

        if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_REGULAR.equalsIgnoreCase( typeOfInput ) ) {
            System.out.print( BasicFunctions.dyeing(
                    true,
                    BasicVariables.CHARACTER_TERMINAL_COLOR_WHITE
            ) );
        } else {
            if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_ANSWER.equalsIgnoreCase( typeOfInput ) ) {
                System.out.print( BasicFunctions.dyeing(
                        true,
                        BasicVariables.CHARACTER_TERMINAL_COLOR_BLUE
                ) );
            } else {
                if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_REPLY_LOCAL.equalsIgnoreCase( typeOfInput ) ) {
                    System.out.print( BasicFunctions.dyeing(
                            true,
                            BasicVariables.CHARACTER_TERMINAL_COLOR_GREEN
                    ) );
                } else {
                    if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_REPLY_REMOTE.equalsIgnoreCase( typeOfInput ) ) {
                        System.out.print( BasicFunctions.dyeing(
                                true,
                                BasicVariables.CHARACTER_TERMINAL_COLOR_CYAN
                        ) );
                    } else {
                        System.out.print( BasicFunctions.dyeing(
                                true,
                                BasicVariables.CHARACTER_TERMINAL_COLOR_RESET
                        ) );
                    }
                }
            }
        }
        return BasicInput.BASIC_SCANNER.nextLine();
    }

    private @NotNull String recorder(
            @NotNull String typeOfInput,
            @NotNull String initiator
    ) {

        if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_REGULAR.equalsIgnoreCase( typeOfInput ) ) {
            System.out.print(
                    BasicFunctions.dyeing(
                            true,
                            BasicVariables.CHARACTER_TERMINAL_COLOR_WHITE
                    ) + typeOfInput + "(" + initiator +
                            "): " );
        } else {
            if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_ANSWER.equalsIgnoreCase( typeOfInput ) ) {
                System.out.print(
                        BasicFunctions.dyeing(
                                true,
                                BasicVariables.CHARACTER_TERMINAL_COLOR_BLUE
                        ) + typeOfInput + "(" +
                                initiator +
                                "): " );
            } else {
                if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_REPLY_LOCAL.equalsIgnoreCase( typeOfInput ) ) {
                    System.out.print(
                            BasicFunctions.dyeing(
                                    true,
                                    BasicVariables.CHARACTER_TERMINAL_COLOR_GREEN
                            ) + typeOfInput + "(" +
                                    initiator + "): " );
                } else {
                    if ( BasicVariables.STRING_BASIC_INPUT_RECORDER_TYPE_REPLY_REMOTE.equalsIgnoreCase( typeOfInput ) ) {
                        System.out.print(
                                BasicFunctions.dyeing(
                                        true,
                                        BasicVariables.CHARACTER_TERMINAL_COLOR_CYAN
                                ) + typeOfInput + "(" +
                                        initiator + "): " );
                    } else {
                        System.out.print(
                                BasicFunctions.dyeing(
                                        true,
                                        BasicVariables.CHARACTER_TERMINAL_COLOR_RESET
                                ) + typeOfInput + "(" +
                                        initiator + "): " );
                    }
                }
            }
        }
        return BasicInput.BASIC_SCANNER.nextLine();
    }
}
