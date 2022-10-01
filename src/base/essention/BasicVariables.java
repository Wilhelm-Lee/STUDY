package base.essention;

import base.essention.exegesis.ProjectPrivacy;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
@ProjectPrivacy( level = 1 )
public class BasicVariables {

    /* RX == Regex == Regular Expression */

    public static final char CHARACTER_COMMON_SYMBOLS_COLON = ':';
    public static final char CHARACTER_COMMON_SYMBOLS_SEMICOLON = ';';
    public static final char CHARACTER_COMMON_SYMBOLS_PERIOD = '.';
    public static final char CHARACTER_COMMON_SYMBOLS_COMMA = ',';
    public static final char CHARACTER_COMMON_SYMBOLS_SPACE = ' ';
    public static final String STRING_COMMON_SYMBOLS_SPACE = " ";
    public static final String STRING_COMMON_SYMBOLS_EMPTY = "";
    public static final char CHARACTER_COMMON_SYMBOLS_SLASH = '/';
    public static final char CHARACTER_COMMON_SYMBOLS_QUESTIONMARK = '?';
    public static final char CHARACTER_COMMON_SYMBOLS_MINUS = '-';
    public static final char CHARACTER_COMMON_SYMBOLS_EQUAL = '=';
    public static final String STRING_REGEX_ENDL = "\n";
    public static final String STRING_REGEX_TABULATION = "\t";
    public static final String STRING_ABOUT_PROJECT_NAME = "Study";
    public static final String STRING_ABOUT_PROJECT_VERSION = "Sep29th2022_EDGE_TO_PROTOTYPE";
    public static final String STRING_ABOUT_PROJECT_AUTHOR_NAME = "William Pascal";
    public static final String STRING_ABOUT_PROJECT_AUTHOR_GITHUB = "https://github.com/WilliamPascal/Study";
    public static final String STRING_PROCESS_COMMANDS_ERR_DID_NOT_FIND_DONE =
            "Did not find \"DONE\"" + STRING_COMMON_SYMBOLS_EMPTY;
    public static final String STRING_PROCESS_COMMANDS_ERR_ILLEGAL_COMMAND = "Illegal command";
    public static final String STRING_TARGET = "Target" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_TARGET_TYPE_FILE =
            "File" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_TARGET_TYPE_PATH =
            "Path" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_TARGET_FILE_DOES_NOT_EXIST =
            "Target file does not exist" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_TARGET_PATH_DOES_NOT_EXIST =
            "Target path does not exist" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_HAD_ALREADY_EXISTED =
            BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE + "had already existed";
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_FAILED_CAUSED_AND_CANCELED_BY_USER =
            BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE + "failed, caused & canceled by user";
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_HOW_WOULD_YOU_LIKE_TO =
            "How would you like to" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_QUESTIONMARK_YN =
            CHARACTER_COMMON_SYMBOLS_SPACE + CHARACTER_COMMON_SYMBOLS_QUESTIONMARK + CHARACTER_COMMON_SYMBOLS_SPACE +
            "y/n";
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_Y = "Y";
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_YES = "YES";
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_N = "N";
    public static final String STRING_FILE_MANAGER_OUTPUT_TEXT_NO = "NO";
    public static final String STRING_FILE_MANAGER_ACTIONS_CREATING =
            "CREATING" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_FILE_CREATING_SUCCESS =
            "File Creating Succeed" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_FILE_MANAGER_FILE_CREATING_FAILED =
            "File Creating Failed" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
    public static final String STRING_LINUX_COMMAND_TOUCH = "touch";
    public static final String STRING_LINUX_COMMAND_MKDIR = "mkdir";
    public static final int INTEGER_META_YEAR = 1970;
    public static final LocalDateTime LOCAL_DATE_TIME_META_YEAR = LocalDateTime.of(
            // YEAR
            INTEGER_META_YEAR,
            // MONTH
            1,
            // DATE
            1,
            // HOUR
            0,
            // MINUTE
            0,
            // SECOND
            0,
            // NANO SECOND
            0
    );
    public static final int INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT = 8;
    public static final String STRING_CHARACTER_TERMINAL_COLOR_DEFAULT_CODE_BEFORE_COLOR_CONTENT = "\033[";
    public static final String STRING_CHARACTER_TERMINAL_COLOR_DEFAULT_CODE_AFTER_COLOR_CONTENT = "m";
    /*
     * [ TABLE ColorArrangement ]
     *
     * *---------------------------------------------------------------------------------*
     * |               COLOR    BELONG_TO        TYPE    NOTE                            |
     * +---------------------------------------------------------------------------------+
     * |                CYAN    -> Request       <OUT>                                   |
     * |                BLUE    -> Info          <OUT>                                   |
     * |              YELLOW    -> Warn          <OUT>                                   |
     * |                 RED    -> Error         <OUT>                                   |
     * |               White    -> Regular       <IN>                                    |
     * |                Blue    -> Ans           <IN>                                    |
     * |               Green    -> Debug         <OUT>                                   |
     * |       GREEN(Ground)    -> Reply-Local   <IN>    Not Scheduled To Use Yet        |
     * |           CYAN(Sky)    -> Reply-Remote  <IN>    Not Scheduled To Use Yet        |
     * *---------------------------------------------------------------------------------*
     * ...............................................................Sep 29th, 2022.....
     */
    /**
     * Hello are you happy people?    -- Droopy Dog (1943 - 1958)
     */
    public static final String STRING_BASIC_OUTPUT_LOG_TYPE_REQUEST = "Request";
    public static final String STRING_BASIC_OUTPUT_LOG_TYPE_DEBUG = "Debug";
    public static final String STRING_BASIC_OUTPUT_LOG_TYPE_NONE = STRING_COMMON_SYMBOLS_EMPTY;
    public static final String STRING_BASIC_OUTPUT_LOG_TYPE_INFO = "Info";
    public static final String STRING_BASIC_OUTPUT_LOG_TYPE_WARN = "Warning";
    public static final String STRING_BASIC_OUTPUT_LOG_TYPE_ERROR = "Error";
    public static final String STRING_BASIC_INPUT_RECORDER_TYPE_REGULAR = "Regular";
    public static final String STRING_BASIC_INPUT_RECORDER_TYPE_ANSWER = "Answer";
    public static final String STRING_BASIC_INPUT_RECORDER_TYPE_REPLY_LOCAL = "Reply_Local";
    public static final String STRING_BASIC_INPUT_RECORDER_TYPE_REPLY_REMOTE = "Reply_Remote";
    public static final String STRING_BASIC_OUTPUT_LOG_FORMAT_COLOR_FRONT = "3";
    public static final String STRING_BASIC_OUTPUT_LOG_FORMAT_COLOR_BACK = "4";
    public static final String STRING_BASIC_OUTPUT_LOG_FORMAT_FRONT = "Front";
    /**
     * {@code CHARACTER_TERMINAL_COLOR_RESET}: As what previous one was,
     * for the sections of which the both which are {@code Front}|{@code Back} and {@code color}
     */
    public static final char CHARACTER_TERMINAL_COLOR_BLACK = '0';
    public static final char CHARACTER_TERMINAL_COLOR_RED = '1';
    public static final char CHARACTER_TERMINAL_COLOR_GREEN = '2';
    public static final char CHARACTER_TERMINAL_COLOR_YELLOW = '3';
    public static final char CHARACTER_TERMINAL_COLOR_BLUE = '4';
    public static final char CHARACTER_TERMINAL_COLOR_MAGENTA = '5';
    public static final char CHARACTER_TERMINAL_COLOR_CYAN = '6';
    public static final char CHARACTER_TERMINAL_COLOR_WHITE = '7';
    public static final char CHARACTER_TERMINAL_COLOR_RESET = '8';
    public static final int INTEGER_APPLICATIONS_TODOLIST_ITEM_URGENCY_LEVEL_NONE = 0;
    public static final int INTEGER_APPLICATIONS_TODOLIST_ITEM_URGENCY_LEVEL_NORMAL = 1;
    public static final int INTEGER_APPLICATIONS_TODOLIST_ITEM_URGENCY_LEVEL_IMPOTENT = 2;
    public static final int INTEGER_APPLICATIONS_TODOLIST_ITEM_URGENCY_LEVEL_URGENT = 3;
    public static final int INTEGER_APPLICATIONS_TODOLIST_ITEM_URGENCY_LEVEL_SERIOUS = 4;
    public static final int INTEGER_APPLICATIONS_TODOLIST_ITEM_URGENCY_LEVEL_IMMEDIATE = 5;
    public static final String STRING_USER_NAME = System.getProperty( "user.name" );
    public static final String STRING_HOME_PATH =
            "/home" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SLASH + STRING_USER_NAME;
    public static final String STRING_STUDY_PATH =
            STRING_HOME_PATH + BasicVariables.STRING_DOCUMENTS_PATH + "/StudyFiles";
    public static final String STRING_DOCUMENTS_PATH = "/Documents";
    public static final int INTEGER_COMMANDS_AMOUNT = 256; // TODO: set to actual number when basic commands were settled
    public static final String STRING_DEFAULT_COMMANDS_COMMENT = "...";
    private static long applicationsTodoListItemIdLoadUp = 1;
    private static long timeLineIdLoadUp = 1;

