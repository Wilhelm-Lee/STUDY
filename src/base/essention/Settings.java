package base.essention;

import base.essention.exegesis.ProjectPrivacy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.format.DateTimeFormatter;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
@ProjectPrivacy( level = 1 )
public class Settings {

    private static final @NotNull DateTimeFormatter formatterLong = DateTimeFormatter.ofPattern( "MM-dd-yy HH:mm:ss" );
    private static final @NotNull DateTimeFormatter formatterShort = DateTimeFormatter.ofPattern( "HH:mm:ss" );
    private static @Nullable DateTimeFormatter formatterCustom = null;
    private Settings() {
        throw new UnsupportedOperationException( "Settings does not boot in this way" );
    }

    /**
     * {@code greetingsBeginSideSymbol} is a White Square Button
     */
    public static @NotNull String getGreetingsBeginSideSymbol() {
        @NotNull String greetingsBeginSideSymbol = "$" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
        return greetingsBeginSideSymbol;
    }

    public static @NotNull String getGreetingsEndSideSymbol() {
        @NotNull String greetingsEndSideSymbol = BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE + ">>" + BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
        return greetingsEndSideSymbol;
    }

    public static @NotNull DateTimeFormatter getFormatterLong() {
        return formatterLong;
    }

    public static @NotNull DateTimeFormatter getFormatterShort() {
        return formatterShort;
    }

    public static @Nullable DateTimeFormatter getFormatterCustom() {
        return formatterCustom;
    }

    public static void setFormatterCustom( @Nullable DateTimeFormatter formatterCustom ) {
        Settings.formatterCustom = formatterCustom;
    }
}
