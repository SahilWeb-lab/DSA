package com.practice;

import java.util.Arrays;

/*
 * Steps to solve:
 * 1) Sort array of strings
 * 2) Get first and last string of the array
 * 3) Minimum length of string among both first and last string:
 * 4) Start the loop until i < minimum_length and first.character==last.character and increment i every time until condition get false:
 * 5) Get result using substr(0, i);
 * 
 * where i = 0 initially,
 * */

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

