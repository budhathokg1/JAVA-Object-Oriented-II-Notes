public class SortStringIgnoreCase {
  public static void main(String[] args) {
    String[] cities = {"Atlanta", "Savannah", "new York", "dallas"};
    java.util.Arrays.sort(cities, 
    	(s1, s2) -> {return s1.compareTo(s2);});
        //(s1, s2) -> {return s1.compareToIgnoreCase(s2);});

    for (String s : cities) {
      System.out.print(s + " ");
    }
  }
}
