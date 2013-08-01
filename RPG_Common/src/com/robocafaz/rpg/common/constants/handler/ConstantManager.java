package com.robocafaz.rpg.common.constants.handler;

import java.util.HashMap;
import java.util.Map;
import com.robocafaz.rpg.common.constants.Constant;

public class ConstantManager<C extends Constant> {
  private final Map<String, C> constantMap;

  public ConstantManager() {
    this.constantMap = new HashMap<String, C>();
  }

  public void register(C constant) {
    this.constantMap.put(constant.getId(), constant);
  }

  public C get(String id) {
    return this.constantMap.get(id);
  }
}
