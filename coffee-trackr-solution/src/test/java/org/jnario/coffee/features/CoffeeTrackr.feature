package org.jnario.coffee.features

import org.jnario.coffee.*
import java.util.List
import org.jnario.coffee.CoffeeDrinker

Feature: Tracking Coffee Consumption

  As developers
  In order to control our coffein consumption
  we want a coffee tracking app
  
  Background:
   CoffeeTrackr coffeeTrackr
  
  List<CoffeeDrinker> coffeeList
  
   Given a coffee list
      '''
      Sebastian |||
      Birgit    ||  
    '''
     coffeeList = new CoffeeListParser().parse(args.first)
    And a coffee trackr
      coffeeTrackr = new CoffeeTrackr(coffeeList)
  
  Scenario: Tracking individual coffee consumption
    int result
    When I calculate the coffee consumption of "Sebastian"  
      result = coffeeTrackr.calculateConsumptionOf(args.first)
    Then the result is "3"
      result => args.first.toInt
  
  Scenario: Tracking overall coffee consumption
    
    When I calculate the overall coffee consumption
      result = coffeeTrackr.overAllConsumption
    Then the result is "5"