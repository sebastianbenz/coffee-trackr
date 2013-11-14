package org.jnario.coffee.features;

import java.util.List;
import org.jnario.coffee.CoffeeDrinker;
import org.jnario.coffee.CoffeeListParser;
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
public abstract class TrackingCoffeeConsumptionFeatureBackground extends TrackingCoffeeConsumptionFeature {
  CoffeeTrackr coffeeTrackr;
  
  List<CoffeeDrinker> coffeeList;
  
  @Test
  @Order(0)
  @Named("Given a coffee list")
  public void _givenACoffeeList() {
    StepArguments _stepArguments = new StepArguments("Sebastian |||\nBirgit    ||  \n");
    final StepArguments args = _stepArguments;
    CoffeeListParser _coffeeListParser = new CoffeeListParser();
    String _first = JnarioIterableExtensions.<String>first(args);
    List<CoffeeDrinker> _parse = _coffeeListParser.parse(_first);
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
