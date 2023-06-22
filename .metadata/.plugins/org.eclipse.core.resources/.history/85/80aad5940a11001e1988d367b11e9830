package remove_duplicate;

import java.util.*;
import java.util.stream.IntStream;

// remove duplicate from sorted array
public class Sulotion_one {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,3,3,4,5,5,5};
		
		System.out.println(Arrays.toString(removeDuplicates(arr)));
						

	}
	
	
	public static int[] removeDuplicates(int[] arr){
        
		int[] temp = new int[arr.length];
		
		int j=0;
		
        for(int i=0; i<arr.length-1; i++) {
        	if(arr[i] != arr[i+1]) {
        		temp[j] = arr[i];
        		j++;
        	}
        }
        
        temp[j] = arr[arr.length - 1];
        
        int[] list = new int[j+1];
        for(int i=0; i<list.length; i++) {
        	list[i] = temp[i];
        }
        
        
        return list;
		
    }
	
	

}