    private BasicVariables() {
        throw new UnsupportedOperationException();
    }

    /**
     * Starts from 1
     */
    public static long getApplicationsTodoListItemIdLoadUp() {
        return applicationsTodoListItemIdLoadUp;
    }

    public static void setApplicationsTodoListItemIdLoadUp( long applicationsTodoListItemIdLoadUp ) {
        BasicVariables.applicationsTodoListItemIdLoadUp = applicationsTodoListItemIdLoadUp;
    }

    public static long getTimeLineIdLoadUp() {
        return timeLineIdLoadUp;
    }

    public static void setTimeLineIdLoadUp( long timeLineIdLoadUp ) {
        BasicVariables.timeLineIdLoadUp = timeLineIdLoadUp;
    }

    @ProjectPrivacy( level = 1 )
    public static class Exceptions {

        public static final @NotNull String ILLEGAL_INPUT = "ILLEGAL INPUT" + STRING_REGEX_ENDL;

        private Exceptions() {
            throw new UnsupportedOperationException();
        }
    }

    @ProjectPrivacy( level = 1 )
    public static class ConsoleReturn {

        public static final @NotNull String STRING_ERR_CODE =
                "ERR CODE:" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
        public static final int INTEGER_RETURN_CODE_NORMAL = 0;
        public static final int INTEGER_RETURN_CODE_ERR_ILLEGAL_INPUT = 1;
        public static final int INTEGER_RETURN_CODE_ERR_ILLEGAL_INPUT_UNKNOWN = 2;
        public static final int INTEGER_RETURN_CODE_EXIT_CODE = -1;

        private ConsoleReturn() {
            throw new UnsupportedOperationException();
        }

        public static boolean isErrCode( int code ) {
            return ( code == INTEGER_RETURN_CODE_ERR_ILLEGAL_INPUT ||
                     code == INTEGER_RETURN_CODE_ERR_ILLEGAL_INPUT_UNKNOWN
            );
        }
    }
}
