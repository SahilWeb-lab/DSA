package com.practice.array;

public class BestTimeToBuyAndSellStock2 {

	public static int solution(int prices[]) {
		
		int n = prices.length;
		if(n < 2) 
			return 0;
		
		int left = 0, right = 1, totalProfit = 0;
		while(right < n) {
			if(prices[right] > prices[left]) {
				totalProfit += prices[right] - prices[left];
			}
			
			left = right;
			right++;
		}
		
		return totalProfit;
	}
	
	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		int maxProfit = solution(prices);
		
		System.out.println("Max Profit : " + maxProfit);
	}
	
}
