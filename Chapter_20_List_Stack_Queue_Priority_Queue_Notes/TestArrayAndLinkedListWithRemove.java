import java.util.*;

public class TestArrayAndLinkedListWithRemove {
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    arrayList.add(1); // 1 is autoboxed to new Integer(1)
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(1);
    arrayList.add(4);
    arrayList.add(0, 10);
    arrayList.add(3, 30);

    System.out.println("A list of integers in the array list:");
    System.out.println(arrayList);

    LinkedList<Object> linkedList = new LinkedList<>(arrayList);
    linkedList.add(1, "red");
    linkedList.removeLast();
    linkedList.addFirst("green");
    linkedList.remove(linkedList.size() - 2);
    linkedList.addLast("blue");

    System.out.println("Display the linked list forward:"); 
    ListIterator<Object> listIterator = linkedList.listIterator();
    // Print all elements while removing all strings
    while (listIterator.hasNext()) {
    	Object elt = listIterator.next();
    	System.out.print(elt + " ");
    	if (elt instanceof String)
    		listIterator.remove();
    }
    System.out.println();
  
    System.out.println("Display the linked list backward:");
    listIterator = linkedList.listIterator(linkedList.size());  // Is this line necessary?
    while (listIterator.hasPrevious()) {
      System.out.print(listIterator.previous() + " ");
    }
    System.out.println();
    
    System.out.println("Display forward using a for-each loop:");
    for (Object obj : linkedList)
      System.out.print(obj + " ");
    System.out.println();
  }
}     
