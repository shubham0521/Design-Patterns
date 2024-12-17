package com.example.design.pattern.behaviour.speak;

public class Quack implements SpeakBehaviour{

  @Override
  public void speak() {
    System.out.println("Quack");
  }
}
