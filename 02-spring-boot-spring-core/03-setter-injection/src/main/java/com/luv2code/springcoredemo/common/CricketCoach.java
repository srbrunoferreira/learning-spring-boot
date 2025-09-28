package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // Mark as a Spring Bean, making available for DI.
public class CricketCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes!!!!2";
  }
}
