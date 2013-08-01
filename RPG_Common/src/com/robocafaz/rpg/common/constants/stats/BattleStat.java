package com.robocafaz.rpg.common.constants.stats;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public class BattleStat extends UserFacingConstant {

  private final String abbreviation;
  private final int min;
  private final int max;

  public BattleStat(String id, String name, String abbreviation, String description, int min, int max) {
    super(id, name, description);
    this.abbreviation = abbreviation;
    this.min = min;
    this.max = max;
  }

  public String getAbbreviation() {
    return this.abbreviation;
  }

  public int getMin() {
    return this.min;
  }

  public int getMax() {
    return this.max;
  }
}
