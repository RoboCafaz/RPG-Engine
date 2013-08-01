package com.robocafaz.rpg.common.constants.types;

import com.robocafaz.rpg.common.constants.UserFacingConstant;
import com.robocafaz.rpg.common.skills.SkillRange;

public enum WeaponType implements UserFacingConstant, Expertise {
  // Melee Weapons
  SWORD("Sword", "", SkillRange.MELEE),
  MACE("Mace", "", SkillRange.MELEE),
  AXE("Axe", "", SkillRange.MELEE),
  DAGGER("Dagger", "", SkillRange.MELEE),
  FIST("Fist", "", SkillRange.MELEE),
  SHIELD("Shield", "", SkillRange.MELEE),
  // Close-ranged Weapons
  SPEAR("Spear", "", SkillRange.NEARBY),
  SCYTH("Scyth", "", SkillRange.NEARBY),
  FLAIL("Flail", "", SkillRange.NEARBY),
  // Mid-Ranged Weapons
  STAFF("Staff", "", SkillRange.MEDIUM),
  WHIP("Whip", "", SkillRange.MEDIUM),
  INSTRUMENET("Instrument", "", SkillRange.MEDIUM),
  CANNON("Cannon", "", SkillRange.MEDIUM),
  // Long-ranged Weapons
  BOW("Bow", "", SkillRange.LONG),
  JAVELIN("Javelin", "", SkillRange.LONG),
  PISTOL("Pistol", "", SkillRange.LONG),
  // Sniper Weapons
  RIFLE("Rifle", "", SkillRange.HUGE),
  CROSSBOW("Crossbow", "", SkillRange.HUGE);

  private final String name;
  private final String description;
  private final SkillRange skillRange;

  WeaponType(String name, String description, SkillRange skillRange) {
    this.name = name;
    this.description = description;
    this.skillRange = skillRange;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  public SkillRange getSkillRange() {
    return this.skillRange;
  }
}
