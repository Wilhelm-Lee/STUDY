package work.speculator.entrance;

/*
 * [ TABLE Visibility ]
 *
 * *----------------------------------------------------------------------*
 * |   Modifier          Class        Package      Subclass     World     |
 * +----------------------------------------------------------------------+
 * |   public            Y            Y            Y            Y         |
 * |   protected         Y            Y            Y            N         |
 * |   no_modifier       Y            Y            N            N         |
 * |   private           Y            N            N            N         |
 * *----------------------------------------------------------------------*
 * ....................................................July 15th, 2022.....
 */

/*
 * [ TABLE DataType ]
 *
 * JAVA DOES NOT HAVE UNSIGNED DATA IN STANDARD
 * https://github.com/jOOQ/jOOU for more "unsigned"
 * [ 1 Byte == 8 bits ]
 * [ 1 Bit -> 2 Possibilities ]
 * [ 1 Byte -> 256 Possibilities ]
 * *-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*
 * | <!>Signature    DataType       Range(pow)                         Range(dec/hex)                                        DefaultValue        Size                Note                |
 * +-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
 * |    \            boolean              0 to 1                                             0 to 1                          false               1 Bit                                   |
 * |    signed       byte              -2^4 to 2^4 - 1                                    -128 to 127                        0                   1 Byte / 8 Bits                         |
 * | <!>unsigned     byte                 0 to 2^8 - 1                                       0 to 255                        0                   1 Byte / 8 Bits                         |
 * |    signed       char             -2^16 to 2^16 - 1                                 -32768 to 32767                      '\u0000'            2 Byte / 16 Bits    Unicode             |
 * | <!>unsigned     char                 0 to 2^32 - 1                                      0 to 65535                      '\u0000'            2 Byte / 16 Bits                        |
 * |    signed       short            -2^16 to 2^16 - 1                                 -32768 to 32767                      0                   2 Byte / 16 Bits                        |
 * | <!>unsigned     short                0 to 2^32 - 1                                      0 to 65535                      0                   2 Byte / 16 Bits                        |
 * |    signed       int              -2^32 to 2^32 - 1                            -2147483648 to 2147483647                 0                   4 Byte / 32 Bits                        |
 * | <!>unsigned     int                  0 to 2^64 - 1                                      0 to 4294967294                 0                   4 Byte / 32 Bits                        |
 * |    signed       float           2^-149 to (2-2^-23)·2^127                0x1.effeteP+127f to 0x0.000002P-126f           0.0f                4 Byte / 32 Bits    Standard: IEEE 754  |
 * |    signed       long             -2^64 to 2^64 - 1                   -9223372036854775808 to 9223372036854775807        0                   8 Byte / 64 Bits                        |
 * | <!>unsigned     long                 0 to 2^64 - 1                                      0 to 18446744073709551615       0                   8 Byte / 64 Bits                        |
 * |    signed       double         2^-1024 to (2-2^-52)·2^1023        0x0.0000000000001P-1022 to 0x1.fffffffffffffP+1023    0.0d                8 Byte / 64 Bits    Standard: IEEE 754  |
 * *-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*
 * <!> Stands for Theoretically only | Not contained in Java
 * ..................................................................................................................................................................August 7th, 2022.....
 */

/*
 *      + ---------------- < ------------------- Visualizations ----------------- < ----------------- +
 *      V                                                                                             ^
 * User Input                                                                                  Compute Output
 *      V                                                                                             ^
 * Catch by BasicInput                                                                        Catch by BasicOutput
 *      V                                                                                             ^
 * Send to ProcessIO.ProcessInput                                              Generate new outputting results and send them
 *      V                                                                                             ^
 * Being proceeded and turned into cmd, sent to ProcessCommand      Being turned into results, sent to ProcessIO.ProcessOutput
 *      V                                                                                             ^
 * Collect module cmd from Commands then proceed                     Collect module work.speculator.echo-text from BasicVariables then proceed
 *      V                                                                                             ^
 *      + ---------------- > --------------------- Operating -------------------- > ----------------- +
 *
 */

import work.shall.usr.Shall;
import work.speculator.exception.ActionOverAbstractiveException;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class Main {

    private boolean termination = false;

    public boolean getTermination() {
        return this.termination;
    }

    public void setTermination( boolean termination ) {
        this.termination = termination;
    }

    public static void main( String[] args )
            throws ActionOverAbstractiveException {

        final Main runtimeMain = new Main();

        while ( !runtimeMain.getTermination() ) {
            new Shall();
        }

    }
}
