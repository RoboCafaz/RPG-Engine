package com.robocafaz.rpg.datahandlers;

public interface DataHandler<E> {
  public void loadData();

  public E get(String id);
}