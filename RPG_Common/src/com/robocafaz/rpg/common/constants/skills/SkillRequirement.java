package com.robocafaz.rpg.common.constants.skills;

import com.robocafaz.rpg.common.constants.Constant;

public class SkillRequirement extends Constant
{
  private final ExpertiseRequirement[] expertiseRequirements;
  private final int charLevel;

  protected SkillRequirement(String id, Skill skill, int charLevel, ExpertiseRequirement... expertiseRequirements)
  {
    super(id);
    this.charLevel = charLevel;
    this.expertiseRequirements = expertiseRequirements;
  }

  public ExpertiseRequirement[] getExpertiseRequirements()
  {
    return this.expertiseRequirements;
  }

  public int getCharLevel()
  {
    return this.charLevel;
  }

}
