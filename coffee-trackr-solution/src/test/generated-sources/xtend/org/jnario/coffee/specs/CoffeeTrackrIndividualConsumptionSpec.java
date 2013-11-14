package org.jnario.coffee.specs;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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

@Named("individual consumption")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeTrackrIndividualConsumptionSpec extends CoffeeTrackrSpec {
  @Test
  @Named("is 0 if name is not present")
  @Order(1)
  public void _is0IfNameIsNotPresent() throws Exception {
    List<CoffeeDrinker> _emptyList = CollectionLiterals.<CoffeeDrinker>emptyList();
    CoffeeTrackr _coffeeTrackr = new CoffeeTrackr(_emptyList);
    final CoffeeTrackr trackr = _coffeeTrackr;
    int _calculateConsumptionOf = trackr.calculateConsumptionOf("Not present");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_calculateConsumptionOf), Integer.valueOf(0));
    Assert.assertTrue("\nExpected trackr.calculateConsumptionOf(\"Not present\") => 0 but"
     + "\n     trackr.calculateConsumptionOf(\"Not present\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_calculateConsumptionOf)).toString()
     + "\n     trackr is " + new org.hamcrest.StringDescription().appendValue(trackr).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("is sum of a coffee drinker\\\'s coffee count")
  @Order(2)
  public void _isSumOfACoffeeDrinkerSCoffeeCount() throws Exception {
    CoffeeDrinker _coffeeDrinker = new CoffeeDrinker("Sebastian", 5);
    CoffeeDrinker _coffeeDrinker_1 = new CoffeeDrinker("Birgit", 5);
    CoffeeTrackr _coffeeTrackr = new CoffeeTrackr(
      Collections.<CoffeeDrinker>unmodifiableList(Lists.<CoffeeDrinker>newArrayList(_coffeeDrinker, _coffeeDrinker_1)));
    final CoffeeTrackr trackr = _coffeeTrackr;
    int _calculateConsumptionOf = trackr.calculateConsumptionOf("Sebastian");
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_calculateConsumptionOf), Integer.valueOf(5));
    Assert.assertTrue("\nExpected trackr.calculateConsumptionOf(\"Sebastian\") => 5 but"
     + "\n     trackr.calculateConsumptionOf(\"Sebastian\") is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_calculateConsumptionOf)).toString()
     + "\n     trackr is " + new org.hamcrest.StringDescription().appendValue(trackr).toString() + "\n", _doubleArrow);
    
  }
}
