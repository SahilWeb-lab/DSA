package com.practice.string;

public class LengthofLastWord {

	public static int solution(String s) {
		 s = s.trim();
	     return s.length() - s.lastIndexOf(" ") - 1;
	}
	
	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		int solution = solution(s);
		System.out.println(solution);
	}

}
