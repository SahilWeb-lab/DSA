package com.practice;

public class ProductOfArrayExceptSelf {

	public static int[] solution(int arr[]) {
		boolean isZeroExists = false;
		boolean anotherZeroExists = false;
		int totalProduct = 1, n = arr.length;
		int totalSum = 0;
		for(int ele : arr) {			
			if(ele != 0) {
				totalProduct *= ele;
			} else if(ele == 0 && isZeroExists == false) {
				isZeroExists = true;
			} else if(ele == 0 && isZeroExists == true && anotherZeroExists == false) {
				anotherZeroExists = true;
			}
			totalSum += ele;
		}
		
		System.out.println("Total Product : " + totalProduct);
		System.out.println(isZeroExists + " " + anotherZeroExists);
		
		int ans[] = new int[n];
		
		for(int i = 0; i < ans.length; i++) {	
			if(totalSum == 0 && Math.abs(totalProduct) < 1) {
				arr[i] = 0;
			}
			else if(isZeroExists && arr[i] != 0) {
				ans[i] = 0;
			} else if(arr[i] == 0) {	
				if(anotherZeroExists) {
					ans[i] = 0;
				} else {					
					ans[i] = totalProduct;
				}
			} else if(arr[i] != 0) {
				ans[i] = totalProduct / arr[i];
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, -1};
		int[] solution = solution(arr);
		
		for(int ele : solution) 
			System.out.print(ele + " ");
	}

}
