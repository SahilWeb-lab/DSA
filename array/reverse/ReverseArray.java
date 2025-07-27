package com.practice.array.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

//	=================================================================================
//	My Own Approach:  Using Two Pointers - O(n) Time and O(1) Space
//	=================================================================================
	public static void solution(int nums[]) {
				
		int n = nums.length;
		
		if(n == 0 || n == 1) {
			return;
		}
		
		int i = 0, temp = 0, j = n - 1;
		int count = 1;
		
		for(i = 0; i < n; i++) {
			if(i > j && nums[i] != nums[j]) {
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				System.out.println();
				System.out.println(count++);
			}
			j--;
		}
		
	}
	
	
//	===========================================================================
//	[Naive Approach] Using a temporary array - O(n) Time and O(n) Space
//	===========================================================================
//	public static void solution(int nums[]) {
//
//		int n = nums.length;
//		int temp[] = new int[n];
//		
//		int j = 0;
//		for(int i = n - 1; i >= 0; i--) {
//			temp[j++] = nums[i];
//		}
//		
//		for(int i = 0; i < n; i++) {
//			nums[i] = temp[i];
//		}
//	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Before Sorting:");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		
		solution(arr);
		
		System.out.println();
		System.out.println("After Sorting: ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		
	}

}
