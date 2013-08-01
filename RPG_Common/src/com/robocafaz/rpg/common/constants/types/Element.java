package com.robocafaz.rpg.common.constants.types;

import com.robocafaz.rpg.common.constants.UserFacingConstant;

public enum Element implements UserFacingConstant, Expertise {
  // Base Elements
  EARTH("Earth", "Earth magic that can break foes and harden allies."),
  FIRE("Fire", "Firey magic that can devastate your enemies and power up your allies."),
  WIND("Wind", "Wind magic that can cut your foes and empower your allies."),
  WATER("Water", "Water magic that can hinder your foes and heal allies."),
  // Combo Elements
  EXPLOSIVE("Explosive", "Explosive magic that can devastate your enemies and power up your allies."),
  LIGHTNING("Lightning", "Lightning magic that can devastate your enemies and empower your allies."),
  ICE("Ice", "Frosty magic that can hinder your foes and cleanse your allies."),
  NATURE("Nature", "Green magic that can hinder your foes and cleans your allies.");

  private final String name;
  private final String description;

  Element(String name, String description) {
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
