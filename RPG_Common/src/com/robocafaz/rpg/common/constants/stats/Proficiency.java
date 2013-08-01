package com.robocafaz.rpg.common.constants.stats;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public class Proficiency extends UserFacingConstant
{
  private final double multiplier;

  protected Proficiency(String id, String name, String description, double multiplier)
  {
    super(id, name, description);
    this.multiplier = multiplier;
  }

  public double getMultiplier()
  {
    return this.multiplier;
  }
}
