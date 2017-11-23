import java.util.*;

public class TestHashMap {
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
    System.out.println(hashMap.toString());
    
    System.out.print("(1) Names and ages are ");
	for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
	}
	System.out.println();
	
    for (Map.Entry<String, Integer> entry : hashMap.entrySet())
        entry.setValue(entry.getValue() + 1);
    
    System.out.print("(2) Names and ages are ");
    for (Map.Entry<String, Integer> entry : hashMap.entrySet())
      System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
    System.out.println();
    
    hashMap.forEach(
      (name, age) -> hashMap.put(name, age + 1));
    
    System.out.print("(3) Names and ages are ");
    hashMap.forEach(
      (name, age) -> System.out.print(name + ": " + age + " "));
    System.out.println();
    
    Map<String, Integer> treeMap = new TreeMap<>(hashMap);
    System.out.print("(4) With the names in ascending order the ages are ");
    treeMap.forEach(
      (name, age) -> System.out.print(name + ": " + age + " "));
  }
}
