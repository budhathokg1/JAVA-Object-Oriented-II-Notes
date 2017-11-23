import java.util.*;

public class TestMap {
  public static void main(String[] args) {
    // Create a HashMap
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Smith", 30);
    hashMap.put("Anderson", 31);
    hashMap.put("Lewis", 29);
    hashMap.put("Cook", 29);
    hashMap.put("Cook", 30);
    System.out.println(hashMap.get("Cook"));

    System.out.println("Display entries in HashMap");
    System.out.println(hashMap + "\n");

    // Create a TreeMap from the preceding HashMap
    Map<String, Integer> treeMap = new TreeMap<>(hashMap);
    System.out.println("Display entries in ascending order of key");
    System.out.println(treeMap);

    // Display each entry with name and age
    System.out.print("\nNames and ages are ");
    treeMap.forEach(
      (name, age) -> System.out.print(name + ": " + age + " "));
    System.out.println();
    
    treeMap.forEach(
      (name, age) -> treeMap.put(name, age + 1));
    System.out.println();
    
    treeMap.forEach(
      (name, age) -> System.out.print(name + ": " + age + " "));
    System.out.println();
    
    for (Map.Entry<String, Integer> entry : treeMap.entrySet())
        entry.setValue(entry.getValue() + 1);
    System.out.println();    
    
    for (Map.Entry<String, Integer> entry : treeMap.entrySet())
      System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
    System.out.println();
  }
}
