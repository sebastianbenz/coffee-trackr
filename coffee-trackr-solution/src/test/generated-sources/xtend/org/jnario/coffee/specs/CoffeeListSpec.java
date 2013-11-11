package org.jnario.coffee.specs;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.coffee.CoffeeDrinker;
import org.jnario.coffee.CoffeeList;
import org.jnario.coffee.specs.CoffeeListSpecCoffeeDrinkers;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("CoffeeList")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeListSpec {
  @Test
  @Named("empty string contains no coffee drinkers")
  @Order(1)
  public void _emptyStringContainsNoCoffeeDrinkers() throws Exception {
    List<CoffeeDrinker> _coffeeDrinkers = this.coffeeDrinkers("");
    List<CoffeeDrinker> _emptyList = CollectionLiterals.<CoffeeDrinker>emptyList();
    boolean _should_be = Should.<List<CoffeeDrinker>>should_be(_coffeeDrinkers, _emptyList);
    Assert.assertTrue("\nExpected \"\".coffeeDrinkers should be emptyList but"
     + "\n     \"\".coffeeDrinkers is " + new org.hamcrest.StringDescription().appendValue(_coffeeDrinkers).toString()
     + "\n     emptyList is " + new org.hamcrest.StringDescription().appendValue(_emptyList).toString() + "\n", _should_be);
    
  }
  
  public ExampleTable<CoffeeListSpecCoffeeDrinkers> _initCoffeeListSpecCoffeeDrinkers() {
    return ExampleTable.create("coffeeDrinkers", 
      Arrays.asList("input", "expectedName", "expectedCoffeeCount"), 
      new CoffeeListSpecCoffeeDrinkers(  Arrays.asList("\"Sebastian\"", "\"Sebastian\"", "0"), _initCoffeeListSpecCoffeeDrinkersCell0(), _initCoffeeListSpecCoffeeDrinkersCell1(), _initCoffeeListSpecCoffeeDrinkersCell2()),
      new CoffeeListSpecCoffeeDrinkers(  Arrays.asList("\"Sebastian|\"", "\"Sebastian\"", "1"), _initCoffeeListSpecCoffeeDrinkersCell3(), _initCoffeeListSpecCoffeeDrinkersCell4(), _initCoffeeListSpecCoffeeDrinkersCell5()),
      new CoffeeListSpecCoffeeDrinkers(  Arrays.asList("\"Sebastian||\"", "\"Sebastian\"", "2"), _initCoffeeListSpecCoffeeDrinkersCell6(), _initCoffeeListSpecCoffeeDrinkersCell7(), _initCoffeeListSpecCoffeeDrinkersCell8()),
      new CoffeeListSpecCoffeeDrinkers(  Arrays.asList("\"Sebastian ||\"", "\"Sebastian\"", "2"), _initCoffeeListSpecCoffeeDrinkersCell9(), _initCoffeeListSpecCoffeeDrinkersCell10(), _initCoffeeListSpecCoffeeDrinkersCell11()),
      new CoffeeListSpecCoffeeDrinkers(  Arrays.asList("\"  Sebastian ||\"", "\"Sebastian\"", "2"), _initCoffeeListSpecCoffeeDrinkersCell12(), _initCoffeeListSpecCoffeeDrinkersCell13(), _initCoffeeListSpecCoffeeDrinkersCell14())
    );
  }
  
  protected ExampleTable<CoffeeListSpecCoffeeDrinkers> coffeeDrinkers = _initCoffeeListSpecCoffeeDrinkers();
  
  public String _initCoffeeListSpecCoffeeDrinkersCell0() {
    return "Sebastian";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell1() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkersCell2() {
    return 0;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell3() {
    return "Sebastian|";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell4() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkersCell5() {
    return 1;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell6() {
    return "Sebastian||";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell7() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkersCell8() {
    return 2;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell9() {
    return "Sebastian ||";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell10() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkersCell11() {
    return 2;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell12() {
    return "  Sebastian ||";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkersCell13() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkersCell14() {
    return 2;
  }
  
  @Test
  @Named("a coffee drinker is defined by NAME |*")
  @Order(2)
  public void _aCoffeeDrinkerIsDefinedByNAME() throws Exception {
    final Procedure1<CoffeeListSpecCoffeeDrinkers> _function = new Procedure1<CoffeeListSpecCoffeeDrinkers>() {
      public void apply(final CoffeeListSpecCoffeeDrinkers it) {
        String _input = it.getInput();
        List<CoffeeDrinker> _coffeeDrinkers = CoffeeListSpec.this.coffeeDrinkers(_input);
        final CoffeeDrinker coffeeDrinker = JnarioIterableExtensions.<CoffeeDrinker>first(_coffeeDrinkers);
        String _name = coffeeDrinker.getName();
        String _expectedName = it.getExpectedName();
        boolean _doubleArrow = Should.<String>operator_doubleArrow(_name, _expectedName);
        Assert.assertTrue("\nExpected coffeeDrinker.name => expectedName but"
         + "\n     coffeeDrinker.name is " + new org.hamcrest.StringDescription().appendValue(_name).toString()
         + "\n     coffeeDrinker is " + new org.hamcrest.StringDescription().appendValue(coffeeDrinker).toString()
         + "\n     expectedName is " + new org.hamcrest.StringDescription().appendValue(_expectedName).toString() + "\n", _doubleArrow);
        
        int _coffeeCount = coffeeDrinker.getCoffeeCount();
        int _expectedCoffeeCount = it.getExpectedCoffeeCount();
        boolean _doubleArrow_1 = Should.<Integer>operator_doubleArrow(Integer.valueOf(_coffeeCount), Integer.valueOf(_expectedCoffeeCount));
        Assert.assertTrue("\nExpected coffeeDrinker.coffeeCount => expectedCoffeeCount but"
         + "\n     coffeeDrinker.coffeeCount is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_coffeeCount)).toString()
         + "\n     coffeeDrinker is " + new org.hamcrest.StringDescription().appendValue(coffeeDrinker).toString()
         + "\n     expectedCoffeeCount is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_expectedCoffeeCount)).toString() + "\n", _doubleArrow_1);
        
      }
    };
    Each.<CoffeeListSpecCoffeeDrinkers>forEach(this.coffeeDrinkers, _function);
  }
  
  @Test
  @Named("multiple coffee drinkers are separated by new line")
  @Order(3)
  public void _multipleCoffeeDrinkersAreSeparatedByNewLine() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Sebastian |||");
    _builder.newLine();
    _builder.append("Birgit ||");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    List<CoffeeDrinker> _coffeeDrinkers = this.coffeeDrinkers(_builder);
    int _size = _coffeeDrinkers.size();
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(3));
    Assert.assertTrue("\nExpected \'\'\'\n    Sebastian |||\n    Birgit ||\n    \t\n  \t\'\'\'.coffeeDrinkers.size => 3 but"
     + "\n     \'\'\'\n    Sebastian |||\n    Birgit ||\n    \t\n  \t\'\'\'.coffeeDrinkers.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     \'\'\'\n    Sebastian |||\n    Birgit ||\n    \t\n  \t\'\'\'.coffeeDrinkers is " + new org.hamcrest.StringDescription().appendValue(_coffeeDrinkers).toString()
     + "\n     \'\'\'\n    Sebastian |||\n    Birgit ||\n    \t\n  \t\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  public List<CoffeeDrinker> coffeeDrinkers(final CharSequence s) {
    String _string = s.toString();
    CoffeeList _parse = CoffeeList.parse(_string);
    List<CoffeeDrinker> _coffeeDrinkers = _parse.getCoffeeDrinkers();
    return _coffeeDrinkers;
  }
}
