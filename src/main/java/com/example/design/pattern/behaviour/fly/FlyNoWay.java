package com.example.design.pattern.behaviour.fly;

public class FlyNoWay implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("I cannot fly");
  }
}
