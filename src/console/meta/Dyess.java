/*
 *     https://github.com/WilliamPascal/STUDY
 *     Copyright (C) 2023  William Pascal
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package console.meta;

import java.util.Objects;

/**
 * Defines colors.
 * @author william
 * @since 2304051680658569.2
 */
@Definitions
public class Dyess {

    private Dyess() {}

    /**
     * Compare any value from Dyess16 and value from DyessHex inform of String;
     * @param value16  Value from Dyess16 inform of String;
     * @param valueHex Value from DyessHex inform of String;
     * @return result in boolean;
     */
    public static boolean equals(String value16, String valueHex) {
        return Objects.equals(value16, valueHex);
    }

    public static class Dyess16 {

        static final String NONE     = "0";
        static final String BLACK    = "BLACK";
        static final String MAROON   = "MAROON";
        static final String GREEN    = "GREEN";
        static final String OLIVE    = "OLIVE";
        static final String NAVY     = "NAVY";
        static final String PURPLE   = "PURPLE";
        static final String TEAL     = "TEAL";
        static final String GREY     = "GREY";
        static final String SILVER   = "SILVER";
        static final String RED      = "RED";
        static final String LIME     = "LIME";
        static final String YELLOW   = "YELLOW";
        static final String BLUE     = "BLUE";
        static final String FUCHSIA  = "FUCHSIA";
        static final String AQUA     = "AQUA";
        static final String WHITE    = "WHITE";

        private Dyess16() {}
    }

    public static class DyessHexadecimal {

        private DyessHexadecimal() {}

        /**
         * Purse literature value into digital value.
         * @param value16
         * @return Dyess16.NONE if did not find match.
         *         Otherwise, the matched ones (exclude Dyess16.NONE).
         */
        public static String purse(String value16) {
            return switch ( value16 ) {
                case Dyess16.BLACK    -> "000000";
                case Dyess16.MAROON   -> "770000";
                case Dyess16.GREEN    -> "007700";
                case Dyess16.OLIVE    -> "777700";
                case Dyess16.NAVY     -> "000077";
                case Dyess16.PURPLE   -> "770077";
                case Dyess16.TEAL     -> "007777";
                case Dyess16.GREY     -> "777777";
                case Dyess16.SILVER   -> "AAAAAA";
                case Dyess16.RED      -> "FF0000";
                case Dyess16.LIME     -> "00FF00";
                case Dyess16.YELLOW   -> "FFFF00";
                case Dyess16.BLUE     -> "0000FF";
                case Dyess16.FUCHSIA  -> "FF00FF";
                case Dyess16.AQUA     -> "00FFFF";
                case Dyess16.WHITE    -> "FFFFFF";
                default -> "";  // :)
            };
        }
    }

}
