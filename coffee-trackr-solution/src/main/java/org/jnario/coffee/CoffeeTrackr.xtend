package org.jnario.coffee

@Data class CoffeeTrackr {
  
  CoffeeList coffeeList
  
  def calculateConsumptionOf(String name) {
  	val coffeeOfName = coffeeList.coffeeDrinkers.filter[it.name == name]
  	coffeeOfName.countCoffees
  }
  
  def private countCoffees(Iterable<CoffeeDrinker> coffeeDrinkers){
  	if(coffeeDrinkers.empty) return 0
  	coffeeDrinkers.map[coffeeCount].reduce[a, b|a + b]
  }
  
  def overAllConsumption() {
    return coffeeList.coffeeDrinkers.countCoffees
  }
  
}