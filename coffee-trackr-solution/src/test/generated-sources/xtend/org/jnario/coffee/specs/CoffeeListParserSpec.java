package org.jnario.coffee.specs;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.coffee.CoffeeDrinker;
import org.jnario.coffee.CoffeeListParser;
import org.jnario.coffee.specs.CoffeeListParserSpecCoffeeDrinkerExamples;
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

@Named("CoffeeListParser")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CoffeeListParserSpec {
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
  
  public ExampleTable<CoffeeListParserSpecCoffeeDrinkerExamples> _initCoffeeListParserSpecCoffeeDrinkerExamples() {
    return ExampleTable.create("coffeeDrinkerExamples", 
      Arrays.asList("input", "expectedName", "expectedCoffeeCount"), 
      new CoffeeListParserSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian\"", "\"Sebastian\"", "0"), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell0(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell1(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell2()),
      new CoffeeListParserSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian|\"", "\"Sebastian\"", "1"), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell3(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell4(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell5()),
      new CoffeeListParserSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian||\"", "\"Sebastian\"", "2"), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell6(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell7(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell8()),
      new CoffeeListParserSpecCoffeeDrinkerExamples(  Arrays.asList("\"Sebastian ||\"", "\"Sebastian\"", "2"), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell9(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell10(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell11()),
      new CoffeeListParserSpecCoffeeDrinkerExamples(  Arrays.asList("\"  Sebastian ||\"", "\"Sebastian\"", "2"), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell12(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell13(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell14()),
      new CoffeeListParserSpecCoffeeDrinkerExamples(  Arrays.asList("\"  Sebastian || \"", "\"Sebastian\"", "2"), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell15(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell16(), _initCoffeeListParserSpecCoffeeDrinkerExamplesCell17())
    );
  }
  
  protected ExampleTable<CoffeeListParserSpecCoffeeDrinkerExamples> coffeeDrinkerExamples = _initCoffeeListParserSpecCoffeeDrinkerExamples();
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell0() {
    return "Sebastian";
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell1() {
    return "Sebastian";
  }
  
  public int _initCoffeeListParserSpecCoffeeDrinkerExamplesCell2() {
    return 0;
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell3() {
    return "Sebastian|";
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell4() {
    return "Sebastian";
  }
  
  public int _initCoffeeListParserSpecCoffeeDrinkerExamplesCell5() {
    return 1;
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell6() {
    return "Sebastian||";
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell7() {
    return "Sebastian";
  }
  
  public int _initCoffeeListParserSpecCoffeeDrinkerExamplesCell8() {
    return 2;
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell9() {
    return "Sebastian ||";
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell10() {
    return "Sebastian";
  }
  
  public int _initCoffeeListParserSpecCoffeeDrinkerExamplesCell11() {
    return 2;
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell12() {
    return "  Sebastian ||";
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell13() {
    return "Sebastian";
  }
  
  public int _initCoffeeListParserSpecCoffeeDrinkerExamplesCell14() {
    return 2;
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell15() {
    return "  Sebastian || ";
  }
  
  public String _initCoffeeListParserSpecCoffeeDrinkerExamplesCell16() {
    return "Sebastian";
  }
  
  public int _initCoffeeListParserSpecCoffeeDrinkerExamplesCell17() {
    return 2;
  }
  
  @Test
  @Named("a coffee drinker is defined by NAME |*")
  @Order(2)
  public void _aCoffeeDrinkerIsDefinedByNAME() throws Exception {
    final Procedure1<CoffeeListParserSpecCoffeeDrinkerExamples> _function = new Procedure1<CoffeeListParserSpecCoffeeDrinkerExamples>() {
      public void apply(final CoffeeListParserSpecCoffeeDrinkerExamples it) {
        String _input = it.getInput();
        List<CoffeeDrinker> _coffeeDrinkers = CoffeeListParserSpec.this.coffeeDrinkers(_input);
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
    Each.<CoffeeListParserSpecCoffeeDrinkerExamples>forEach(this.coffeeDrinkerExamples, _function);
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
    CoffeeListParser _coffeeListParser = new CoffeeListParser();
    String _string = s.toString();
    List<CoffeeDrinker> _parse = _coffeeListParser.parse(_string);
    return _parse;
  }
}
