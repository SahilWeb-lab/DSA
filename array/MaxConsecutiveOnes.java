package com.practice.array;

public class MaxConsecutiveOnes {

	public static int solution(int arr[]) {
		
		int n = arr.length, currentCount = 0, maxOneCount = 0;
		
		for(int ele : arr) {
			if(ele == 1) {
				currentCount += 1;
				
				if(currentCount > maxOneCount) 
					maxOneCount = currentCount;
			} else if(ele == 0) {
//				maxOneCount = currentCount;
				currentCount = 0;
			}
		}
		
		return maxOneCount;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,1,0,1,0,1,1};
		int solution = solution(nums);
		
		System.out.println(solution);
	}

}
