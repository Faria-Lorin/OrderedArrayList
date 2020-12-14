public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private int sortedIndex;

  private int indexFinder(T element){
    for ( int i = 0; i < super.size() - 1; i++){
      if ((this.get(i).compareTo(element) < 0 && this.get(i+1).compareTo(element) > 0) || (this.get(i).compareTo(element) == 0)){
        sortedIndex = i+1;
      }
    }
    return sortedIndex;
  }
}
