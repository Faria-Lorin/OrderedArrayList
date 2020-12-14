public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private int sortedIndex;

  private void indexFinder(T element){
    for ( int i = 0; i < super.size() - 1; i++){
      if ((this.get(i).compareTo(element) < 0 && this.get(i+1).compareTo(element) > 0) || (this.get(i).compareTo(element) == 0)){
        sortedIndex = i+1;
      }
    }
  }

  public boolean add(T element){
    indexFinder(element);
    add(sortedIndex, element);
    if (this.get(sortedIndex) == element){
      return true;
    }
    return false;
  }
}
