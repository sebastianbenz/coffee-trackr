package org.jnario.coffee;

import org.jnario.coffee.features.TrackingCoffeeConsumptionFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Features")
@Contains(TrackingCoffeeConsumptionFeature.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeaturesSuite {
}
