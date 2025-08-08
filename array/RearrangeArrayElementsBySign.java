package com.practice.array;

public class RearrangeArrayElementsBySign {

	public static int[] solution(int arr[]) {
		int n = arr.length;
		int evenPosition = 0;	// Initially
		int oddPosition = 1; // Initially
		
		int ans[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			if(arr[i] > 0) {
				ans[evenPosition] = arr[i];
				evenPosition = evenPosition + 2;
			} else {
				ans[oddPosition] = arr[i];
				oddPosition = oddPosition + 2;
			}
			
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = {3,1,-2,-5,2,-4};
		
		System.out.println("Real Array : ");
		for(int i = 0; i < arr.length; i++) {			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		int[] result = solution(arr);
		
		System.out.println("Rearranged Array : ");
		for(int n : result) {			
			System.out.print(n + " ");
		}
	}

}
