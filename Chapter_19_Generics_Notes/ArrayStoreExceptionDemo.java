import java.util.ArrayList;

public class ArrayStoreExceptionDemo {
	public static void main(String[] args) {
		Integer j = 5;  // autoboxing
		Number n = j;
		Double d = 3.3; // autoboxing again
		n = d;
		
		//Integer[] intArray = new Integer[]{2, 3, 5, 7, 11, 13};
		//intArray[2] = 3.3;
		//Number[] numArray = intArray;
		//numArray[2] = 3.3;
		//doStuffToArray(intArray);
		//for (Integer i : intArray)
		//	System.out.print(i + " ");
		
		//ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		//ArrayList<Number> numArrayList = intArrayList;
		//numArrayList.set(2, 3.3);
		//doStuffToArrayList(intArrayList);
	}
	
	public static void doStuffToArray(Number[] numArray) {
		numArray[2] = 3.3;
	}
	
	public static void doStuffToArrayList(ArrayList<Number> numArrayList) {
		numArrayList.set(2, 3.3);
	}
}




