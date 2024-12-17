package com.example.design.pattern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuckService implements DuckInterface{

  @Override
  public void display(String duckType) {
    Duck duck;
    if (duckType.equals("Mallard")) {
      duck = new MallardDuck();
      duck.display();
    } else {
      duck = new RubberDuck();
      duck.display();
    }
  }

  @Override
  public void speak(String duckType) {
    Duck duck;
    if (duckType.equals("Mallard")) {
      duck = new MallardDuck();
      duck.performSpeak();
    } else {
      duck = new RubberDuck();
      duck.performSpeak();
    }
  }

  @Override
  public void fly(String duckType) {
    Duck duck;
    if (duckType.equals("Mallard")) {
      duck = new MallardDuck();
      duck.performFly();
    } else {
      duck = new RubberDuck();
      duck.performFly();
    }
  }
}
