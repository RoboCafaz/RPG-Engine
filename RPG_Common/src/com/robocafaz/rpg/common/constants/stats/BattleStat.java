package com.robocafaz.rpg.common.constants.stats;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public enum BattleStat implements UserFacingConstant {
  HEALTH("Health", "HP", "Your character's health pool.", 1, 1000),
  SPIRIT("Spirit", "SP", "Spirit energy used to perform special abilities.", 0, 100),
  MANA("Mana", "MP", "Magical energy used to cast spells.", 0, 250),
  STRENGTH("Strength", "STR", "Brawn that defines the power of your physical abilities.", 1, 99),
  DEFENSE("Defense", "DEF", "Your resistance to physical damage.", 1, 99),
  INTELLECT("Intellect", "INT", "Power that defines the power of your magical abilities.", 1, 99),
  WILL("Will", "WIL", "Your resistance to magical damage.", 1, 99),
  AGILITY("Agility", "AGI", "How quickly your character move about the field, as well as their ability to dodge.", 1, 99),
  WIT("Wit", "WIT", "How quickly your character can prepare for new attacks.", 1, 99);

  private final String name;
  private final String abbreviation;
  private final String description;
  private final int min;
  private final int max;

  BattleStat(String name, String abbreviation, String description, int min, int max) {
    this.name = name;
    this.abbreviation = abbreviation;
    this.description = description;
    this.min = min;
    this.max = max;
  }

  @Override
  public String getName() {
    return this.name;
  }

  public String getAbbreviation() {
    return this.abbreviation;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  public int getMin() {
    return this.min;
  }

  public int getMax() {
    return this.max;
  }
}
