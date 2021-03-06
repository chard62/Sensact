/*
 * This file is part of the Sensact software.
 *
 * Sensact software is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Sensact software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this Sensact Arduino software.  
 * If not, see <https://www.gnu.org/licenses/>.   
 */ 
package lyricom.ui;

/**
 *
 * @author Andrew
 */
public enum ScreenLocation {
    TOP_LEFT("Top Left"),
    TOP_RIGHT("Top_Right"),
    BOTTOM_LEFT("Bottom Left"),
    BOTTOM_RIGHT("Bottom Right");
    
    private String text;
    ScreenLocation(String txt) {
        text = txt;
    }
    
    boolean matches(String txt) {
        return txt.equalsIgnoreCase(text);
    }
}
