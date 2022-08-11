package study.processors;

import study.input.BasicInput;
import study.output.BasicOutput;
import study.storage.BasicVariables;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author william
 */
public class ProcessFile {

	public static final String CLASS_NAME = "ProcessFile";

	public static class FileCreator {

		public static final String CLASS_NAME = "FileCreator";

		List<String> cmd = new ArrayList<>( 0 );
		Runtime runtime;
		Process process;
		boolean isAllRight = true;

		private boolean ifAsk(
				@NotNull File targetObject
		) {

			BasicOutput.log(
					BasicVariables.BASIC_OUTPUT_LOG_TYPE_REQUEST,
					targetObject.isFile()
							? BasicVariables.FILE_MANAGER_OUTPUT_TEXT_HOW_WOULD_YOU_LIKE_TO +
							/* Specific Action by @CLASS_NAME (down) */
							  BasicVariables.FILE_MANAGER_ACTIONS_CREATING +
							  BasicVariables.FILE_MANAGER_TARGET_TYPE_FILE_STRING +
							  targetObject.getAbsoluteFile() +
							  BasicVariables.FILE_MANAGER_OUTPUT_TEXT_QUESTIONMARK_YN
							: BasicVariables.FILE_MANAGER_OUTPUT_TEXT_HOW_WOULD_YOU_LIKE_TO +
							  BasicVariables.FILE_MANAGER_ACTIONS_CREATING +
							  BasicVariables.FILE_MANAGER_TARGET_TYPE_PATH_STRING +
							  targetObject.getAbsolutePath() +
							  BasicVariables.FILE_MANAGER_OUTPUT_TEXT_QUESTIONMARK_YN
			);

			final String ans = BasicInput.recorder( BasicVariables.FILE_MANAGER_OUTPUT_TEXT_QUESTIONMARK_YN );

			return BasicVariables.FILE_MANAGER_OUTPUT_TEXT_YES.equalsIgnoreCase( ans )
				   || BasicVariables.FILE_MANAGER_OUTPUT_TEXT_Y.equalsIgnoreCase( ans );
		}

		private void creating(
				@NotNull File targetObject,
				@NotNull String targetType,
				boolean ifAskNeeded
		) {

			try {

				cmd.clear();

				if ( BasicVariables.FILE_MANAGER_TARGET_TYPE_FILE_STRING.equalsIgnoreCase( targetType ) ) {
					cmd.add( BasicVariables.LINUX_COMMAND_TOUCH );
					cmd.add( targetObject.getAbsolutePath() );
				} else {
					cmd.add( BasicVariables.LINUX_COMMAND_MKDIR );
					// the flag
					cmd.add( "-p" );
					cmd.add( targetObject.getAbsolutePath() );
				}

				// if not exists
				if ( ! targetObject.exists() ) {
					// Then create it
					// Ask
					if ( ifAskNeeded ) {
						if ( ifAsk( targetObject ) ) {
							runtime = Runtime.getRuntime();
							process = runtime.exec( cmd.toArray( new String[ 0 ] ) );
						} else {
							requestDenied(
									BasicVariables.FILE_MANAGER_ACTIONS_CREATING,
									targetObject,
									targetType
							);
						}
					} else {
						runtime = Runtime.getRuntime();
						process = runtime.exec( cmd.toArray( new String[ 0 ] ) );
					}
				} else {
					BasicOutput.log(
							BasicVariables.BASIC_OUTPUT_LOG_TYPE_INFO,
							targetType.toUpperCase() +
							targetObject.getAbsoluteFile() +
							BasicVariables.FILE_MANAGER_OUTPUT_TEXT_HAD_ALREADY_EXISTED
					);
				}
			} catch ( IOException ioe ) {
				BasicOutput.log(
						BasicVariables.BASIC_OUTPUT_LOG_TYPE_ERROR,
						FileCreator.CLASS_NAME,
						ioe.getLocalizedMessage()
				);
			}
		}

