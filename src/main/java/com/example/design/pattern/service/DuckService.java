package com.example.design.pattern.service;

import com.example.design.pattern.service.factory.Duck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuckService implements DuckInterface{

  @Autowired
  List<Duck> ducks;

  private Duck getDuck(String duckType) {
    return ducks.stream()
        .filter(duck -> duckType.equals(duck.getClass().getSimpleName()))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("Duck not found"));
  }

  @Override
  public void speak(String duckType) {
    getDuck(duckType).display();
    getDuck(duckType).performSpeak();
  }

  @Override
  public void fly(String duckType) {
    getDuck(duckType).display();
    getDuck(duckType).performFly();
  }
}
