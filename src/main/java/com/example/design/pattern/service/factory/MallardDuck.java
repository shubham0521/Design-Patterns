package com.example.design.pattern.service.factory;

import com.example.design.pattern.behaviour.fly.FlyWithWings;
import com.example.design.pattern.behaviour.speak.Quack;
import org.springframework.stereotype.Component;

@Component
public class MallardDuck extends Duck {

  public MallardDuck() {
    speakBehaviour = new Quack();
    flyBehaviour = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a mallard duck");
  }
}
