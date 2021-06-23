package GoldmanSachs.MoreAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeanderingArray {

public static List<Integer> createList(){
		
		List<Integer> nums = new ArrayList<>();
		nums.add(7);
		nums.add(5);
		nums.add(2);
		nums.add(6);
		nums.add(8);
		nums.add(-2);
		nums.add(25);
		nums.add(25);
		return nums;
	}

	public static List<Integer> meanderingArray(List<Integer> unsorted) {
	    // Write your code here

//		**Validate Inputs**
//		Validate list size
		
		int listSize = unsorted.size();
		
		if(listSize < 2) {
//			Throw an error to the calling function
			System.out.printf("The list of size %s is invalid: Too small", listSize);
		}
		
		if(listSize > 10000) {
//			Throw an error to the calling function
			System.out.printf("The list of size %s is invalid: Too large", listSize);
		}
		
//		Validate list element values
		for(int i = 0; i < listSize; i++) {
			
			int elementValue = unsorted.get(i);
			
			if(elementValue < -1000000) {
//				Throw an error to the calling function
				System.out.printf("Element %s of value %s is invalid: Too small", i, elementValue);
			}
			if(elementValue > 1000000) {
//				Throw an error to the calling function
				System.out.printf("Element %s of value %s is invalid: Too large", i, elementValue);
			}
		}
		
		
//		**CODE FOR meanderingArray function BEGINS HERE**
		
//		Create and sort an array to hold the elements of the list
		Integer[] sortedArray = new Integer[listSize];
		
		unsorted.toArray(sortedArray);
		
		Arrays.sort(sortedArray);
		
//		confirmed the sortedArray has values
//		System.out.println(sortedArray[3]);
		
//		Traverse the sorted array from beginning and end and populate the meanderingList
		List<Integer> meanderingList = new ArrayList<>();
		
		
		for(int i = 0; i < listSize/2; i++) {
			
				meanderingList.add(sortedArray[listSize -i -1]);
				System.out.println(sortedArray[listSize -i -1]);
				
				meanderingList.add(sortedArray[i]);
				System.out.println(sortedArray[i]);
	
		}
		
		if(listSize % 2 ==1) {

		meanderingList.add(sortedArray[listSize/2]);
		System.out.println(sortedArray[listSize/2]);
		}
		
		
		return meanderingList;
	    }
	
	public static void main(String[] args) {
		meanderingArray(createList());
	}
}
