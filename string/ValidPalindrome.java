package com.practice.string;

public class ValidPalindrome {

	public static boolean solution(String str) {
		 if(str.isEmpty()) {
				return true;
			}

			int n = str.length();
			int left = 0, right = n - 1;
			
			while(left <= right) {
				char currFirst = str.charAt(left);
				char currLast = str.charAt(right);
				
				if(!Character.isLetterOrDigit(currFirst)) {
					left++;
				} else if(!Character.isLetterOrDigit(currLast)) {
					right--;
				} else {
					if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {						
						return false;		
					}					
					left++;
					right--;
				}
				
			}
			
			return true;
	}
	
	public static void main(String[] args) {
		 String s = "A man, a plan, a canal: Panama";
		 boolean solution = solution(s);
		 System.out.println(solution);
	}

}
