package com.practice.array;

public class ThirdMaximumNumber {

	public static int solution(int arr[]) {
		int n = arr.length;

		long firstMax = Long.MIN_VALUE, secondMax = Long.MIN_VALUE, thirdMax = Long.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			
//			Skip duplicates:
			if(arr[i] == firstMax || arr[i] == secondMax || arr[i] == thirdMax) {
				continue;
			}
			
			if(arr[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = arr[i];
			} else if(arr[i] < firstMax && arr[i] > secondMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			} else if(arr[i] < secondMax && arr[i] > thirdMax) {
				thirdMax = arr[i];
			}
		}
		
		
		
		return (thirdMax == Long.MIN_VALUE) ? (int)firstMax : (int)thirdMax;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2, 2};
		
		int solution = solution(arr);
		System.out.println("Third Maximum : " + solution);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

}
