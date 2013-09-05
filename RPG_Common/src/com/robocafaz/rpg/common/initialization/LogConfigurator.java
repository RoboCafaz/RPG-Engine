package com.robocafaz.rpg.common.initialization;

import org.apache.log4j.BasicConfigurator;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true)
public class LogConfigurator
{
  public void activate()
  {
    BasicConfigurator.configure();
    System.out.println("STARTED");
  }
}
