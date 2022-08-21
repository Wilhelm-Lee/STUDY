package study.processors;

import org.jetbrains.annotations.NotNull;
import study.storage.BasicVariables;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Scanner;

/**
 * @author william
 */
public class ProcessCommand {

	public static final @NotNull String CLASS_NAME = "ProcessCommand";

	private ProcessCommand() {
	}

	public static int onCreate( String[] userInput ) {

		for ( String cmdIdx : userInput ) {

			int rtnCode = process( cmdIdx );

			if ( rtnCode != 0 ) {
				return rtnCode;
			}

		}

		return 0;

	}

	private static int process( String cmd ) {

		ProcessIO.ProcessOutput processOutput = new ProcessIO.ProcessOutput();

		if ( !cmd.isEmpty() ) {

			if ( cmd.equalsIgnoreCase( BasicVariables.CommandSet.HELP ) ) {
				processOutput.onCreate(
						BasicVariables.BASIC_OUTPUT_LOG_TYPE_INFO,
						BasicVariables.CommandSet.DOC_ABOUT +
								BasicVariables.CommandSet.DOC_HELP
				);

				return BasicVariables.ConsoleReturn.NORMAL;

			} else if ( cmd.equalsIgnoreCase( BasicVariables.CommandSet.EXIT ) ) {
				return BasicVariables.ConsoleReturn.EXIT_CODE;

			} else if ( cmd.equalsIgnoreCase( BasicVariables.CommandSet.TIME ) ) {
				processOutput.onCreate(
						BasicVariables.BASIC_OUTPUT_LOG_TYPE_INFO,
						cmdTime().toString()
				);
				return BasicVariables.ConsoleReturn.NORMAL;

			} else {
				processOutput.onCreate(
						BasicVariables.BASIC_OUTPUT_LOG_TYPE_ERROR,
						BasicVariables.CommandSet.CMD_NOT_FOUND
				);

				return BasicVariables.ConsoleReturn.ERR_ILLEGAL_INPUT;

			}

		}

		return BasicVariables.ConsoleReturn.ERR_ILLEGAL_INPUT_ALTERNATE;

	}

	private static LocalDateTime cmdTime() {

		return LocalDateTime.now( ZoneOffset.ofHours( BasicVariables.TIME_ZONE_OFFSET_EAST_EIGHT ) );

	}

	// TODO: I THINK ALL THE CMD SHOULD HAVE THEIR OWN CLASS

	/**
	 * This method is intended to be used when pattern "help xxx" appears.
	 * Used to investigate more function about cmd HELP
	 *
	 * @Explaination The reason why do not I use :? is because once I add
	 * or remove some expression from it, it is going to
	 * be a massive work to do.
	 * Especially when writing {@code default} section.
	 */
	private static String cmdHelp( String helpCmd ) {

		// TODO: Use ProcessIO.java instead

		final String INPUT = helpCmd.toUpperCase();

		return switch ( INPUT ) {
			case "ABOUT" -> BasicVariables.CommandSet.DOC_ABOUT;
			case "HELP" -> BasicVariables.CommandSet.DOC_HELP;
			default -> BasicVariables.CommandSet.CMD_NOT_FOUND;
		};

	}

	public static class Help {

		public static final @NotNull String CLASS_NAME = "Help";
		Help h = new Help();

		private Help() {
		}

		public void onCreate( String in ) {


			try ( Scanner scn = new Scanner( in ) ) {

				String next = scn.next();

			}
		}
	}

}
