package find_pair;

import java.util.Arrays;
import java.util.Scanner;

public class Sulotion_two_best {

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
		System.out.println("Original array: " + my_arr_string);                   // [2, 6, 4, 3, 1]
		
		// sort array
		Arrays.sort(myArray);
		System.out.println("Sorted array  : " + Arrays.toString(myArray));         // [1, 2, 3, 4, 6]
		
		
		
        System.out.println("Enter the result of two sum number: ");
		int k = sc.nextInt();
		
		
		System.out.println(findPair(myArray, k));
		
		 
	}
	
	public static boolean findPair(int[] arr, int k) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			if(arr[left] + arr[right] == k) {
				return true;
			}
			else if(arr[left] + arr[right] < k) {
				left +=1;
			}
			else {
				right -=1;
			}
		}
		
		return false;
		
	} 
	
}
