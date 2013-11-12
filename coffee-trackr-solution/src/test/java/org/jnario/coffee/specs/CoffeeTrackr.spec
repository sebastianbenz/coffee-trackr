package org.jnario.coffee.specs

import org.jnario.coffee.CoffeeDrinker
import org.jnario.coffee.CoffeeTrackr

describe CoffeeTrackr {
  
  
  
  context "calculateConsumptionOf"{
    
    fact "consumption is 0 if name no present"{
      val trackr = new CoffeeTrackr(emptyList)
      trackr.calculateConsumptionOf("Not present") => 0
    }
    
    fact "consumption is sum of drinker's coffee count"{
      val trackr = new CoffeeTrackr(#[
        new CoffeeDrinker("Sebastian", 5),
        new CoffeeDrinker("Birgit", 5)
      ])
      trackr.calculateConsumptionOf("Sebastian") => 5
    }
    
  }
  
  context "overAllConsumption"{
    fact "overall consumption is sum of all coffees"{
      val trackr = new CoffeeTrackr(#[
        new CoffeeDrinker("Sebastian", 5),
        new CoffeeDrinker("Birgit", 3)
      ])
      trackr.overAllConsumption => 8
    }
  }
}