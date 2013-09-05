package com.robocafaz.rpg.common.entities.map;

import com.robocafaz.rpg.common.entities.Entity;
import com.robocafaz.rpg.common.sound.Sound;

public class Map extends Entity
{
  private Sound music;

  public Map(String name)
  {
    super(name);
  }

  public Map(String name, Sound music)
  {
    super(name);
    this.music = music;
  }

  public Sound getMusic()
  {
    return this.music;
  }

  public void setMusic(Sound music)
  {
    this.music = music;
  }
}