package org.jnario.coffee.specs;

import com.google.common.collect.Lists;
import java.util.Collections;
import org.jnario.coffee.CoffeeDrinker;
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
    CoffeeDrinker _coffeeDrinker = new CoffeeDrinker("Sebastian", 5);
    CoffeeDrinker _coffeeDrinker_1 = new CoffeeDrinker("Birgit", 3);
    CoffeeTrackr _coffeeTrackr = new CoffeeTrackr(
      Collections.<CoffeeDrinker>unmodifiableList(Lists.<CoffeeDrinker>newArrayList(_coffeeDrinker, _coffeeDrinker_1)));
    final CoffeeTrackr trackr = _coffeeTrackr;
    int _overAllConsumption = trackr.overAllConsumption();
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_overAllConsumption), Integer.valueOf(8));
    Assert.assertTrue("\nExpected trackr.overAllConsumption => 8 but"
     + "\n     trackr.overAllConsumption is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_overAllConsumption)).toString()
     + "\n     trackr is " + new org.hamcrest.StringDescription().appendValue(trackr).toString() + "\n", _doubleArrow);
    
  }
}
