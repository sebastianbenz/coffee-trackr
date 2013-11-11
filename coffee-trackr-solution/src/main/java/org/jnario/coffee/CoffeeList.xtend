package org.jnario.coffee

import java.util.List

@Data class CoffeeList {
  
  List<CoffeeDrinker> coffeeDrinkers
  
  def static CoffeeList parse(CharSequence s) {
    val string = s.toString
    if(string.nullOrEmpty) return new CoffeeList(emptyList)
    val coffeeDrinkers = string.split("\r?\n").map[parseCoffeeDrinker]
    new CoffeeList(coffeeDrinkers)
  }
  
  def private static parseCoffeeDrinker(String string){
    var name = string.trim
    var coffeeCount = 0
    val indexOfPipe = name.indexOf('|')
    if(indexOfPipe > 0){
      coffeeCount = name.length - indexOfPipe
      name = name.substring(0, indexOfPipe).trim
    }
    new CoffeeDrinker(name, coffeeCount);
  }
  
  
}