import java.util.*;

public class QueueDemo {
  public static void main(String[] args) {
	Queue<String> queue = new LinkedList<>();
	//Queue<String> queue = new PriorityQueue<>();
    //Queue<String> queue = new PriorityQueue<>(4, Collections.reverseOrder());
    //Queue<String> queue = new PriorityQueue<>(4, new MyComparator());
    //Queue<String> queue = new PriorityQueue<>(4, new Comparator<String>() { 
  	//    	                                           public int compare(String s1, String s2) {
  	//		                                             return s1.length() - s2.length();
  	//    	                                     }});
    //Queue<String> queue = new PriorityQueue<>(4, (s1, s2) -> s1.length() - s2.length());
    //Queue<String> queue = new PriorityQueue<>(4, (s1, s2) -> { return s1.length() - s2.length(); });
    queue.offer("Oklahoma");
    queue.offer("Indiana");
    queue.offer("Georgia");
    queue.offer("Texas");

    while (queue.size() > 0) {
      System.out.print(queue.remove() + " ");
    }
   }
  
  private static class MyComparator implements
  	java.util.Comparator<String> {
	  @Override
	  public int compare(String s1, String s2) {
		  return s1.length() - s2.length();
	  }
  }
}
