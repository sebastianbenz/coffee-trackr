package org.jnario.coffee;

import org.jnario.coffee.specs.CoffeeListSpec;
import org.jnario.coffee.specs.CoffeeTrackrSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Specs")
@Contains({ CoffeeListSpec.class, CoffeeTrackrSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecsSuite {
}
