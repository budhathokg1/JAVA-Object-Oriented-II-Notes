import java.util.*;

public class CountOccurrenceOfWords {
  public static void main(String[] args) {
    // Set text in a string
    String text = "Good morning. Have a good class. " +
      "Have a good visit. Have fun!";

    // Create a TreeMap to hold words as keys and counts as values
    Map<String, Integer> map = new TreeMap<>();

    String[] words = text.split("[ \n\t\r.,;:!?()]");
    for (int i = 0; i < words.length; i++) {
      String key = words[i].toLowerCase();
      
      if (key.length() > 0)
        if (!map.containsKey(key))
          map.put(key, 1);
        else
          map.put(key, map.get(key) + 1);
    }
    
    // Get key and value from each entry
    for (Map.Entry<String, Integer> entry : map.entrySet())
    	System.out.println(entry.getKey() + "\t" + entry.getValue());
    System.out.println();

    // Display key and value for each entry -- shorter way that uses a stream
    map.forEach((k, v) -> System.out.println(k + "\t" + v));
  }
}

