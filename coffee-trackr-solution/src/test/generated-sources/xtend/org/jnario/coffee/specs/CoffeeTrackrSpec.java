package org.jnario.coffee.specs;

import org.jnario.coffee.specs.CoffeeTrackrIndividualConsumptionSpec;
import org.jnario.coffee.specs.CoffeeTrackrOverAllConsumptionSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ CoffeeTrackrIndividualConsumptionSpec.class, CoffeeTrackrOverAllConsumptionSpec.class })
@Named("CoffeeTrackr")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeTrackrSpec {
}
