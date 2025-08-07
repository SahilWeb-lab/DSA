package com.practice.array;

public class BestTimeToBuyAndSell {

//	Naive Approach:
//	public static int solution(int prices[]) {
//		
//		int res = 0;
//		int n = prices.length;
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 1; j < n; j++) {
//				res = Math.max(res, prices[j] - prices[i]);
//			}
//		}
//		
//		return res;
//	}
	
//	Expected Approach:
	public static int solution(int prices[]) {
		int maxProfit = 0;
		int n = prices.length;
		int minPrice = prices[0];
		
		for(int i = 1; i < n; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int []prices = {7,1,5,3,6,4};
		int solution = solution(prices);
		
		System.out.println("Profit : " + solution);
	}
	
}
