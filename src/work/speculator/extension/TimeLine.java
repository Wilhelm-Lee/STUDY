package work.speculator.extension;

import base.echo.BasicOutput;
import base.essention.BasicFunctions;
import base.essention.BasicVariables;
import base.execute.ProcessFile;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
class TimeLine {

    public static final String CLASS_NAME = "TimeLine";
    private static final ProcessFile.FileCreator FILE_CREATOR = new ProcessFile.FileCreator();
    private static final TimeLine TIME_LINE = new TimeLine();
    private final String FILE_NAME_EXTENSION = BasicVariables.CHARACTER_COMMON_SYMBOLS_PERIOD + TimeLine.class.getName();
    private final File TARGET_FILE = new File(
            BasicVariables.STRING_STUDY_PATH,
            String.valueOf( BasicVariables.getTimeLineIdLoadUp() )
    );
    public long startTimeStampInSeconds = 0L, endTimeStampInSeconds = 0L;
    public long length = 0L;
    public String fileNameBase = null;

    private static void preparation(
            LocalDateTime startTimeStamp,
            LocalDateTime endTimeStamp
    ) {

        try {
            TIME_LINE.length = BasicFunctions.durationToSeconds(
                    startTimeStamp,
                    endTimeStamp,
                    ZoneOffset.ofHours( BasicVariables.INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT )
            );
            TIME_LINE.startTimeStampInSeconds = BasicFunctions.durationToSeconds(
                    BasicVariables.LOCAL_DATE_TIME_META_YEAR,
                    startTimeStamp,
                    ZoneOffset.ofHours( BasicVariables.INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT )
            );
            TIME_LINE.endTimeStampInSeconds = BasicFunctions.durationToSeconds(
                    BasicVariables.LOCAL_DATE_TIME_META_YEAR,
                    endTimeStamp,
                    ZoneOffset.ofHours( BasicVariables.INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT )
            );

            // Create new file(s) for newTimeLine & Output procession result (Success or not)
            if ( FILE_CREATOR.onCreate(
                    TIME_LINE.TARGET_FILE,
                    false
            ) ) {
                new BasicOutput(
                        BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_INFO,
                        ProcessFile.FileCreator.class.getName(),
                        BasicVariables.STRING_FILE_MANAGER_FILE_CREATING_SUCCESS
                );
            }

        } catch ( Exception e ) {

            new BasicOutput(
                    BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                    TimeLine.class.getName(),
                    e.getLocalizedMessage()
            );
        }

    }

    public static TimeLine onCreate(
            LocalDateTime startTimeStamp,
            LocalDateTime endTimeStamp,
            long length
    ) {

        TimeLine newTimeLine = new TimeLine();

        TimeLine.preparation(
                startTimeStamp,
                endTimeStamp
        );

        /* Everything's fine, let's go!
         *  Initialize @newTimeLine
         */

        TIME_LINE.fileNameBase = String.valueOf( BasicVariables.getTimeLineIdLoadUp() );

        newTimeLine.length = length;
        newTimeLine.startTimeStampInSeconds = BasicFunctions.durationToSeconds(
                BasicVariables.LOCAL_DATE_TIME_META_YEAR,
                startTimeStamp
        );
        newTimeLine.endTimeStampInSeconds = BasicFunctions.durationToSeconds(
                BasicVariables.LOCAL_DATE_TIME_META_YEAR,
                endTimeStamp
        );

        return newTimeLine;
    }
}
