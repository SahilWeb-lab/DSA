package com.practice.array;

public class MoveAllZerosToEnd {

//	===================================================================================
//	My Own Approach: Some Errors
//	===================================================================================
//	public static int[] solution(int arr[]) {
//		
//		int zeroIndex = 0;
//		int temp = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				if(arr[zeroIndex] != 0) {		
//					zeroIndex = i;
//				}
//			} else {
////				if(zeroIndex >= 0) {
//					temp = arr[zeroIndex];
//					arr[zeroIndex] = arr[i];
//					arr[i] = temp;
//					zeroIndex = i;
////				}
//			}
//		}
//		
//		return arr;
//	}
	
//	[Naive Approach] Using Temporary Array - O(n) Time and O(n) Space
//	public static int[] solution(int arr[]) {
//		
//		int n = arr.length;
//		
////		Create temp array:
//		int temp[] = new int[n];
//		int j = 0;
//		
//		for(int i = 0; i < n; i++) {
//			if(arr[i] != 0) {
//				temp[j++] = arr[i];
//			}
//		}
//		
//		while(j < n) {
//			temp[j++] = 0;
//		}
//		
//		return temp;
//		
//	}
	
//	[Better Approach] Two Traversals
	public static int[] solution(int arr[]) {
		int n = arr.length;
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		
		while(count < n) {
			arr[count++] = 0;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,0,3,12};
		
		int[] solution = solution(arr);
		
		for(int n : solution) {
			System.out.print(n + " ");
		}
	}

}
