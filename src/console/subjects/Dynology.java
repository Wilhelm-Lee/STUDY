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

package console.subjects;

import console.abilities.Dyeable;
import console.meta.Definitions;
import console.meta.Dyess;

/**
 * <p>
 * This abstract class needs source code from
 * <a href="https://github.com/WilliamPascal/Carnival">Carnival - STUDY - C</a>
 * to define rendering behaviours.
 * </p>
 * @author william
 * @since 2304051680658569.2
 * @see console.abilities.Dyeable
 */
@Definitions
public abstract class Dynology implements Dyeable {

    /**
     * Color element
     */
    Dyess color;
    /**
     * @nativeRef Carnival/src/ui/components/geoms.h/S_coordinate : struct
     */
    int[] position;
    /**
     * For some instances, {@code BOLD=1; ITALIC=3; REVERSE=7 etc.}
     * @nativeRef "/bin/sh" builtin
     */
    int[] additionalFormat;

    protected Dynology(Dyess color, int[] position, int[] additionalFormat) {
        this.color = color;
        this.position = position;
        this.additionalFormat = additionalFormat;
    }
}
