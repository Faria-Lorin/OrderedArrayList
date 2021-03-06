import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("IllegalArgumentException NO nulls allowed");
    }
    return super.add(element);
  }

  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("IllegalArgumentException NO nulls allowed");
    }
    super.add(index,element);
  }

  public T set( int index, T element){
    if (element == null){
      throw new IllegalArgumentException("IllegalArgumentException NO nulls allowed");
    }
    return super.set(index,element);
  }
}
