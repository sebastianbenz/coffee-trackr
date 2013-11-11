package org.jnario.coffee;

import java.util.List;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jnario.coffee.CoffeeDrinker;

@Data
@SuppressWarnings("all")
public class CoffeeList {
  private final List<CoffeeDrinker> _coffeeDrinkers;
  
  public List<CoffeeDrinker> getCoffeeDrinkers() {
    return this._coffeeDrinkers;
  }
  
  public static CoffeeList parse(final CharSequence s) {
    CoffeeList _xblockexpression = null;
    {
      final String string = s.toString();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(string);
      if (_isNullOrEmpty) {
        List<CoffeeDrinker> _emptyList = CollectionLiterals.<CoffeeDrinker>emptyList();
        CoffeeList _coffeeList = new CoffeeList(_emptyList);
        return _coffeeList;
      }
      String[] _split = string.split("\r?\n");
      final Function1<String,CoffeeDrinker> _function = new Function1<String,CoffeeDrinker>() {
        public CoffeeDrinker apply(final String it) {
          CoffeeDrinker _parseCoffeeDrinker = CoffeeList.parseCoffeeDrinker(it);
          return _parseCoffeeDrinker;
        }
      };
      final List<CoffeeDrinker> coffeeDrinkers = ListExtensions.<String, CoffeeDrinker>map(((List<String>)Conversions.doWrapArray(_split)), _function);
      CoffeeList _coffeeList_1 = new CoffeeList(coffeeDrinkers);
      _xblockexpression = (_coffeeList_1);
    }
    return _xblockexpression;
  }
  
  private static CoffeeDrinker parseCoffeeDrinker(final String string) {
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
  
  public CoffeeList(final List<CoffeeDrinker> coffeeDrinkers) {
    super();
    this._coffeeDrinkers = coffeeDrinkers;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_coffeeDrinkers== null) ? 0 : _coffeeDrinkers.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CoffeeList other = (CoffeeList) obj;
    if (_coffeeDrinkers == null) {
      if (other._coffeeDrinkers != null)
        return false;
    } else if (!_coffeeDrinkers.equals(other._coffeeDrinkers))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
