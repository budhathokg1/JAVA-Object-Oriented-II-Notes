import java.util.*;

public class TestTreeSet {
  public static void main(String[] args) {
    // Create a hash set
    Set<String> set = new HashSet<>();

    // Add strings to the set
    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    set.add("New York");

    TreeSet<String> treeSet = new TreeSet<>(set);
    System.out.println("Sorted tree set: " + treeSet);

    // Use the methods in SortedSet interface
    System.out.println("first(): " + treeSet.first());
    System.out.println("last(): " + treeSet.last());
    System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York")); // all elements less than
    System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York")); // all elements greater than or equal to

    // Use the methods in NavigableSet interface
    System.out.println("lower(\"P\"): " + treeSet.lower("P")); // "closest element less than"
    System.out.println("higher(\"P\"): " + treeSet.higher("P")); // "closest element greater than"
    System.out.println("floor(\"P\"): " + treeSet.floor("P")); // "closest element less than or equal to"
    System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P")); // "closest element greater than or equal to"
    System.out.println("floor(\"New York\"): " + treeSet.floor("New York"));
    System.out.println("ceiling(\"Paris\"): " + treeSet.ceiling("Paris"));
    System.out.println("pollFirst(): " + treeSet.pollFirst()); // remove and return least element
    System.out.println("pollLast(): " + treeSet.pollLast());   // remove and return greatest element
    System.out.println("New tree set: " + treeSet);
  }
}
