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

package console.abilities;

import console.meta.Definitions;

/**
 * <p>
 * Specify those characters which were meant to be rendered on terminals.
 * Without implementing this interface, STUDY does not recognise it/them as
 * dyeable character, undefined behaviours might appear.
 * <p>
 * @since 2304051680658569.2
 * @see java.lang.CharSequence
 * @author william
 */
@Definitions
public interface Dyeable extends CharSequence {

}
