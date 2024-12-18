package com.example.design.pattern.service.factory;

import com.example.design.pattern.behaviour.fly.FlyBehaviour;
import com.example.design.pattern.behaviour.speak.SpeakBehaviour;
import org.springframework.stereotype.Component;

@Component
public abstract class Duck {

  SpeakBehaviour speakBehaviour;
  FlyBehaviour flyBehaviour;

  public abstract void display();

  public void performFly() {
    flyBehaviour.fly();
  }

  public void performSpeak() {
    speakBehaviour.speak();
  }
}
