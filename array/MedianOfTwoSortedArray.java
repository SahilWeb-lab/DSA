package com.practice.array;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

	public static double solution(int num1[], int num2[]) {
		
		int newArr[] = new int[num1.length + num2.length];
		
		if(newArr.length == 0) {
			return 0;
		}
		
		int i = 0;
		for(int n : num1) {
			newArr[i] = n;
			i++;
		}
		
		for(int n : num2) {
			newArr[i] = n;
			i++;
		}
		
		Arrays.sort(newArr);
		
		int arrLength = newArr.length;
		if(arrLength % 2 != 0) {
			int resultIndex = arrLength / 2;
			System.out.println("Result : " + newArr[resultIndex]);
			System.out.println("Odd Index : " + resultIndex);
		} else {
			int resultIndex = arrLength / 2;
			int firstIndex = resultIndex - 1;
			int secondIndex = resultIndex;
			System.out.println("First Even Index : " + firstIndex);
			System.out.println("Second Even Index : " + secondIndex);
			float result = (float)(newArr[firstIndex] + newArr[secondIndex])/ 2;
			System.out.println("Result : " + result);
		}
		
		for(int n : newArr)
			System.out.print(n + " ");
		
		return 0.0;
		
	}

	public static void main(String[] args) {
		int num1[] = {1,3}, nums2[] = {2};
		double solution = solution(num1, nums2);
		System.out.println("Result : " + solution);
	}

}
