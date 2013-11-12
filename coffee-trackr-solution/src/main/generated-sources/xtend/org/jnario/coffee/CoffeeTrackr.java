package org.jnario.coffee;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jnario.coffee.CoffeeDrinker;

@Data
@SuppressWarnings("all")
public class CoffeeTrackr {
  private final List<CoffeeDrinker> _coffeeList;
  
  public List<CoffeeDrinker> getCoffeeList() {
    return this._coffeeList;
  }
  
  public int calculateConsumptionOf(final String name) {
    int _xblockexpression = (int) 0;
    {
      List<CoffeeDrinker> _coffeeList = this.getCoffeeList();
      final Function1<CoffeeDrinker,Boolean> _function = new Function1<CoffeeDrinker,Boolean>() {
        public Boolean apply(final CoffeeDrinker it) {
          String _name = it.getName();
          boolean _equals = Objects.equal(_name, name);
          return Boolean.valueOf(_equals);
        }
      };
      final Iterable<CoffeeDrinker> coffeeOfName = IterableExtensions.<CoffeeDrinker>filter(_coffeeList, _function);
      int _countCoffees = this.countCoffees(coffeeOfName);
      _xblockexpression = (_countCoffees);
    }
    return _xblockexpression;
  }
  
  private int countCoffees(final Iterable<CoffeeDrinker> coffeeDrinkers) {
    Integer _xblockexpression = null;
    {
      boolean _isEmpty = IterableExtensions.isEmpty(coffeeDrinkers);
      if (_isEmpty) {
        return 0;
      }
      final Function1<CoffeeDrinker,Integer> _function = new Function1<CoffeeDrinker,Integer>() {
        public Integer apply(final CoffeeDrinker it) {
          int _coffeeCount = it.getCoffeeCount();
          return Integer.valueOf(_coffeeCount);
        }
      };
      Iterable<Integer> _map = IterableExtensions.<CoffeeDrinker, Integer>map(coffeeDrinkers, _function);
      final Function2<Integer,Integer,Integer> _function_1 = new Function2<Integer,Integer,Integer>() {
        public Integer apply(final Integer a, final Integer b) {
          int _plus = ((a).intValue() + (b).intValue());
          return Integer.valueOf(_plus);
        }
      };
      Integer _reduce = IterableExtensions.<Integer>reduce(_map, _function_1);
      _xblockexpression = (_reduce);
    }
    return _xblockexpression;
  }
  
  public int overAllConsumption() {
    List<CoffeeDrinker> _coffeeList = this.getCoffeeList();
    return this.countCoffees(_coffeeList);
  }
  
  public CoffeeTrackr(final List<CoffeeDrinker> coffeeList) {
    super();
    this._coffeeList = coffeeList;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_coffeeList== null) ? 0 : _coffeeList.hashCode());
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
    CoffeeTrackr other = (CoffeeTrackr) obj;
    if (_coffeeList == null) {
      if (other._coffeeList != null)
        return false;
    } else if (!_coffeeList.equals(other._coffeeList))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
