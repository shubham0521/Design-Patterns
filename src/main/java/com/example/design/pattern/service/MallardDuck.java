package com.example.design.pattern.service;

import com.example.design.pattern.behaviour.fly.FlyWithWings;
import com.example.design.pattern.behaviour.speak.Quack;
import org.springframework.stereotype.Component;

public class MallardDuck extends Duck {

  public MallardDuck() {
    speakBehaviour = new Quack();
    flyBehaviour = new FlyWithWings();
  }

  @Override
  void display() {
    System.out.println("I'm a mallard duck");
  }
}
