package com.robocafaz.rpg.common.entities;

public abstract class Entity
{
  private String name;

  public Entity(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
