package com.practice.array;

public class RepetitiveAdditionOfDigits {

	public static int solution(int num) {
		 if(num == 0) return 0;
			return (num % 9 == 0) ? 9 : num % 9;
	}
	
	public static void main(String[] args) {
		int num = 1234;
		int sum = solution(num);
		
		System.out.println(sum);
	}

}
