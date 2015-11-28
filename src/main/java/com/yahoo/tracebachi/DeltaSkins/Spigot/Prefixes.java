/*
 * This file is part of DeltaSkins.
 *
 * DeltaSkins is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DeltaSkins is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DeltaSkins.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.yahoo.tracebachi.DeltaSkins.Spigot;

import org.bukkit.ChatColor;

/**
 * Created by Trace Bachi (tracebachi@yahoo.com, BigBossZee) on 10/30/15.
 */
public interface Prefixes
{
    String INFO = ChatColor.translateAlternateColorCodes('&',
        "&8[&9!&8] &9Info &8[&9!&8]&7 ");

    String SUCCESS = ChatColor.translateAlternateColorCodes('&',
        "&8[&a!&8] &aSuccess &8[&a!&8]&7 ");

    String FAILURE = ChatColor.translateAlternateColorCodes('&',
        "&8[&c!&8] &cFailure &8[&c!&8]&7 ");
}