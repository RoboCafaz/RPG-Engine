package com.robocafaz.rpg.common.constants.skills;

import com.robocafaz.rpg.common.constants.Constant;

public class SkillTree extends Constant
{
  private final SkillRequirement[] skillRequirements;

  protected SkillTree(String id, SkillRequirement... skillRequirements)
  {
    super(id);
    this.skillRequirements = skillRequirements;
  }

  public SkillRequirement[] getSkillRequirements()
  {
    return this.skillRequirements;
  }

}
