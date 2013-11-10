package org.jnario.coffee.features;

import org.jnario.coffee.CoffeeList;
import org.jnario.coffee.CoffeeTrackr;
import org.jnario.coffee.features.TrackingCoffeeConsumptionFeature;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Background:")
@SuppressWarnings("all")
public class TrackingCoffeeConsumptionFeatureBackground extends TrackingCoffeeConsumptionFeature {
  CoffeeList coffeeList;
  
  CoffeeTrackr coffeeTrackr;
  
  @Test
  @Order(0)
  @Named("Given a coffee list")
  public void _givenACoffeeList() {
    StepArguments _stepArguments = new StepArguments("Sebastian |||\nBirgit    ||  \n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    CoffeeList _parse = CoffeeList.parse(_first);
    this.coffeeList = _parse;
  }
  
  @Test
  @Order(1)
  @Named("And a coffee trackr")
  public void _andACoffeeTrackr() {
    CoffeeTrackr _coffeeTrackr = new CoffeeTrackr(this.coffeeList);
    this.coffeeTrackr = _coffeeTrackr;
  }
}
