/*
 *     Copyright (c) 2016-2017 SparklingComet @ http://shanerx.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *              http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * NOTICE: All modifications made by others to the source code belong
 * to the respective contributor. No contributor should be held liable for
 * any damages of any kind, whether be material or moral, which were
 * caused by their contribution(s) to the project. See the full License for more information
 */

package org.shanerx.tradeshop.object;

import org.bukkit.entity.Player;
import org.shanerx.tradeshop.enums.ShopRole;

import java.util.UUID;

public class User {

    private Player player;
    private ShopRole role;

    public User(Player player, ShopRole role) {
        this.player = player;
        this.role = role;
    }

    public Player getPlayer() {
        return player;
    }

    public UUID getUUID() {
        return player.getUniqueId();
    }

    public ShopRole getRole() {
        return role;
    }

}
