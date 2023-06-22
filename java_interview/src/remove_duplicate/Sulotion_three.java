package remove_duplicate;

import java.util.*;
import java.util.stream.IntStream;

// remove duplicate from sorted array using HashMap
public class Sulotion_three {

	public static void main(String[] args) {
		
		int[] arr = {2,4,7,3,4,2,4};
		
		System.out.println(Arrays.toString(removeDuplicates(arr)));
						

	}
	
	
	public static int[] removeDuplicates(int[] arr){
        
	   Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
	   
	   for(int i=0; i<arr.length; i++) {
		   if(map.get(arr[i]) == null) {
			   map.put(arr[i], true);
		   }
	   }
	   
	   ArrayList<Integer> arr_list = new ArrayList<>();
	   
	   for (int key : map.keySet()) {
		   arr_list.add(key);
       }
	   
	   // Convert the list to an array
       int[] result = new int[arr_list.size()];
       for (int i = 0; i < result.length; i++) {
           result[i] = arr_list.get(i);
       }

       return result;
	   
		
    }
	
	

}
