package org.jnario.coffee

class CoffeeListParser {
  
  def parse(String string) {
    if(string.nullOrEmpty) return emptyList
    string.split("\r?\n").map[parseCoffeeDrinker]
  }
  
  def private parseCoffeeDrinker(String string){
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