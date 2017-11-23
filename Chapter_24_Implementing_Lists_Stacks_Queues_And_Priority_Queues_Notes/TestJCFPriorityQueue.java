// Same functionality as TestPriorityQueue.java, but uses
// java.util.PriorityQueue.
import java.util.*;

public class TestJCFPriorityQueue {
  public static void main(String[] args) {
    Patient patient1 = new Patient("John", 2);
    Patient patient2 = new Patient("Jim", 1);
    Patient patient3 = new Patient("Tim", 5);
    Patient patient4 = new Patient("Cindy", 7);
    
    PriorityQueue<Patient> priorityQueue 
      = new PriorityQueue<Patient>(Collections.reverseOrder());
    priorityQueue.offer(patient1);
    priorityQueue.offer(patient2);
    priorityQueue.offer(patient3);
    priorityQueue.offer(patient4);
    
    while (priorityQueue.size() > 0) 
      System.out.print(priorityQueue.poll() + " ");
  }
  
  static class Patient implements Comparable<Patient> {
    private String name;
    private int priority;
    
    public Patient(String name, int priority) {
      this.name = name;
      this.priority = priority;
    }
    
    @Override
    public String toString() {
      return name + "(priority:" + priority + ")";
    }
    
    public int compareTo(Patient o) {
      return this.priority - o.priority;
    }
  }
}
