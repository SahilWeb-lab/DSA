package com.practice.array;

public class ThreeGreatCandidates {
	
	public static int maxProduct(int[] arr){
		
//		Find two minimum value:
		int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;
		
//		Find three maximum value:
		int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
//			Finding 3 maximum values:
			if(arr[i] > maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = arr[i];
			} else if(arr[i] > maxB) {
				maxC = maxB;
				maxB = arr[i];
			} else if(arr[i] > maxC) {
				maxC = arr[i];
			}
			
//			Find 2 minium values: for negative product: because - * - = + for that we only need 2 values:
			if(arr[i] < minA) {
				minB = minA;
				minA = arr[i];
			} else if(arr[i] < minB) {
				minB = arr[i];
			}
			
		}
		
		return Math.max(maxA * maxB * maxC, maxA * minA * minB);
	}
	
	public static void main(String[] args) {
		int arr[] = {852, -566, 182, -638, -693, -323};
		
		System.out.println("Product : " + maxProduct(arr));
	}

}
