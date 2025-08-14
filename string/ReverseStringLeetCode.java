package com.practice.string;

public class ReverseStringLeetCode {

	public static char[] solution(char arr[]) {
		
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		char temp;
		
		while(left < right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		char[] solution = solution(s);
		
		for(char ele : solution)
			System.out.print(ele);
	}

}
