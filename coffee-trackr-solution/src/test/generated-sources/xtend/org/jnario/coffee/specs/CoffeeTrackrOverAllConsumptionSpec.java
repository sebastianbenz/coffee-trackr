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

@Named("overAllConsumption")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeTrackrOverAllConsumptionSpec extends CoffeeTrackrSpec {
  @Test
  @Named("overall consumption is sum of all coffees")
  @Order(1)
  public void _overallConsumptionIsSumOfAllCoffees() throws Exception {
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
    int _overAllConsumption = trackr.overAllConsumption();
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_overAllConsumption), Integer.valueOf(7));
    Assert.assertTrue("\nExpected trackr.overAllConsumption => 7 but"
     + "\n     trackr.overAllConsumption is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_overAllConsumption)).toString()
     + "\n     trackr is " + new org.hamcrest.StringDescription().appendValue(trackr).toString() + "\n", _doubleArrow);
    
  }
}
