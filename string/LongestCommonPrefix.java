package com.practice.string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String solution(String[] arr) {
		
//		Sort Array:
		Arrays.sort(arr);
		
		String firstValue = arr[0];
		String lastValue = arr[arr.length - 1];
		
//		Find minimum length of string:
		int min = Math.min(firstValue.length(), lastValue.length());
		
		int i = 0;
		while(0 < min && firstValue.charAt(i) == lastValue.charAt(i)) 
			i++;
		
		return firstValue.substring(0, i);
	}
	
	public static void main(String[] args) {
		
		String strs[] = {"flower","flow","flight"};
		String solution = solution(strs);
		System.out.println("Longest Common Prefix : " + solution);
	}

}
