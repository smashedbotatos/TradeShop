/*
 *
 *                         Copyright (c) 2016-2019
 *                SparklingComet @ http://shanerx.org
 *               KillerOfPie @ http://killerofpie.github.io
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *                http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  NOTICE: All modifications made by others to the source code belong
 *  to the respective contributor. No contributor should be held liable for
 *  any damages of any kind, whether be material or moral, which were
 *  caused by their contribution(s) to the project. See the full License for more information.
 *
 */

package org.shanerx.tradeshop.enumys;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.shanerx.tradeshop.TradeShop;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

@SuppressWarnings("unused")
public enum Message {

	AMOUNT_NOT_NUM,
	BUY_FAILED_SIGN,
	CONFIRM_TRADE,
	EMPTY_TS_ON_SETUP,
	FULL_AMOUNT,
	HELD_EMPTY,
	ITEM_ADDED,
	ILLEGAL_ITEM,
	INSUFFICIENT_ITEMS,
	INVALID_ARGUMENTS,
	INVALID_SIGN,
	MISSING_INFO,
	MISSING_ITEM,
	MISSING_SHOP,
	NO_CHEST,
	NO_COMMAND_PERMISSION,
	NO_SIGHTED_SHOP,
	NO_TS_CREATE_PERMISSION,
	NO_TS_DESTROY,
	NO_TS_OPEN,
	NO_SHOP_PERMISSION,
	ON_TRADE,
	PLAYER_FULL,
	PLAYER_NOT_FOUND,
	PLAYER_ONLY_COMMAND,
	SELF_OWNED,
	SETUP_HELP,
	SHOP_EMPTY,
	SHOP_FULL,
	SHOP_CLOSED,
	SHOP_FULL_AMOUNT,
	SUCCESSFUL_SETUP,
	UNSUCCESSFUL_SHOP_MEMBERS,
	UPDATED_SHOP_MEMBERS,
	NO_EDIT,
	CHANGE_CLOSED,
	CHANGE_OPEN,
	EXISTING_SHOP,
	SHOP_TYPE_SWITCHED,
	WHO_MESSAGE,
	INVALID_SUBCOMMAND;

	@Override
	public String toString() {
		return colour(config.getString(name().toLowerCase().replace("_", "-"))
				.replace("%header%", Setting.TRADESHOP_HEADER.getString()));
	}

	public String getPrefixed() {
		return colour(PREFIX + toString());
	}

	private static TradeShop plugin = (TradeShop) Bukkit.getPluginManager().getPlugin("TradeShop");
	private static File file = new File(plugin.getDataFolder(), "messages.yml");
	private static FileConfiguration config = YamlConfiguration.loadConfiguration(file);
	private static final char COLOUR_CHAR = '&';
	protected final String PREFIX = "&a[&eTradeShop&a] ";

