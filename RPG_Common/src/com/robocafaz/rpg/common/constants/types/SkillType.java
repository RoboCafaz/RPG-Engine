package com.robocafaz.rpg.common.constants.types;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public enum SkillType implements UserFacingConstant {
  SKILL("Skill", "Consumes Spirit Points."), MAGIC("Magic", "Consumes Magic Points.");

  private final String name;
  private final String description;

  SkillType(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

}