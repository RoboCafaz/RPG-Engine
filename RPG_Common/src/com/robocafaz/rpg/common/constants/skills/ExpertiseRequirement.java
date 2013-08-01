package com.robocafaz.rpg.common.constants.skills;

import com.robocafaz.rpg.common.constants.Constant;
import com.robocafaz.rpg.common.constants.types.Expertise;

public class ExpertiseRequirement extends Constant
{
  private final Expertise expertise;
  private final int level;

  protected ExpertiseRequirement(String id, Expertise expertise, int level)
  {
    super(id);
    this.expertise = expertise;
    this.level = level;
  }

  public Expertise getExpertise()
  {
    return this.expertise;
  }

  public int getLevel()
  {
    return this.level;
  }
}
