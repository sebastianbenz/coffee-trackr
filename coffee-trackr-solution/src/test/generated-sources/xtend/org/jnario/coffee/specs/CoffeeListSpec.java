package org.jnario.coffee.specs;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("CoffeeList")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeListSpec {
  @Test
  @Ignore
  @Named("empty string contains no coffee drinkers [PENDING]")
  @Order(1)
  public void _emptyStringContainsNoCoffeeDrinkers() throws Exception {
  }
}
