package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // Mark as a Spring Bean, making available for DI.
public class TrackCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k!";
  }
}
