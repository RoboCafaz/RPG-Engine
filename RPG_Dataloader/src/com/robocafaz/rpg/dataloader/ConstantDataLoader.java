package com.robocafaz.rpg.dataloader;

import com.robocafaz.rpg.common.constants.skills.SkillRange;
import com.robocafaz.rpg.common.constants.stats.BattleStat;
import com.robocafaz.rpg.common.constants.types.Element;
import com.robocafaz.rpg.common.constants.types.SkillType;
import com.robocafaz.rpg.common.constants.types.WeaponType;
import com.robocafaz.rpg.common.handlers.ConstantHandler;

public class ConstantDataLoader implements DataLoader
{

  @Override
  public void loadData()
  {
    // -- Ranges
    ConstantHandler.register(new SkillRange("MELEE", "Melee", 1));
    ConstantHandler.register(new SkillRange("NEARBY", "Close", 3));
    ConstantHandler.register(new SkillRange("MEDIUM", "Medium", 6));
    ConstantHandler.register(new SkillRange("LONG", "Long-range", 9));
    ConstantHandler.register(new SkillRange("HUGE", "Sniper", 12));

    // -- Battle Stats
    ConstantHandler.register(new BattleStat("HEALTH", "Health", "HP", "Your character's health pool.", 1, 1000));
    ConstantHandler
        .register(new BattleStat("SPIRIT", "Spirit", "SP", "Spirit energy used to perform special abilities.", 0, 100));
    ConstantHandler.register(new BattleStat("MANA", "Mana", "MP", "Magical energy used to cast spells.", 0, 250));
    ConstantHandler.register(new BattleStat("STRENGTH", "Strength", "STR",
        "Brawn that defines the power of your physical abilities.", 1, 99));
    ConstantHandler.register(new BattleStat("DEFENSE", "Defense", "DEF", "Your resistance to physical damage.", 1, 99));
    ConstantHandler.register(new BattleStat("INTELLECT", "Intellect", "INT",
        "Power that defines the power of your magical abilities.", 1, 99));
    ConstantHandler.register(new BattleStat("WILL", "Will", "WIL", "Your resistance to magical damage.", 1, 99));
    ConstantHandler.register(new BattleStat("AGILITY", "Agility", "AGI",
        "How quickly your character move about the field, as well as their ability to dodge.", 1, 99));
    ConstantHandler
        .register(new BattleStat("WIT", "Wit", "WIT", "How quickly your character can prepare for new attacks.", 1, 99));

    // -- Elements
    // Base Elements
    ConstantHandler.register(new Element("EARTH", "Earth", "Earth magic that can break foes and harden allies."));
    ConstantHandler
        .register(new Element("FIRE", "Fire", "Firey magic that can devastate your enemies and power up your allies."));
    ConstantHandler.register(new Element("WIND", "Wind", "Wind magic that can cut your foes and empower your allies."));
    ConstantHandler.register(new Element("WATER", "Water", "Water magic that can hinder your foes and heal allies."));
    // Combo Elements
    ConstantHandler.register(new Element("EXPLOSIVE", "Explosive",
        "Explosive magic that can devastate your enemies and power up your allies."));
    ConstantHandler.register(new Element("LIGHTNING", "Lightning",
        "Lightning magic that can devastate your enemies and empower your allies."));
    ConstantHandler.register(new Element("ICE", "Ice", "Frosty magic that can hinder your foes and cleanse your allies."));
    ConstantHandler.register(new Element("NATURE", "Nature", "Green magic that can hinder your foes and cleans your allies."));

    // -- Skill Types
    ConstantHandler.register(new SkillType("SKILL", "Skill", "Consumes Spirit Points."));
    ConstantHandler.register(new SkillType("MAGIC", "Magic", "Consumes Magic Points."));

    // -- Weapon Types
    // Melee Weapons
    ConstantHandler.register(new WeaponType("SWORD", "Sword", "", "MELEE"));
    ConstantHandler.register(new WeaponType("MACE", "Mace", "", "MELEE"));
    ConstantHandler.register(new WeaponType("AXE", "Axe", "", "MELEE"));
    ConstantHandler.register(new WeaponType("DAGGER", "Dagger", "", "MELEE"));
    ConstantHandler.register(new WeaponType("FIST", "Fist", "", "MELEE"));
    ConstantHandler.register(new WeaponType("SHIELD", "Shield", "", "MELEE"));
    // Close-ranged Weapons
    ConstantHandler.register(new WeaponType("SPEAR", "Spear", "", "NEARBY"));
    ConstantHandler.register(new WeaponType("SCYTH", "Scyth", "", "NEARBY"));
    ConstantHandler.register(new WeaponType("FLAIL", "Flail", "", "NEARBY"));
    // Mid-Ranged Weapons
    ConstantHandler.register(new WeaponType("STAFF", "Staff", "", "MEDIUM"));
    ConstantHandler.register(new WeaponType("WHIP", "Whip", "", "MEDIUM"));
    ConstantHandler.register(new WeaponType("INSTRUMENET", "Instrument", "", "MEDIUM"));
    ConstantHandler.register(new WeaponType("CANNON", "Cannon", "", "MEDIUM"));
    // Long-ranged Weapons
    ConstantHandler.register(new WeaponType("BOW", "Bow", "", "LONG"));
    ConstantHandler.register(new WeaponType("JAVELIN", "Javelin", "", "LONG"));
    ConstantHandler.register(new WeaponType("PISTOL", "Pistol", "", "LONG"));
    // Sniper Weapons
    ConstantHandler.register(new WeaponType("RIFLE", "Rifle", "", "HUGE"));
    ConstantHandler.register(new WeaponType("CROSSBOW", "Crossbow", "", "HUGE"));
  }

}
