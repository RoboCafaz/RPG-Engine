package com.robocafaz.rpg.common.sound;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SoundTest implements BundleActivator
{
  @Override
  public void start(BundleContext context) throws Exception
  {
    Sound sound = new Sound("testSound.ogg");
    sound.play();
  }

  @Override
  public void stop(BundleContext context) throws Exception
  {
  }
}
