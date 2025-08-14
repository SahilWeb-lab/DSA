package com.practice.string;

import java.util.Arrays;

public class ValidAnagram {

	public static boolean solution(String str1, String str2) {
		char[] charArray = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		String sen1 = String.valueOf(charArray);
		String sen2 = String.valueOf(charArray2);
		
		if(sen1.equals(sen2))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		boolean solution = solution("Hello", "ellHo");
		System.out.println(solution);
	}

}
