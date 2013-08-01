package com.robocafaz.rpg.common.constants.skills;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public class SkillArea extends UserFacingConstant
{
  private final int radius;

  protected SkillArea(String id, String name, String description, int radius)
  {
    super(id, name, description);
    this.radius = radius;
  }

  public int getRadius()
  {
    return this.radius;
  }

}
