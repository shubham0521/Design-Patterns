package com.example.design.pattern.service.factory;

import com.example.design.pattern.behaviour.fly.FlyNoWay;
import com.example.design.pattern.behaviour.speak.MuteQuack;
import org.springframework.stereotype.Component;

@Component
public class RubberDuck extends Duck {

  public RubberDuck() {
    speakBehaviour = new MuteQuack();
    flyBehaviour = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("I'm a Rubber Duck");
  }
}
