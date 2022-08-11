package study.processors;

import study.output.BasicOutput;
import study.storage.BasicVariables;
import org.jetbrains.annotations.NotNull;

/**
 * @author william
 */
public class ProcessIO {

	public static final @NotNull String CLASS_NAME = "ProcessIO";

	public static class ProcessInput {

		public static final @NotNull String CLASS_NAME = "ProcessInput";

		public int onCreate( @NotNull String userInputRaw ) {

			return ProcessCommand.onCreate( userInputRaw.split( String.valueOf( BasicVariables.SPACE ) ) );

		}

	}

	public static class ProcessOutput {

		public static final @NotNull String CLASS_NAME = "ProcessOutput";

		public void onCreate(
				@NotNull String outputType,
				@NotNull String userOutputRaw
		) {

			BasicOutput.log(
					outputType,
					userOutputRaw
			);

		}

		public void onCreate(
				@NotNull String outputType,
				@NotNull String initiator,
				@NotNull String userOutputRaw
		) {

			BasicOutput.log(
					outputType,
					initiator,
					userOutputRaw
			);

		}

	}

}
