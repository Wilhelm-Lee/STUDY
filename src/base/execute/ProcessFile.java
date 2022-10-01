package base.execute;

import base.echo.BasicOutput;
import base.enter.BasicInput;
import base.essention.BasicVariables;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class ProcessFile {

    public static final String CLASS_NAME = "ProcessFile";

    private ProcessFile() {
    }

    public static class FileCreator {

        public static final String CLASS_NAME = "FileCreator";

        final List<String> cmd = new ArrayList<>( 0 );
        Runtime runtime;
        Process process;
        boolean isAllRight = true;

        private boolean ifAsk(
                @NotNull File targetObject
        ) {

            new BasicOutput(
                    BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_REQUEST,
                    targetObject.isFile()
                    ? BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_HOW_WOULD_YOU_LIKE_TO +
                            /* Specific Action by @CLASS_NAME (down) */
                            BasicVariables.STRING_FILE_MANAGER_ACTIONS_CREATING +
                      BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_FILE +
                      targetObject.getAbsoluteFile() +
                      BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_QUESTIONMARK_YN
                    : BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_HOW_WOULD_YOU_LIKE_TO +
                      BasicVariables.STRING_FILE_MANAGER_ACTIONS_CREATING +
                      BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_PATH +
                      targetObject.getAbsolutePath() +
                      BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_QUESTIONMARK_YN
            );

            final String ans = new BasicInput(
                    BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_QUESTIONMARK_YN ).getInputResult();

            return BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_YES.equalsIgnoreCase( ans )
                    || BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_Y.equalsIgnoreCase( ans );
        }

        private void creating(
                @NotNull File targetObject,
                @NotNull String targetType,
                boolean ifAskNeeded
        ) {

            try {

                cmd.clear();

                if ( BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_FILE.equalsIgnoreCase( targetType ) ) {
                    cmd.add( BasicVariables.STRING_LINUX_COMMAND_TOUCH );
                    cmd.add( targetObject.getAbsolutePath() );
                } else {
                    cmd.add( BasicVariables.STRING_LINUX_COMMAND_MKDIR );
                    cmd.add( "-p" );
                    cmd.add( targetObject.getAbsolutePath() );
                }

                // if not exists
                if ( !targetObject.exists() ) {
                    // Then create it
                    // Ask
                    if ( ifAskNeeded ) {
                        if ( ifAsk( targetObject ) ) {
                            runtime = Runtime.getRuntime();
                            process = runtime.exec( cmd.toArray( new String[ 0 ] ) );
                        } else {
                            requestDenied(
                                    BasicVariables.STRING_FILE_MANAGER_ACTIONS_CREATING,
                                    targetObject,
                                    targetType
                            );
                        }
                    } else {
                        runtime = Runtime.getRuntime();
                        process = runtime.exec( cmd.toArray( new String[ 0 ] ) );
                    }
                } else {
                    new BasicOutput(
                            BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                            targetType.toUpperCase() +
                                    targetObject.getAbsoluteFile() +
                                    BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_HAD_ALREADY_EXISTED
                    );
                }
            } catch ( IOException ioe ) {
                new BasicOutput(
                        BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                        FileCreator.class.getName(),
                        ioe.getLocalizedMessage()
                );
            }
        }

        /**
         *
         * @param action       Specify the action what user did as an object of request denial
         * @param targetObject Specify the targetObject of what user did as an object of request denial
         * @param targetType   Specify the targetType of the targetObject of what user did as an object of request denial
         */
        private void requestDenied(
                @NotNull String action,
                @NotNull File targetObject,
                String targetType
        ) {

            new BasicOutput(
                    BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_WARN,
                    action +
                            targetType +
                            targetObject +
                            BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_FAILED_CAUSED_AND_CANCELED_BY_USER
                    // TODO: + USER.getName() which requires USER_MANAGEMENT_SYSTEM, release in future versions
            );
        }

        /**
         * boolean checkExistence( @NotNull File, @NotNull String ) is temporarily
         * inverted in use due to the lack of callers.
         *
         * @param targetObject Check the existence of the targetObject as user specified
         * @param targetType   The targetType of checks(n.) of the existence of the targetObject as user specified
         */
        private boolean checkExistence(
                @NotNull File targetObject,
                @NotNull String targetType
        ) {

            return BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_FILE.equalsIgnoreCase( targetType )
                   ? targetObject.getAbsoluteFile()
                           .exists()
                   : targetObject.exists();
        }

        public boolean onCreate(
                File targetFile,
                boolean ifAskNeeded
        ) {

            try {
                if ( !checkExistence(
                        new File( targetFile.getParent() ),
                        BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_PATH
                ) ) {
                    isAllRight = false;

                    new BasicOutput(
                            BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_WARN,
                            BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_TARGET_PATH_DOES_NOT_EXIST
                    );

                    creating(
                            new File( targetFile.getParent() ),
                            BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_PATH,
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
                    new BasicOutput(
                            BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                            BasicVariables.STRING_TARGET +
                            BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_PATH +
                            new File( targetFile.getParent() ).getAbsoluteFile() +
                            BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_HAD_ALREADY_EXISTED
                    );
                    // Judge whether the targetFile exists or not
                    if ( !checkExistence(
                            targetFile.getAbsoluteFile(),
                            BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_FILE
                    ) ) {
                        isAllRight = false;
                        new BasicOutput(
                                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_WARN,
                                BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_TARGET_FILE_DOES_NOT_EXIST
                        );
                        creating(
                                targetFile.getAbsoluteFile(),
                                BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_FILE,
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
                        new BasicOutput(
                                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                                BasicVariables.STRING_TARGET +
                                BasicVariables.STRING_FILE_MANAGER_TARGET_TYPE_FILE +
                                targetFile.getAbsoluteFile() +
                                BasicVariables.STRING_FILE_MANAGER_OUTPUT_TEXT_HAD_ALREADY_EXISTED
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

                new BasicOutput(
                        BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                        FileCreator.class.getName(),
                        e.getLocalizedMessage()
                );
                isAllRight = false;
                return false;
            }
            isAllRight = true;
            return true;
        }
    }
}
