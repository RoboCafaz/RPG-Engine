package com.robocafaz.rpg.common.constants;

public abstract class UserFacingConstant extends Constant
{
  private final String name;
  private final String description;

  protected UserFacingConstant(String id, String name, String description)
  {
    super(id);
    this.name = name;
    this.description = description;
  }

  public String getName()
  {
    return this.name;
  }

  public String getDescription()
  {
    return this.description;
  }
}
