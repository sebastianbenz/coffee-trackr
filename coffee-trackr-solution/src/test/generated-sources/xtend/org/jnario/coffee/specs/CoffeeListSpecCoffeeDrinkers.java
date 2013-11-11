package org.jnario.coffee.specs;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class CoffeeListSpecCoffeeDrinkers extends ExampleTableRow {
  public CoffeeListSpecCoffeeDrinkers(final List<String> cellNames, final String input, final String expectedName, final int expectedCoffeeCount) {
    super(cellNames);
    this.input = input;
    this.expectedName = expectedName;
    this.expectedCoffeeCount = expectedCoffeeCount;
    
  }
  
  private String input;
  
  public String getInput() {
    return this.input;
  }
  
  private String expectedName;
  
  public String getExpectedName() {
    return this.expectedName;
  }
  
  private int expectedCoffeeCount;
  
  public int getExpectedCoffeeCount() {
    return this.expectedCoffeeCount;
  }
}
