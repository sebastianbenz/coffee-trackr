package org.jnario.coffee.specs;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.coffee.CoffeeList;
import org.jnario.coffee.CoffeeTrackr;
import org.jnario.coffee.specs.CoffeeTrackrSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("calculateConsumptionOf")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeTrackrCalculateConsumptionOfSpec extends CoffeeTrackrSpec {
  @Test
  @Named("consumption is 0 if name no present")
  @Order(1)
  public void _consumptionIs0IfNameNoPresent() throws Exception {
    CoffeeList _parse = CoffeeList.parse("");
    CoffeeTrackr _coffeeTrackr = new CoffeeTrackr(_parse);
    final CoffeeTrackr trackr = _coffeeTrackr;
    int _calculateConsumptionOf = trackr.calculateConsumptionOf("Not present");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_calculateConsumptionOf), Integer.valueOf(0));
    Assert.assertTrue("\nExpected trackr.calculateConsumptionOf(\"Not present\") => 0 but"
     + "\n     trackr.calculateConsumptionOf(\"Not present\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_calculateConsumptionOf)).toString()
     + "\n     trackr is " + new org.hamcrest.StringDescription().appendValue(trackr).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("consumption is sum of drinker\\\'s coffee count")
  @Order(2)
  public void _consumptionIsSumOfDrinkerSCoffeeCount() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Sebastian |||");
    _builder.newLine();
    _builder.append("Birgit ||");
    _builder.newLine();
    _builder.append("Sebastian ||");
    _builder.newLine();
    CoffeeList _parse = CoffeeList.parse(_builder);
    CoffeeTrackr _coffeeTrackr = new CoffeeTrackr(_parse);
    final CoffeeTrackr trackr = _coffeeTrackr;
    int _calculateConsumptionOf = trackr.calculateConsumptionOf("Sebastian");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_calculateConsumptionOf), Integer.valueOf(5));
    Assert.assertTrue("\nExpected trackr.calculateConsumptionOf(\"Sebastian\") => 5 but"
     + "\n     trackr.calculateConsumptionOf(\"Sebastian\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_calculateConsumptionOf)).toString()
     + "\n     trackr is " + new org.hamcrest.StringDescription().appendValue(trackr).toString() + "\n", _doubleArrow);
    
  }
}
