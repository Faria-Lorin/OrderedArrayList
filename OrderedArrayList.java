import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private int sortedIndex;

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private void indexFinder(T element){
      sortedIndex = 0;
      if (super.size() == 0){
          sortedIndex = 0;
      }
      for ( int i = 0; i < super.size();i++){
        if (super.get(super.size() - 1).compareTo(element) < 0){
          sortedIndex = super.size();
        }
        else if (super.get(i).compareTo(element) >= 0){
          sortedIndex = i;
      }
    }
  }


  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("No Nulls");
    }
    else{
      indexFinder(element);
      super.add(sortedIndex, element);
    }
    if( super.get(sortedIndex) == element){
      return true;
    }
    return false;
  }

  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("No Nulls");
    }
    else{
      indexFinder(element);
      super.add(sortedIndex, element);
    }
  }


  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("No Nulls");
    }
    else{
      T temp = super.get(index);
      super.remove(index);
      super.add(element);
      return temp;
    }
  }
}
