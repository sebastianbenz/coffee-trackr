package org.jnario.coffee.specs

import org.jnario.coffee.CoffeeList

describe CoffeeList {
	
  fact "empty string contains no coffee drinkers"{
  	"".coffeeDrinkers should be emptyList
  }
  
  def coffeeDrinkers{
  	| input             | expectedName   | expectedCoffeeCount |
  	| "Sebastian"       | "Sebastian"    | 0                   |
  	| "Sebastian|"      | "Sebastian"    | 1                   |
  	| "Sebastian||"     | "Sebastian"    | 2                   |
  	| "Sebastian ||"    | "Sebastian"    | 2                   |
  	| "  Sebastian ||"  | "Sebastian"    | 2                   |
  }
  
  fact "a coffee drinker is defined by NAME |*"{
  	coffeeDrinkers.forEach[
  		val coffeeDrinker = input.coffeeDrinkers.first
  		coffeeDrinker.name => expectedName
  		coffeeDrinker.coffeeCount => expectedCoffeeCount
  	]
  }
  
  fact "multiple coffee drinkers are separated by new line"{
  	'''
    Sebastian |||
    Birgit ||
    	
  	'''.coffeeDrinkers.size => 3 
  }
  
  def coffeeDrinkers(CharSequence s){
  	CoffeeList.parse(s.toString).coffeeDrinkers
  }

}