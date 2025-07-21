package com.practice;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		
//		Sort the array:
		Arrays.sort(strs);
		
//		Get first and last value of array:
		String first = strs[0];
		String last = strs[strs.length - 1];
		
//		Find the minimum length of string among first and last string:
		int min = Math.min(first.length(), last.length());
		
//		Start loop to compare values which is common:
		int i = 0;
		while(i < min && first.charAt(i) == last.charAt(i)) {
			i++;
		}
		
//		Get the final result:
		String result = last.substring(0, i);
		System.out.println(result);
	}

}
