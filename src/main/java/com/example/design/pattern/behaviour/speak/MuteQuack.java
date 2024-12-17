package com.example.design.pattern.behaviour.speak;

public class MuteQuack implements SpeakBehaviour{

  @Override
  public void speak() {
    System.out.println("Mute Quack");
  }
}
