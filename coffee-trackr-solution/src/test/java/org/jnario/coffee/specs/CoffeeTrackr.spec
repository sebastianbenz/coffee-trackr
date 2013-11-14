package org.jnario.coffee.specs

import org.jnario.coffee.CoffeeDrinker
import org.jnario.coffee.CoffeeTrackr

describe CoffeeTrackr {
  
  context "individual consumption"{
    fact "is 0 if name is not present"{
      val trackr = new CoffeeTrackr(emptyList)
      trackr.calculateConsumptionOf("Not present") => 0
    }
    
    fact "is sum of a coffee drinker's coffee count"{
      val trackr = new CoffeeTrackr(#[
        new CoffeeDrinker("Sebastian", 5),
        new CoffeeDrinker("Birgit", 5)
      ])
      trackr.calculateConsumptionOf("Sebastian") => 5
    }
  }
  
  context "over all consumption"{
    fact "is sum of all coffees"{
      val trackr = new CoffeeTrackr(#[
        new CoffeeDrinker("Sebastian", 5),
        new CoffeeDrinker("Birgit", 3)
      ])
      trackr.overAllConsumption => 8
    }
  }
}