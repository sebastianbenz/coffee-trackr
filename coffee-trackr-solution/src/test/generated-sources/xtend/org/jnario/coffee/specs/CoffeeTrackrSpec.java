package org.jnario.coffee.specs;

import org.jnario.coffee.specs.CoffeeTrackrCalculateConsumptionOfSpec;
import org.jnario.coffee.specs.CoffeeTrackrOverAllConsumptionSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ CoffeeTrackrCalculateConsumptionOfSpec.class, CoffeeTrackrOverAllConsumptionSpec.class })
@Named("CoffeeTrackr")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeTrackrSpec {
}
