package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // Mark as a Spring Bean, making available for DI.
public class BaseballCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes in batting practice";
  }
}
