package com.robocafaz.rpg.common.constants.skills;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public class SkillRange extends UserFacingConstant {
  private final int range;

  public SkillRange(String id, String name, int range) {
    super(id, name, "Hits enemies within " + range + " units.");
    this.range = range;
  }

  public int getRange() {
    return this.range;
  }
}
