package org.jnario.coffee;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.jnario.coffee.CoffeeDrinker;

@SuppressWarnings("all")
public class CoffeeListParser {
  public List<CoffeeDrinker> parse(final String string) {
    List<CoffeeDrinker> _xblockexpression = null;
    {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(string);
      if (_isNullOrEmpty) {
        return CollectionLiterals.<CoffeeDrinker>emptyList();
      }
      String[] _split = string.split("\r?\n");
      final Function1<String,CoffeeDrinker> _function = new Function1<String,CoffeeDrinker>() {
        public CoffeeDrinker apply(final String it) {
          CoffeeDrinker _parseCoffeeDrinker = CoffeeListParser.this.parseCoffeeDrinker(it);
          return _parseCoffeeDrinker;
        }
      };
      List<CoffeeDrinker> _map = ListExtensions.<String, CoffeeDrinker>map(((List<String>)Conversions.doWrapArray(_split)), _function);
      _xblockexpression = (_map);
    }
    return _xblockexpression;
  }
  
  private CoffeeDrinker parseCoffeeDrinker(final String string) {
    CoffeeDrinker _xblockexpression = null;
    {
      String name = string.trim();
      int coffeeCount = 0;
      final int indexOfPipe = name.indexOf("|");
      boolean _greaterThan = (indexOfPipe > 0);
      if (_greaterThan) {
        int _length = name.length();
        int _minus = (_length - indexOfPipe);
        coffeeCount = _minus;
        String _substring = name.substring(0, indexOfPipe);
        String _trim = _substring.trim();
        name = _trim;
      }
      CoffeeDrinker _coffeeDrinker = new CoffeeDrinker(name, coffeeCount);
      _xblockexpression = (_coffeeDrinker);
    }
    return _xblockexpression;
  }
}
