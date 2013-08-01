package com.robocafaz.rpg.datahandlers;

import java.util.HashMap;
import java.util.Map;
import com.robocafaz.rpg.common.constants.Constant;
import com.robocafaz.rpg.common.constants.handler.ConstantManager;
import com.robocafaz.rpg.common.constants.skills.SkillRange;
import com.robocafaz.rpg.common.constants.stats.BattleStat;
import com.robocafaz.rpg.common.constants.types.Element;
import com.robocafaz.rpg.common.constants.types.SkillType;
import com.robocafaz.rpg.common.constants.types.WeaponType;

public class ConstantHandler implements DataHandler<Constant> {
  private final Map<Class<? extends Constant>, ConstantManager<? extends Constant>> constantMap;

  public ConstantHandler() {
    this.constantMap = new HashMap<Class<? extends Constant>, ConstantManager<? extends Constant>>();
  }

  @Override
  public Constant get(String id) {
    // TODO Auto-generated method stub
    return null;
  }

  protected void registerConstant(Constant constant) {
    ConstantManager<? extends Constant> manager = this.constantMap.get(constant.getClass());
    if (manager == null) {
      manager = new ConstantManager<Constant>();
      this.constantMap.put(constant.getClass(), manager);
    }
    manager.register(constant);
  }

  @Override
  public void loadData() {
    // -- Ranges
    registerConstant(new SkillRange("MELEE", "Melee", 1));
    registerConstant(new SkillRange("NEARBY", "Close", 3));
    registerConstant(new SkillRange("MEDIUM", "Medium", 6));
    registerConstant(new SkillRange("LONG", "Long-range", 9));
    registerConstant(new SkillRange("HUGE", "Sniper", 12));

    // -- Battle Stats
    registerConstant(new BattleStat("HEALTH", "Health", "HP", "Your character's health pool.", 1, 1000));
    registerConstant(new BattleStat("SPIRIT", "Spirit", "SP", "Spirit energy used to perform special abilities.", 0, 100));
    registerConstant(new BattleStat("MANA", "Mana", "MP", "Magical energy used to cast spells.", 0, 250));
    registerConstant(new BattleStat("STRENGTH", "Strength", "STR", "Brawn that defines the power of your physical abilities.", 1,
        99));
    registerConstant(new BattleStat("DEFENSE", "Defense", "DEF", "Your resistance to physical damage.", 1, 99));
    registerConstant(new BattleStat("INTELLECT", "Intellect", "INT", "Power that defines the power of your magical abilities.",
        1, 99));
    registerConstant(new BattleStat("WILL", "Will", "WIL", "Your resistance to magical damage.", 1, 99));
    registerConstant(new BattleStat("AGILITY", "Agility", "AGI",
        "How quickly your character move about the field, as well as their ability to dodge.", 1, 99));
    registerConstant(new BattleStat("WIT", "Wit", "WIT", "How quickly your character can prepare for new attacks.", 1, 99));

    // -- Elements
    // Base Elements
    registerConstant(new Element("EARTH", "Earth", "Earth magic that can break foes and harden allies."));
    registerConstant(new Element("FIRE", "Fire", "Firey magic that can devastate your enemies and power up your allies."));
    registerConstant(new Element("WIND", "Wind", "Wind magic that can cut your foes and empower your allies."));
    registerConstant(new Element("WATER", "Water", "Water magic that can hinder your foes and heal allies."));
    // Combo Elements
    registerConstant(new Element("EXPLOSIVE", "Explosive",
        "Explosive magic that can devastate your enemies and power up your allies."));
    registerConstant(new Element("LIGHTNING", "Lightning",
        "Lightning magic that can devastate your enemies and empower your allies."));
    registerConstant(new Element("ICE", "Ice", "Frosty magic that can hinder your foes and cleanse your allies."));
    registerConstant(new Element("NATURE", "Nature", "Green magic that can hinder your foes and cleans your allies."));

    // -- Skill Types
    registerConstant(new SkillType("SKILL", "Skill", "Consumes Spirit Points."));
    registerConstant(new SkillType("MAGIC", "Magic", "Consumes Magic Points."));

    // -- Weapon Types
    // Melee Weapons
    registerConstant(new WeaponType("SWORD", "Sword", "", SkillRange.MELEE));
    registerConstant(new WeaponType("MACE", "Mace", "", SkillRange.MELEE));
    registerConstant(new WeaponType("AXE", "Axe", "", SkillRange.MELEE));
    registerConstant(new WeaponType("DAGGER", "Dagger", "", SkillRange.MELEE));
    registerConstant(new WeaponType("FIST", "Fist", "", SkillRange.MELEE));
    registerConstant(new WeaponType("SHIELD", "Shield", "", SkillRange.MELEE));
    // Close-ranged Weapons
    registerConstant(new WeaponType("SPEAR", "Spear", "", SkillRange.NEARBY));
    registerConstant(new WeaponType("SCYTH", "Scyth", "", SkillRange.NEARBY));
    registerConstant(new WeaponType("FLAIL", "Flail", "", SkillRange.NEARBY));
    // Mid-Ranged Weapons
    registerConstant(new WeaponType("STAFF", "Staff", "", SkillRange.MEDIUM));
    registerConstant(new WeaponType("WHIP", "Whip", "", SkillRange.MEDIUM));
    registerConstant(new WeaponType("INSTRUMENET", "Instrument", "", SkillRange.MEDIUM));
    registerConstant(new WeaponType("CANNON", "Cannon", "", SkillRange.MEDIUM));
    // Long-ranged Weapons
    registerConstant(new WeaponType("BOW", "Bow", "", SkillRange.LONG));
    registerConstant(new WeaponType("JAVELIN", "Javelin", "", SkillRange.LONG));
    registerConstant(new WeaponType("PISTOL", "Pistol", "", SkillRange.LONG));
    // Sniper Weapons
    registerConstant(new WeaponType("RIFLE", "Rifle", "", SkillRange.HUGE));
    registerConstant(new WeaponType("CROSSBOW", "Crossbow", "", SkillRange.HUGE));
  }
}