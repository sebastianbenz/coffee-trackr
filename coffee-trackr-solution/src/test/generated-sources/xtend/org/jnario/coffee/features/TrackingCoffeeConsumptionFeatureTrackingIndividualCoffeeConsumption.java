package org.jnario.coffee.features;

import org.jnario.coffee.features.TrackingCoffeeConsumptionFeatureBackground;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Tracking individual coffee consumption")
@SuppressWarnings("all")
public class TrackingCoffeeConsumptionFeatureTrackingIndividualCoffeeConsumption extends TrackingCoffeeConsumptionFeatureBackground {
  int result;
  
  @Test
  @Order(0)
  @Named("Given a coffee list")
  public void _givenACoffeeList() {
    super._givenACoffeeList();
  }
  
  @Test
  @Order(1)
  @Named("And a coffee trackr")
  public void _andACoffeeTrackr() {
    super._andACoffeeTrackr();
  }
  
  @Test
  @Order(2)
  @Named("When I calculate the coffee consumption of \\\"Sebastian\\\"")
  public void _whenICalculateTheCoffeeConsumptionOfSebastian() {
    StepArguments _stepArguments = new StepArguments("Sebastian");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    int _calculateConsumptionOf = this.coffeeTrackr.calculateConsumptionOf(_first);
    this.result = _calculateConsumptionOf;
  }
  
  @Test
  @Order(3)
  @Named("Then the result is \\\"3\\\"")
  public void _thenTheResultIs3() {
    StepArguments _stepArguments = new StepArguments("3");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(this.result), Integer.valueOf(_int));
    Assert.assertTrue("\nExpected result => args.first.toInt but"
     + "\n     result is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(this.result)).toString()
     + "\n     args.first.toInt is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_int)).toString()
     + "\n     args.first is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     args is " + new org.hamcrest.StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
}
