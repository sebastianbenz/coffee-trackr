package org.jnario.coffee.specs;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.coffee.CoffeeDrinker;
import org.jnario.coffee.CoffeeList;
import org.jnario.coffee.specs.CoffeeListSpecCoffeeDrinkerExamples;
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
  
  public ExampleTable<CoffeeListSpecCoffeeDrinkerExamples> _initCoffeeListSpecCoffeeDrinkerExamples() {
    return ExampleTable.create("coffeeDrinkerExamples", 
      Arrays.asList("input", "expectedName", "expectedCoffeeCount"), 
      new CoffeeListSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian\"", "\"Sebastian\"", "0"), _initCoffeeListSpecCoffeeDrinkerExamplesCell0(), _initCoffeeListSpecCoffeeDrinkerExamplesCell1(), _initCoffeeListSpecCoffeeDrinkerExamplesCell2()),
      new CoffeeListSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian|\"", "\"Sebastian\"", "1"), _initCoffeeListSpecCoffeeDrinkerExamplesCell3(), _initCoffeeListSpecCoffeeDrinkerExamplesCell4(), _initCoffeeListSpecCoffeeDrinkerExamplesCell5()),
      new CoffeeListSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian||\"", "\"Sebastian\"", "2"), _initCoffeeListSpecCoffeeDrinkerExamplesCell6(), _initCoffeeListSpecCoffeeDrinkerExamplesCell7(), _initCoffeeListSpecCoffeeDrinkerExamplesCell8()),
      new CoffeeListSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian ||\"", "\"Sebastian\"", "2"), _initCoffeeListSpecCoffeeDrinkerExamplesCell9(), _initCoffeeListSpecCoffeeDrinkerExamplesCell10(), _initCoffeeListSpecCoffeeDrinkerExamplesCell11()),
      new CoffeeListSpecCoffeeDrinkerExamples(  Arrays.asList("\"  Sebastian ||\"", "\"Sebastian\"", "2"), _initCoffeeListSpecCoffeeDrinkerExamplesCell12(), _initCoffeeListSpecCoffeeDrinkerExamplesCell13(), _initCoffeeListSpecCoffeeDrinkerExamplesCell14()),
      new CoffeeListSpecCoffeeDrinkerExamples(  Arrays.asList("\"  Sebastian || \"", "\"Sebastian\"", "2"), _initCoffeeListSpecCoffeeDrinkerExamplesCell15(), _initCoffeeListSpecCoffeeDrinkerExamplesCell16(), _initCoffeeListSpecCoffeeDrinkerExamplesCell17())
    );
  }
  
  protected ExampleTable<CoffeeListSpecCoffeeDrinkerExamples> coffeeDrinkerExamples = _initCoffeeListSpecCoffeeDrinkerExamples();
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell0() {
    return "Sebastian";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell1() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkerExamplesCell2() {
    return 0;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell3() {
    return "Sebastian|";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell4() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkerExamplesCell5() {
    return 1;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell6() {
    return "Sebastian||";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell7() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkerExamplesCell8() {
    return 2;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell9() {
    return "Sebastian ||";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell10() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkerExamplesCell11() {
    return 2;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell12() {
    return "  Sebastian ||";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell13() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkerExamplesCell14() {
    return 2;
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell15() {
    return "  Sebastian || ";
  }
  
  public String _initCoffeeListSpecCoffeeDrinkerExamplesCell16() {
    return "Sebastian";
  }
  
  public int _initCoffeeListSpecCoffeeDrinkerExamplesCell17() {
    return 2;
  }
  
  @Test
  @Named("a coffee drinker is defined by NAME |*")
  @Order(2)
  public void _aCoffeeDrinkerIsDefinedByNAME() throws Exception {
    final Procedure1<CoffeeListSpecCoffeeDrinkerExamples> _function = new Procedure1<CoffeeListSpecCoffeeDrinkerExamples>() {
      public void apply(final CoffeeListSpecCoffeeDrinkerExamples it) {
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
    Each.<CoffeeListSpecCoffeeDrinkerExamples>forEach(this.coffeeDrinkerExamples, _function);
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
    CoffeeList _parse = CoffeeList.parse(s);
    List<CoffeeDrinker> _coffeeDrinkers = _parse.getCoffeeDrinkers();
    return _coffeeDrinkers;
  }
}
