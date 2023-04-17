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

import java.util.Arrays;
import java.util.Objects;

/**
 * Defines colors.
 * @author william
 * @since 2304051680658569.2
 */
@Definitions
public class Dyess {

    protected class Channel {
        private final long[] mRGBAChannels;

        public Channel(long rChannel, long gChannel,
                       long bChannel, long aChannel) {
            /* Don't forget this initiation! */
            this.mRGBAChannels = new long[4];

            this.mRGBAChannels[0] = rChannel;
            this.mRGBAChannels[1] = gChannel;
            this.mRGBAChannels[2] = bChannel;
            this.mRGBAChannels[3] = aChannel;
        }

        public Channel(long[] mRGBAChannel) {
            this.mRGBAChannels = mRGBAChannel;
        }

        /**
         * @return Overflowed volume in range of [0, 16^(2)-1];
         *         -1 when channel is null (failed)
         */
        private long channelAdjustmentOverflowCalc(long channelVolume,
                                                  long adjustment) {
            final long MAX = 0xFFFFFFFFL;
            final long MIN = 0x00000000L;
            final long delta = (MAX - channelVolume);
            long overflowed = MIN;

            if (channelVolume < MIN) {
                throw new IllegalArgumentException(
                        "RGBAChannel Volume cannot be negative.");
            }
            if (channelVolume > MAX) {
                overflowed = (/* YOU LEFT HERE */);
                channelVolume = MAX;
            }
            if (adjustment == MIN) {
                return MIN;
            } else if (adjustment > MIN) {
                /* Will not overflow */
                if (adjustment < delta) {
                    return MIN;
                } else /* Will overflow */ {
                    return (adjustment - MAX);
                }
            } else /* adjustment < MIN */ {

            }
        }

        /**
         * @return Overflowed volume inform of an array which every element is
         *         in range of [0, 16^(2)-1];
         *         -1 when matched element from the array to channel is null
         */
        public long[] channelAdjustment(Channel channel, long[] adjustVolumes,
                                       long[] channelsSelected) {
            if (Objects.equals(channel, null)) {
                return new long[] {-1};
            }

            final int adjustVolumesLength = adjustVolumes.length;
            final int channelsSelectedLength = channelsSelected.length;

            /* Use copy of the last element from adjustVolumes to fill
               the remain-undefined elements into channelsSelected. */
            if (adjustVolumesLength < channelsSelectedLength) {
                /* Index of last element */
                final int lastIndex = (adjustVolumesLength - 1);
                /* Value of last element */
                final long last = adjustVolumes[lastIndex];
                /* To be able to fill up, we need another array
                   represents the one with more element than "adjustVolumes".
                   Because array "adjustVolumes" is shorter than array
                   "channelsSelected". Thus, a new array is required to store
                   the previous one, which is array "adjustVolumes". */
                long[] newAdjustVolumes
                        = Arrays.copyOf(adjustVolumes, adjustVolumesLength);
                /* Filling up */
                for (int i = lastIndex; i < channelsSelectedLength; i ++) {
                    newAdjustVolumes[i] = last;
                }
                /* Apply changes */
                adjustVolumes = newAdjustVolumes;
            }
            /* Here, if we have the array "adjustVolumes" being longer than
               what we've expected, the remain unused element would be ignored.
               :) */
            long[] overflows = new long[channelsSelectedLength];
            for (int i = 0; i < channelsSelectedLength; i ++) {
                overflows[i] =
                        channelAdjustmentOverflowCalc(channelsSelected[i],
                                                      adjustVolumes[i]);
            }
            return overflows;
        }

        public long getRChannel() {
            return this.mRGBAChannels[0];
        }

        public long getGChannel() {
            return this.mRGBAChannels[1];
        }

        public long getBChannel() {
            return this.mRGBAChannels[2];
        }

        public long getAChannel() {
            return this.mRGBAChannels[3];
        }
    }

    /**
     * Compare any value from Dyess16 and value from DyessHex inform of String;
     * @param value16  Value from Dyess16 inform of String;
     * @param valueHex Value from DyessHex inform of String;
     * @return result in boolean;
     */
    public static boolean equals(String value16, String valueHex) {
        return Objects.equals(value16, valueHex);
    }

    public enum Dyess16 {

                       NONE,
        /* 000000FF */ BLACK,
        /* 770000FF */ MAROON,
        /* 007700FF */ GREEN,
        /* 777700FF */ OLIVE,
        /* 000077FF */ NAVY,
        /* 770077FF */ PURPLE,
        /* 007777FF */ TEAL,
        /* 777777FF */ GREY,
        /* AAAAAAFF */ SILVER,
        /* FF0000FF */ RED,
        /* 00FF00FF */ LIME,
        /* FFFF00FF */ YELLOW,
        /* 0000FFFF */ BLUE,
        /* FF00FFFF */ FUCHSIA,
        /* 00FFFFFF */ AQUA,
        /* FFFFFFFF */ WHITE

    }

    public static class DyessHexadecimal {

        private DyessHexadecimal() {}

        /**
         * Purse literature value into digital value.
         * @param value16 Value of Dyess16
         * @return Dyess16.NONE if did not find match.
         *         Otherwise, the matched ones (exclude Dyess16.NONE).
         *         Return Integer helps to calculate.
         * @note If the result is bound to be returned back to C (native
         *       environment), so do please convert into char*. Because some of
         *       the low bit system might not handle such big integer properly.
         */
        public static long purse(Dyess16 value16) {
            return switch ( value16 ) {
                case NONE     -> -1;
                case BLACK    -> 0x000000FFL;
                case MAROON   -> 0x770000FFL;
                case GREEN    -> 0x007700FFL;
                case OLIVE    -> 0x777700FFL;
                case NAVY     -> 0x000077FFL;
                case PURPLE   -> 0x770077FFL;
                case TEAL     -> 0x007777FFL;
                case GREY     -> 0x777777FFL;
                case SILVER   -> 0xAAAAAAFFL;
                case RED      -> 0xFF0000FFL;
                case LIME     -> 0x00FF00FFL;
                case YELLOW   -> 0xFFFF00FFL;
                case BLUE     -> 0x0000FFFFL;
                case FUCHSIA  -> 0xFF00FFFFL;
                case AQUA     -> 0x00FFFFFFL;
                case WHITE    -> 0xFFFFFFFFL;
            };
        }
    }

}
