package org.jnario.coffee.specs

import org.jnario.coffee.CoffeeTrackr
import static extension org.jnario.coffee.CoffeeList.*

describe CoffeeTrackr {
  
  
  
  context calculateConsumptionOf{
    
    fact "consumption is 0 if name no present"{
      val trackr = new CoffeeTrackr("".parse)
      trackr.calculateConsumptionOf("Not present") => 0
    }
    
    fact "consumption is sum of drinker's coffee count"{
      val trackr = new CoffeeTrackr('''
        Sebastian |||
        Birgit ||
        Sebastian ||
      '''.parse)
      trackr.calculateConsumptionOf("Sebastian") => 5
    }
    
  }
  
  context overAllConsumption{
    fact "overall consumption is sum of all coffees"{
      val trackr = new CoffeeTrackr('''
        Sebastian |||
        Birgit ||
        Sebastian ||
      '''.parse)
      trackr.overAllConsumption => 7
    }
  }
}