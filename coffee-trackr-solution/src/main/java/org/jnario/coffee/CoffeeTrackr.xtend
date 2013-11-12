package org.jnario.coffee

import java.util.List

@Data class CoffeeTrackr {
  
  List<CoffeeDrinker> coffeeList
  
  def calculateConsumptionOf(String name) {
  	val coffeeOfName = coffeeList.filter[it.name == name]
  	coffeeOfName.countCoffees
  }
  
  def private countCoffees(Iterable<CoffeeDrinker> coffeeDrinkers){
  	if(coffeeDrinkers.empty) return 0
  	coffeeDrinkers.map[coffeeCount].reduce[a, b|a + b]
  }
  
  def overAllConsumption() {
    return coffeeList.countCoffees
  }
  
}