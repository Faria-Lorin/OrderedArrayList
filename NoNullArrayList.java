import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("IllegalArgumentException no nulls allowed");
    }
    return super.add(element);
  }
}
