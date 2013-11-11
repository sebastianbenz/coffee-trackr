package org.jnario.coffee;

import org.jnario.coffee.FeaturesSuite;
import org.jnario.coffee.SpecsSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Coffee Trackr")
@Contains({ FeaturesSuite.class, SpecsSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeTrackrSuite {
}
