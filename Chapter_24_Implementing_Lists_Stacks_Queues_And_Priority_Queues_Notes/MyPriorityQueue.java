public class MyPriorityQueue<E extends Comparable<E>> {
  private Heap<E> heap = new Heap<E>();

  public void enqueue(E newObject) {
    heap.add(newObject);
  }

  public E dequeue() {
    return heap.remove();
  }
  
  public E peek() {
  	//return heap.peek(); Would be nice, but heap.peek() doesn't exist.
  	E value = heap.remove();
  	heap.add(value);
  	return value;
  }

  public int getSize() {
    return heap.getSize();
  }
}
