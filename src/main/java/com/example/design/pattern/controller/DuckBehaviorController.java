package com.example.design.pattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.design.pattern.service.DuckInterface;

@RestController
@RequestMapping("/api/duck-behaviour")
public class DuckBehaviorController {

  @Autowired
  private DuckInterface duckInterface;

  @GetMapping("/speak")
  public void speak(@RequestParam(value = "duckType") String duckType) {
    duckInterface.speak(duckType);
  }

  @GetMapping("/fly")
  public void fly(@RequestParam(value = "duckType") String duckType) {
    System.out.println(duckType);
    duckInterface.speak(duckType);
  }

}