	public static void setDefaults() {
		addMessage("invalid-arguments", "&eTry &6/tradeshop help &eto display help!");
		addMessage("no-command-permission", "&aYou do not have permission to execute this command");
		addMessage("setup-help", "\n&2Setting up a TradeShop is easy! Just make sure to follow these steps:"
				+ "\n \nStep 1: &ePlace down a chest."
				+ "\n&2Step 2: &ePlace a sign on top of or around the chest."
				+ "\n&2Step 3: &eWrite the following on the sign"
				+ "\n&6[%header%]"
				+ "\n&6&o-- Leave Blank --"
				+ "\n&6&o-- Leave Blank --"
				+ "\n&6&o-- Leave Blank --"
				+ "\n&2Step 4: &eUse the addCost and addProduct commands to add items to your shop");
		addMessage("no-ts-create-permission", "&cYou don't have permission to create TradeShops!");
		addMessage("no-chest", "&cYou need to put a chest under the sign!");
		addMessage("invalid-sign", "&cInvalid sign format!");
		addMessage("no-ts-destroy", "&cYou may not destroy that TradeShop");
		addMessage("successful-setup", "&aYou have successfully setup a TradeShop!");
		addMessage("no-ts-open", "&cThat TradeShop does not belong to you");
		addMessage("empty-ts-on-setup", "&cTradeShop empty, please remember to fill it!");
		addMessage("on-trade", "&aYou have traded your&e {AMOUNT2} {ITEM2} &a for &e {AMOUNT1} {ITEM1} &awith {SELLER}");
		addMessage("insufficient-items", "&cYou do not have &e {AMOUNT} {ITEM}&c!");
		addMessage("shop-full-amount", "&cThe shop does not have &e{AMOUNT} &cof a single type of &e{ITEM}&c!");
		addMessage("full-amount", "&cYou must have &e{AMOUNT} &cof a single type of &e{ITEM}&c!");
		addMessage("shop-empty", "&cThis TradeShop does not have &e {AMOUNT} {ITEM}&c!");
		addMessage("shop-full", "&cThis TradeShop is full, please contact the owner to get it emptied!");
		addMessage("player-full", "&cYour inventory is full, please make room before trading items!");
		addMessage("confirm-trade", "&eTrade &6 {AMOUNT1} {ITEM1} &e for &6 {AMOUNT2} {ITEM2} &e?");
		addMessage("item-added", "&aItem successfully added to sign.");
		addMessage("held-empty", "&eYou are currently holding nothing.");
		addMessage("player-only-command", "&eThis command is only available to players.");
		addMessage("missing-shop", "&cThere is not currently a shop here, please tell the owner or come back later!");
		addMessage("no-sighted-shop", "&cNo shop in range!");
		addMessage("updated-shop-members", "&aShop owners and members have been updated!");
		addMessage("unsuccessful-shop-members", "&aThat player is either already on the shop, or you have reached the maximum number of users!");
		addMessage("who-message", "&6Shop users are:\n&2Owner: &e{OWNER}\n&2Managers: &e{MANAGERS}\n&2Members: &e{MEMBERS}");
		addMessage("self-owned", "&cYou cannot buy from a shop in which you are a user.");
		addMessage("no-shop-permission", "&cYou do not have permission to edit that shop.");
		addMessage("illegal-item", "&cYou cannot use one or more of those items in shops.");
		addMessage("missing-item", "&cYour sign is missing an item for trade.");
		addMessage("missing-info", "&cYour sign is missing necessary information.");
		addMessage("amount-not-num", "&cYou should have an amount before each item.");
		addMessage("shop-closed", "&cThis shop is currently closed.");
		addMessage("buy-failed-sign", "&cThis shop sign does not seem to be formatted correctly, please notify the owner.");
		addMessage("no-edit", "&cYou do not have permission to edit this shop.");
		addMessage("change-closed", "&cThe shop is now &l&bCLOSED&r&a.");
		addMessage("change-open", "&aThe shop is now &l&bOPEN&r&a.");
		addMessage("player-not-found", "&cThat player could not be found.");
		addMessage("existing-shop", "&cYou may only have 1 shop per inventory block.");
		addMessage("shop-type-switched", "&aShop type has been switched to %newtype%.");
		addMessage("invalid-subcommand", "&cInvalid subcommand. Cannot display usage.");

		save();
	}

	private static void addMessage(String node, String message) {
		if (config.get(node) == null) {
			config.set(node, message);
		}
	}

	private static void save() {
		if (config != null)
			try {
				config.save(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	public static void reload() {
		try {
			if (!plugin.getDataFolder().isDirectory()) {
				plugin.getDataFolder().mkdirs();
			}
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			plugin.getLogger().log(Level.SEVERE, "Could not create Message file! Disabling plugin!", e);
			plugin.getServer().getPluginManager().disablePlugin(plugin);
		}

		config = YamlConfiguration.loadConfiguration(file);
		setDefaults();
	}

	public static FileConfiguration getConfig() {
		return config;
	}

	public static String colour(String x) {
		return ChatColor.translateAlternateColorCodes(COLOUR_CHAR, x);
	}
}
