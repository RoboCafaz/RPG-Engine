package com.robocafaz.rpg.common.skills;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public enum SkillRange implements UserFacingConstant {
  MELEE("Melee", 1), NEARBY("Close", 3), MEDIUM("Medium", 6), LONG("Long-range", 9), HUGE("Sniper", 12);

  private final String name;
  private final int range;

  SkillRange(String name, int range) {
    this.name = name;
    this.range = range;
  }

  public int getRange() {
    return this.range;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getDescription() {
    return "Hits enemies within " + this.range + " units.";
  }
}
