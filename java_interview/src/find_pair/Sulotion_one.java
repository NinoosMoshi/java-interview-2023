package find_pair;

import java.util.Arrays;
import java.util.Scanner;

public class Sulotion_one {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the length of array: ");
		int length = sc.nextInt();
		 
		System.out.println("Enter " + length + " numbers: "); 
		int [] myArray = new int[length];
		
		for(int i=0; i < length; i++) {
			myArray[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(myArray));
		
		 
		
		System.out.println("Enter the result of two sum number: ");
		
		int k = sc.nextInt();
		 
		 
		
		
		System.out.println(findPair(myArray, k));


	}
	
	
	
	public static boolean findPair(int[] arr, int k) {
		
		   for(int i = 0; i < arr.length  -1; i++) {
			   for(int j = i+1; j < arr.length; j++) {
				   if(arr[i] + arr[j] == k) {
					   return true;
				   }
			   }
		   }
		   
		   return false;
			
		}
	
	

}