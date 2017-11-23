public class WildCardNeedDemo {
  public static void main(String[] args ) {
     GenericStack<Integer> intStack = new GenericStack<>();
     intStack.push(1);
     intStack.push(2);
     intStack.push(-2);
     System.out.println("The max number is " + max(intStack));
     
	 GenericStack<Double> doubleStack = new GenericStack<>();
	 doubleStack.push(1.1);
	 doubleStack.push(2.2);
	 doubleStack.push(-2.2);
	 System.out.println("The max number is " + max(doubleStack));
	 
	 GenericStack<? extends Number> genStack = intStack; // Wildcard allows a more generic variable
	 genStack = doubleStack;
	 doubleStack.push(1.1);
	 doubleStack.push(2.2);
	 doubleStack.push(-2.2);	 
     System.out.println("The max number is " + max(genStack));
  }

  /** Find the maximum in a stack of numbers */
  public static <E extends Number> double max(GenericStack<E> stack) {
  //public static double max(GenericStack<? extends Number> stack) { // Wildcard allows concise syntax
     //stack.push(3);  // same as stack.push(new Integer(3));
     //stack.push(3.2); // same as stack.push(new Double(3.2));
	 double max = stack.pop().doubleValue(); // initialize max
	  
     while (!stack.isEmpty()) {
       double value = stack.pop().doubleValue();
       if (value > max)
         max = value;
     }

     return max;
  }
}
