package com.robocafaz.rpg.common.sound;

import java.io.IOException;
import org.newdawn.easyogg.OggClip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sound
{
  private static final Logger LOG = LoggerFactory.getLogger(Sound.class);

  private final String fileName;
  private OggClip ogg;

  /**
   * Create a new Sound object with the given filename. Will not be loaded until {@link Sound#load()} is called.
   * 
   * @param fileName
   *          - Filename of the sound file. Only accepts OGG files.
   */
  public Sound(String fileName)
  {
    this.fileName = fileName;
  }

  /**
   * Attempts to load the OGG file.
   */
  public void load()
  {
    try
    {
      this.ogg = new OggClip(this.fileName);
      LOG.debug("Loaded file '" + this.fileName + "'.");
    } catch (IOException e)
    {
      LOG.error("Could not load file '" + this.fileName + "'. Threw exception: " + e);
      e.printStackTrace();
    }
  }

  /**
   * Attempts to play the sound file once.
   */
  public void play()
  {
    play(false);
  }

  /**
   * Attempts to play the sound file. If it is paused it will be resumed.
   * 
   * @param looped
   *          - Whether or not the file should keep playing after finished.
   */
  public void play(boolean looped)
  {
    if (isLoaded())
    {
      if (this.ogg.isPaused() && !looped)
      {
        this.ogg.resume();
      } else if (looped)
      {
        LOG.info("Started looping song '" + this.fileName + "'.");
        this.ogg.loop();
      } else
      {
        LOG.info("Started playing song '" + this.fileName + "' unlooped.");
        this.ogg.play();
      }
    } else
    {
      LOG.error("Attempted to play an unloaded sound file!");
    }
  }

  /**
   * Pauses the sound file if it is currently playing.
   */
  public void pause()
  {
    if (isLoaded())
    {
      if (!this.ogg.isPaused() && !this.ogg.stopped())
      {
        this.ogg.pause();
      }
    } else
    {
      LOG.error("Attmpted to pause an unloaded sound file!");
    }
  }

  /**
   * Stops the sound file if it is currently playing.
   */
  public void stop()
  {
    if (isLoaded())
    {
      if (!this.ogg.stopped())
      {
        LOG.info("Stopped playing song '" + this.fileName + "'.");
        this.ogg.stop();
      }
    } else
    {
      LOG.error("Attempted to stop an unloaded sound file!");
    }
  }

  /**
   * Checks to see whether or not the sound file is loaded.
   * 
   * @return - Whether or not the sound file is loaded.
   */
  public boolean isLoaded()
  {
    return (this.ogg != null);
  }
}
