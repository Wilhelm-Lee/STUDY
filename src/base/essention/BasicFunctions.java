package base.essention;

import base.essention.exegesis.ProjectPrivacy;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static base.essention.BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;

/**
 * @author william
 */
@ProjectPrivacy( level = 1 )
public class BasicFunctions {

    // All method should be written in form of Recursive-Call if possible

    private BasicFunctions() {
        throw new UnsupportedOperationException();
    }

    /* PERMEATE CODE: */
    public static final @NotNull String CLASS_NAME = "BasicFunctions";

    /**
     * Calculation
     */
    public static int getBitOn(
            int number,
            int index
    ) {

        if ( index == 1 ) {
            return number % 10;
        } else {
            return getBitOn(
                    number / 10,
                    index - 1
            );
        }
    }

    public static int delta(
            int valueA,
            int valueB
    ) {

        return Math.abs( valueA - valueB );
    }

    /**
     * @Formular {@code GCD(above, below)} * {@code LCM(above, below)} = above * below
     * @HOWDOESITWORKS When {@code above} times {@code below}, it equals as the value of
     * the GreatestCommonDivisor of {@code above} and {@code below} times
     * the LeastCommonMultiple of {@code above} and {@code below}.
     * @see #leastCommonMultiple(int, int)
     **/
    public static int greatestCommonDivisor(
            int above,
            int below
    ) {

        if ( below == 0 ) {
            return above;
        } else {
            return greatestCommonDivisor(
                    below,
                    above % below
            );
        }
    }

    /**
     * @Formular {@code GCD(above, below)} * {@code LCM(above, below)} = above * below
     * @HOWDOESITWORKS When {@code above} times {@code below}, it equals as the value of
     * the GreatestCommonDivisor of {@code above} and {@code below} times
     * the LeastCommonMultiple of {@code above} and {@code below}.
     * @see #greatestCommonDivisor(int, int)
     **/
    public static int leastCommonMultiple(
            int above,
            int below
    ) {

        return ( above * below ) / BasicFunctions.greatestCommonDivisor(
                above,
                below
        );
    }

    /**
     * Date & Time
     */
    public static boolean isLeapYear( long prolepticYear ) {
        // Taken from IsoChronology.java
        return ( ( prolepticYear & 3 ) == 0 ) && ( ( prolepticYear % 100 ) != 0 || ( prolepticYear % 400 ) == 0 );
    }

    public static long durationToSeconds(
            @NotNull LocalDateTime from,
            @NotNull LocalDateTime to,
            @NotNull ZoneOffset zoneOffset
    ) {

        return ZonedDateTime.of(
                        delta(
                                from.getYear(),
                                to.getYear()
                        ) + BasicVariables.INTEGER_META_YEAR,
                        delta(
                                from.getMonthValue(),
                                to.getMonthValue()
                        ) + 1,
                        delta(
                                from.getDayOfMonth(),
                                to.getDayOfMonth() + 1
                        ),
                        delta(
                                from.getHour(),
                                to.getHour()
                        ) + ( zoneOffset.getTotalSeconds() / 3600 ),
                        delta(
                                from.getMinute(),
                                to.getMinute()
                        ),
                        delta(
                                from.getSecond(),
                                to.getSecond()
                        ),
                        0,
                        // nanosecond above
                        ZoneId.systemDefault()
                )
                .toEpochSecond();
    }

    public static long durationToSeconds(
            @NotNull LocalDateTime from,
            @NotNull LocalDateTime to
    ) {

        ZoneOffset zoneOffset = ZoneOffset.ofHours( BasicVariables.INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT );

        return ZonedDateTime.of(
                        delta(
                                from.getYear(),
                                to.getYear()
                        ) + BasicVariables.INTEGER_META_YEAR,
                        delta(
                                from.getMonthValue(),
                                to.getMonthValue()
                        ) + 1,
                        delta(
                                from.getDayOfMonth(),
                                to.getDayOfMonth() + 1
                        ),
                        delta(
                                from.getHour(),
                                to.getHour()
                        ) + ( zoneOffset.getTotalSeconds() / 3600 ),
                        delta(
                                from.getMinute(),
                                to.getMinute()
                        ),
                        delta(
                                from.getSecond(),
                                to.getSecond()
                        ),
                        0,
                        // nanosecond above
                        ZoneId.systemDefault()
                )
                .toEpochSecond();
    }

    public static @NotNull LocalDateTime getTime() {
        return LocalDateTime.now( ZoneOffset.ofHours( BasicVariables.INTEGER_TIME_ZONE_OFFSET_EAST_EIGHT ) );
    }

    /**
     * Colors:(Format ) _FRONT|BACK + COLOR_ <String-Content>
     */
    public static void greetings() {

        @NotNull String content = Settings.getGreetingsBeginSideSymbol()
                + BasicVariables.STRING_USER_NAME
                + Settings.getGreetingsEndSideSymbol();

        // Do printing
        System.out.print( dyeing(
                true,
                BasicVariables.CHARACTER_TERMINAL_COLOR_YELLOW
        ) + content );
    }

    public static @NotNull String dyeing(
            boolean isFront,
            char color
    ) {

        return isFront
               ? BasicVariables.STRING_CHARACTER_TERMINAL_COLOR_DEFAULT_CODE_BEFORE_COLOR_CONTENT +
                 BasicVariables.STRING_BASIC_OUTPUT_LOG_FORMAT_COLOR_FRONT +
                 color +
                 BasicVariables.STRING_CHARACTER_TERMINAL_COLOR_DEFAULT_CODE_AFTER_COLOR_CONTENT
               : BasicVariables.STRING_CHARACTER_TERMINAL_COLOR_DEFAULT_CODE_BEFORE_COLOR_CONTENT +
                 BasicVariables.STRING_BASIC_OUTPUT_LOG_FORMAT_COLOR_BACK +
                 color +
                 BasicVariables.STRING_CHARACTER_TERMINAL_COLOR_DEFAULT_CODE_AFTER_COLOR_CONTENT;
    }

    public static boolean blurEqualBetween(
            @NotNull String string,
            @NotNull String anotherString
    ) {
        return ( string.equalsIgnoreCase( anotherString )
                || string.equalsIgnoreCase( CHARACTER_COMMON_SYMBOLS_SPACE + anotherString )
                || string.equalsIgnoreCase( anotherString + CHARACTER_COMMON_SYMBOLS_SPACE ) );
    }

    // NEW ADD-IN CODE:

}
