package com.robocafaz.rpg.common.handlers;

import java.util.HashMap;
import java.util.Map;
import com.robocafaz.rpg.common.constants.Constant;

public class ConstantHandler implements DataHandler<Constant>
{
  private static ConstantHandler INSTANCED_CONSTANTHANDLER = new ConstantHandler();
  private static final Map<String, Constant> CONSTANT_MAP = new HashMap<String, Constant>();

  @Override
  public Constant getData(String id)
  {
    return CONSTANT_MAP.get(id);
  }

  @Override
  public void registerData(Constant constant)
  {
    CONSTANT_MAP.put(constant.getId(), constant);
  }

  public static Constant get(String id)
  {
    return INSTANCED_CONSTANTHANDLER.getData(id);
  }

  public static void register(Constant constant)
  {
    INSTANCED_CONSTANTHANDLER.registerData(constant);
  }
}