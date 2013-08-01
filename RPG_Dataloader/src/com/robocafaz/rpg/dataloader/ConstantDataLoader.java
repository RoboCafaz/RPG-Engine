package com.robocafaz.rpg.dataloader;

import com.robocafaz.rpg.common.constants.skills.SkillRange;
import com.robocafaz.rpg.common.constants.skills.SkillType;
import com.robocafaz.rpg.common.constants.stats.BattleStat;
import com.robocafaz.rpg.common.constants.types.Element;
import com.robocafaz.rpg.common.constants.types.WeaponType;
import com.robocafaz.rpg.common.handlers.ConstantHandler;

public class ConstantDataLoader implements DataLoader
{

  @Override
  public void loadData()
  {
    // -- Ranges
    ConstantHandler.register(new SkillRange("SR_MELEE", "Melee", 1));
    ConstantHandler.register(new SkillRange("SR_NEARBY", "Close", 3));
    ConstantHandler.register(new SkillRange("SR_MEDIUM", "Medium", 6));
    ConstantHandler.register(new SkillRange("SR_LONG", "Long-range", 9));
    ConstantHandler.register(new SkillRange("SR_HUGE", "Sniper", 12));

    // -- Battle Stats
    ConstantHandler.register(new BattleStat("BS_HEALTH", "Health", "HP", "Your character's health pool.", 1, 1000));
    ConstantHandler.register(new BattleStat("BS_SPIRIT", "Spirit", "SP", "Spirit energy used to perform special abilities.", 0,
        100));
    ConstantHandler.register(new BattleStat("BS_MANA", "Mana", "MP", "Magical energy used to cast spells.", 0, 250));
    ConstantHandler.register(new BattleStat("BS_STRENGTH", "Strength", "STR",
        "Brawn that defines the power of your physical abilities.", 1, 99));
    ConstantHandler.register(new BattleStat("BS_DEFENSE", "Defense", "DEF", "Your resistance to physical damage.", 1, 99));
    ConstantHandler.register(new BattleStat("BS_INTELLECT", "Intellect", "INT",
        "Power that defines the power of your magical abilities.", 1, 99));
    ConstantHandler.register(new BattleStat("BS_WILL", "Will", "WIL", "Your resistance to magical damage.", 1, 99));
    ConstantHandler.register(new BattleStat("BS_AGILITY", "Agility", "AGI",
        "How quickly your character move about the field, as well as their ability to dodge.", 1, 99));
    ConstantHandler.register(new BattleStat("BS_WIT", "Wit", "WIT", "How quickly your character can prepare for new attacks.", 1,
        99));

    // -- Elements
    // Base Elements
    ConstantHandler.register(new Element("EL_EARTH", "Earth", "Earth magic that can break foes and harden allies."));
    ConstantHandler.register(new Element("EL_FIRE", "Fire",
        "Firey magic that can devastate your enemies and power up your allies."));
    ConstantHandler.register(new Element("EL_WIND", "Wind", "Wind magic that can cut your foes and empower your allies."));
    ConstantHandler.register(new Element("EL_WATER", "Water", "Water magic that can hinder your foes and heal allies."));
    // Combo Elements
    ConstantHandler.register(new Element("EL_EXPLOSIVE", "Explosive",
        "Explosive magic that can devastate your enemies and power up your allies."));
    ConstantHandler.register(new Element("EL_LIGHTNING", "Lightning",
        "Lightning magic that can devastate your enemies and empower your allies."));
    ConstantHandler.register(new Element("EL_ICE", "Ice", "Frosty magic that can hinder your foes and cleanse your allies."));
    ConstantHandler.register(new Element("EL_NATURE", "Nature", "Green magic that can hinder your foes and cleans your allies."));

    // -- Skill Types
    ConstantHandler.register(new SkillType("ST_SKILL", "Skill", "Consumes Spirit Points."));
    ConstantHandler.register(new SkillType("ST_MAGIC", "Magic", "Consumes Magic Points."));

    // -- Weapon Types
    // Melee Weapons
    ConstantHandler.register(new WeaponType("WT_SWORD", "Sword", "", "MELEE"));
    ConstantHandler.register(new WeaponType("WT_MACE", "Mace", "", "MELEE"));
    ConstantHandler.register(new WeaponType("WT_AXE", "Axe", "", "MELEE"));
    ConstantHandler.register(new WeaponType("WT_DAGGER", "Dagger", "", "MELEE"));
    ConstantHandler.register(new WeaponType("WT_FIST", "Fist", "", "MELEE"));
    ConstantHandler.register(new WeaponType("WT_SHIELD", "Shield", "", "MELEE"));
    // Close-ranged Weapons
    ConstantHandler.register(new WeaponType("WT_SPEAR", "Spear", "", "NEARBY"));
    ConstantHandler.register(new WeaponType("WT_SCYTH", "Scyth", "", "NEARBY"));
    ConstantHandler.register(new WeaponType("WT_FLAIL", "Flail", "", "NEARBY"));
    // Mid-Ranged Weapons
    ConstantHandler.register(new WeaponType("WT_STAFF", "Staff", "", "MEDIUM"));
    ConstantHandler.register(new WeaponType("WT_WHIP", "Whip", "", "MEDIUM"));
    ConstantHandler.register(new WeaponType("WT_INSTRUMENET", "Instrument", "", "MEDIUM"));
    ConstantHandler.register(new WeaponType("WT_CANNON", "Cannon", "", "MEDIUM"));
    // Long-ranged Weapons
    ConstantHandler.register(new WeaponType("WT_BOW", "Bow", "", "LONG"));
    ConstantHandler.register(new WeaponType("WT_JAVELIN", "Javelin", "", "LONG"));
    ConstantHandler.register(new WeaponType("WT_PISTOL", "Pistol", "", "LONG"));
    // Sniper Weapons
    ConstantHandler.register(new WeaponType("WT_RIFLE", "Rifle", "", "HUGE"));
    ConstantHandler.register(new WeaponType("WT_CROSSBOW", "Crossbow", "", "HUGE"));
  }

}
