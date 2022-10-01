package work.speculator.extension;

import base.echo.BasicOutput;
import base.essention.BasicFunctions;
import base.essention.BasicVariables;
import base.exception.BasicException;
import base.execute.ProcessFile;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class Applications {

    public static final String CLASS_NAME = "Applications";

    private static final ProcessFile.FileCreator fc = new ProcessFile.FileCreator();

    public static class TodoList {

        public static final String CLASS_NAME = "TodoList";

        private static final TodoList todoList = new TodoList();
        /**
         * Due to Settings.HOME_PATH is not a constant variable, cannot use final here
         */
        public final String TODOLIST_FILE = "/TodoList.study";
        public final File TARGET_FILE = new File(
                BasicVariables.STRING_STUDY_PATH,
                TODOLIST_FILE
        );

        // S -?-> E
        private TodoList.@NotNull Item createScheduleS_E(
                String itemName,
                LocalDateTime itemTimeStampLocalDateTimeStart,
                LocalDateTime itemTimeStampLocalDateTimeEnd,
                int level
        ) {

            TodoList.Item newItem = new TodoList.Item();

            newItem.id = BasicVariables.getApplicationsTodoListItemIdLoadUp() + 1;
            newItem.itemName = itemName;
            newItem.itemDateTimeStartInSeconds = BasicFunctions.durationToSeconds(
                    itemTimeStampLocalDateTimeStart,
                    itemTimeStampLocalDateTimeEnd,
                    ZoneOffset.ofHours( BasicVariables.INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT )
            );
            newItem.itemDateTimeEndInSeconds = BasicFunctions.durationToSeconds(
                    itemTimeStampLocalDateTimeStart,
                    itemTimeStampLocalDateTimeEnd,
                    ZoneOffset.ofHours( BasicVariables.INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT )
            );
            newItem.level = level;

//            TODO: TimeLine.ProcessOutput(  )

            return newItem;
        }

        // ? -D-> E
        private TodoList.Item createSchedule_DE(
                String itemName,
                LocalDateTime itemTimeStampLocalDateTimeDuration,
                LocalDateTime itemTimeStampLocalDateTimeEnd,
                int level
        ) {

            TodoList.Item newItem = new TodoList.Item();
            LocalDateTime tmpLDTStart = LocalDateTime.of(
                    itemTimeStampLocalDateTimeEnd.getYear() - itemTimeStampLocalDateTimeDuration.getYear(),
                    itemTimeStampLocalDateTimeEnd.getMonthValue() - itemTimeStampLocalDateTimeDuration.getMonthValue(),
                    itemTimeStampLocalDateTimeEnd.getDayOfMonth() - itemTimeStampLocalDateTimeDuration.getDayOfMonth(),
                    itemTimeStampLocalDateTimeEnd.getHour() - itemTimeStampLocalDateTimeDuration.getHour(),
                    itemTimeStampLocalDateTimeEnd.getMinute() - itemTimeStampLocalDateTimeDuration.getMinute(),
                    itemTimeStampLocalDateTimeEnd.getSecond() - itemTimeStampLocalDateTimeDuration.getSecond(),
                    itemTimeStampLocalDateTimeEnd.getNano() - itemTimeStampLocalDateTimeDuration.getNano()
            );

            newItem.itemDateTimeStartInSeconds = BasicFunctions.durationToSeconds(
                    tmpLDTStart,
                    itemTimeStampLocalDateTimeEnd
            );

            return newItem;
        }

        // S -D-> ?
        private TodoList.Item createScheduleSD_(
                String itemName,
                LocalDateTime itemTimeStampLocalDateTimeStart,
                LocalDateTime itemTimeStampLocalDateTimeDuration,
                int level
        ) {

            TodoList.Item newItem = new TodoList.Item();
            LocalDateTime tmpLDTEnd = LocalDateTime.of(
                    itemTimeStampLocalDateTimeStart.getYear() + itemTimeStampLocalDateTimeDuration.getYear(),
                    itemTimeStampLocalDateTimeStart.getMonthValue() +
                            itemTimeStampLocalDateTimeDuration.getMonthValue(),
                    itemTimeStampLocalDateTimeStart.getDayOfMonth() +
                            itemTimeStampLocalDateTimeDuration.getDayOfMonth(),
                    itemTimeStampLocalDateTimeStart.getHour() + itemTimeStampLocalDateTimeDuration.getHour(),
                    itemTimeStampLocalDateTimeStart.getMinute() + itemTimeStampLocalDateTimeDuration.getMinute(),
                    itemTimeStampLocalDateTimeStart.getSecond() + itemTimeStampLocalDateTimeDuration.getSecond(),
                    itemTimeStampLocalDateTimeStart.getNano() + itemTimeStampLocalDateTimeDuration.getNano()
            );

            newItem.itemDateTimeStartInSeconds = BasicFunctions.durationToSeconds(
                    itemTimeStampLocalDateTimeStart,
                    tmpLDTEnd
            );

            return newItem;
        }

        public void onCreate() {

            // Use @isAnomalous to judge whether ProcessOutput(File, boolean) is anomalous -> true: false
            if ( !fc.onCreate(
                    todoList.TARGET_FILE,
                    false
            ) ) {
                // Where Exception happens
                new BasicOutput(
                        BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                        Applications.class.getName(),
                        new BasicException().getLocalizedMessage()
                );
            }
        }

        public static class Item {

            public static final String CLASS_NAME = "Item";
            private final TodoList.Item item = new TodoList.Item();
            private final TimeLine timeLine = null;
            public int level;
            public long id;
            public String itemName;
            public long itemDateTimeStartInSeconds;
            public long itemDateTimeEndInSeconds;

            public void onCreate(

            ) {
                // Initialize variables
                // TODO: 16/07/2022 Hi, William. Come and fix this! &#xD83D;&#xDE00;

            }

        }
    }
}