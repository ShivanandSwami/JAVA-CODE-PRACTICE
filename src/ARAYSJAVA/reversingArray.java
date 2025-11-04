package ARAYSJAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reversingArray {
	//SHivanand is best 
	
	/*
	 * static void reverseArray(List<Integer> arr){
	 * 
	 * Collections.reverse(arr); }
	 * 
	 * 
	 * 
	 * public static void main(String[] args) { List<Integer> arr = new
	 * ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));
	 * 
	 * reverseArray(arr);
	 * 
	 * for (int i = 0; i < arr.size(); i++) System.out.print(arr.get(i) + " "); }
	 */
	 public static void main(String[] args) { 
	int[] arr= {10,20,30,40,45,44};
	
	
	int n = arr.length;

    System.out.print("Reverse Traversal: ");
    for (int i = n - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
        
    }
    System.out.println();
	
	
	}
}