		private void requestDenied(
				@NotNull String action,
				@NotNull File targetObject,
				String targetType
		) {

			BasicOutput.log(
					BasicVariables.BASIC_OUTPUT_LOG_TYPE_WARN,
					action +
					targetType +
					targetObject +
					BasicVariables.FILE_MANAGER_OUTPUT_TEXT_FAILED_CAUSED_AND_CANCELED_BY_USER
			);
		}

		private boolean checkExistence(
				@NotNull File targetObject,
				@NotNull String targetType
		) {

			return BasicVariables.FILE_MANAGER_TARGET_TYPE_FILE_STRING.equalsIgnoreCase( targetType )
					? targetObject.getAbsoluteFile().exists()
					: targetObject.exists();
		}

		public boolean onCreate(
				File targetFile,
				boolean ifAskNeeded
		) {

			try {
				if ( ! checkExistence(
						new File( targetFile.getParent() ),
						BasicVariables.FILE_MANAGER_TARGET_TYPE_PATH_STRING
				) ) {
					isAllRight = false;

					BasicOutput.log(
							BasicVariables.BASIC_OUTPUT_LOG_TYPE_WARN,
							BasicVariables.FILE_MANAGER_OUTPUT_TEXT_TARGET_PATH_DOES_NOT_EXIST
					);

					creating(
							new File( targetFile.getParent() ),
							BasicVariables.FILE_MANAGER_TARGET_TYPE_PATH_STRING,
							ifAskNeeded
					);
					// Retry
					onCreate(
							targetFile.getAbsoluteFile(),
							ifAskNeeded
					);
					// Actually, it does not need to be getAbsoluteFile(), just original targetFile would also be fine
				} else {
					isAllRight = true;
					BasicOutput.log(
							BasicVariables.BASIC_OUTPUT_LOG_TYPE_INFO,
							BasicVariables.TARGET +
							BasicVariables.FILE_MANAGER_TARGET_TYPE_PATH_STRING +
							new File( targetFile.getParent() ).getAbsoluteFile() +
							BasicVariables.FILE_MANAGER_OUTPUT_TEXT_HAD_ALREADY_EXISTED
					);
					// Judge whether the targetFile exists or not
					if ( ! checkExistence(
							targetFile.getAbsoluteFile(),
							BasicVariables.FILE_MANAGER_TARGET_TYPE_FILE_STRING
					) ) {
						isAllRight = false;
						BasicOutput.log(
								BasicVariables.BASIC_OUTPUT_LOG_TYPE_WARN,
								BasicVariables.FILE_MANAGER_OUTPUT_TEXT_TARGET_FILE_DOES_NOT_EXIST
						);
						creating(
								targetFile.getAbsoluteFile(),
								BasicVariables.FILE_MANAGER_TARGET_TYPE_FILE_STRING,
								ifAskNeeded
						);
						// Retry
						onCreate(
								targetFile.getAbsoluteFile(),
								ifAskNeeded
						);
					} else {
						// targetFile exists
						isAllRight = true;
						BasicOutput.log(
								BasicVariables.BASIC_OUTPUT_LOG_TYPE_INFO,
								BasicVariables.TARGET +
								BasicVariables.FILE_MANAGER_TARGET_TYPE_FILE_STRING +
								targetFile.getAbsoluteFile() +
								BasicVariables.FILE_MANAGER_OUTPUT_TEXT_HAD_ALREADY_EXISTED
						);
					}
				}
			} catch ( Exception e ) {

					/*
					  This case should not happen, because once
					  there were a File or Path does not exist,
					  preparation() would solve it by trying
					  recursively.
					  This is an exception-like reporting code
					  */

				BasicOutput.log(
						BasicVariables.BASIC_OUTPUT_LOG_TYPE_ERROR,
						FileCreator.CLASS_NAME,
						e.getLocalizedMessage()
				);
				return isAllRight = false;
			}
			return isAllRight = true;
		}
	}
}
