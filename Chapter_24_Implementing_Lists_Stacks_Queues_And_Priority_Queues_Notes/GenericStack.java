public class GenericStack<E> {
  private java.util.ArrayList<E> list 
  	= new java.util.ArrayList<E>();

  public int getSize() {
    return list.size();
  }

  public E peek() {
    return list.get(getSize() - 1);
  }

  public void push(E o) {
    list.add(o);
  }

  public E pop() {
    return list.remove(getSize() - 1);
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  @Override
  public String toString() {
	return "stack: " + list.toString();
  }
}
