package find_pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sulotion_three {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array: ");
		int length = sc.nextInt();
		
		System.out.println("Enter " + length + " numbers: "); 
		int [] myArray = new int[length];
		
		
		for(int i=0; i < length; i++) {
			myArray[i] = sc.nextInt();
		}
			
		
		// convert integer to String
		String my_arr_string = Arrays.toString(myArray);
		System.out.println("Original array: " + my_arr_string);                   // [2, 6, 4, 3, 1]  k = 5
		
		
        System.out.println("Enter the result of two sum number: ");
		int k = sc.nextInt();
		
		
	
		System.out.println(Arrays.toString(findPair(myArray, k)));

	}
	
	
		
		public static int[] findPair(int[] nums, int target) {
	        
	        Map<Integer,Integer> map_num = new HashMap<>();
	        
	        for(int i=0; i < nums.length; i++) {
	        	int complement = target - nums[i];
	        	
	        	if(map_num.containsKey(complement)) {
	        		return new int [] {map_num.get(complement), i};
	        	}else {
	        		map_num.put(nums[i], i);
	        	}
	        }
	        
	        return nums;
	}

	}
		
