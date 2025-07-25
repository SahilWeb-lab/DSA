package com.practice.array;

public class MaximumConsecutive {

	
//	My Own Approach:
//	================================================================================
//	public static int maxContigious(int arr[]) {
//		int zeroCount = 0, oneCount = 0, previousZeroCount = Integer.MIN_VALUE, previousOneCount = Integer.MIN_VALUE;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				zeroCount++;
////				When one is come reset zeroCount and store previously count in variable:
//				if(previousZeroCount < zeroCount) {
//					previousZeroCount = zeroCount;
//				}
//				
//					oneCount = 0;
//			} else {
//				oneCount++;
////				When one is come reset oneCount and store previously count in variable:
//					if(previousOneCount < oneCount) {
//						previousOneCount = oneCount;
//					}
//					
//				zeroCount = 0;
//			}
//		}
//		
//		return (previousOneCount > previousZeroCount) ? previousOneCount : previousZeroCount;
//	}
	
	
//	SecondApproach:
//	public static int maxContigious(int arr[]) {
//		
//		int maxCount = 0, count = 1;
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i] == arr[i - 1]) {
//				count++;
//			} else {
//				maxCount = Math.max(maxCount, count);
//				count = 1;
//			}
//		}
//		
//		return Math.max(maxCount, count);
//	}
	
//	Third Approach:
	public static int maxContigious(int arr[]) {
		int count = 1, maxCount = 0;
		for(int i = 1; i < arr.length; i++) {
			if((arr[i] ^ arr[i - 1]) == 0) {
				count++;
			} else {
				maxCount = Math.max(maxCount, count);
				count = 1;
			}
		}
		
		return Math.max(count, maxCount);
	}
	
	public static void main(String[] args) {
		int arr[] = {0, 0, 0, 1,1, 1, 1, 0, 1, 1, 0, 0, 1};
		
		int maxContigious = maxContigious(arr);
		
		System.out.println("Max Connsecutive : " + maxContigious);
	}

}
