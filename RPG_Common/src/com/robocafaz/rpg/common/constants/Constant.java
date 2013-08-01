package com.robocafaz.rpg.common.constants;

public abstract class Constant
{
  private final String id;

  protected Constant(String id)
  {
    this.id = id;
  }

  public String getId()
  {
    return this.id;
  }
}
