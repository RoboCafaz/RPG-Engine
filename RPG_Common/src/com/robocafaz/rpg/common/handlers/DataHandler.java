package com.robocafaz.rpg.common.handlers;

public interface DataHandler<E>
{
  E getData(String id);

  void registerData(E item);
}
