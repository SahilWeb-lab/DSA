package com.practice.array;

public class BestTimeToBuyAndSellStock_II {

	 public static int maxProfit(int[] prices) {
	      
	        int n = prices.length;

	        if(n < 2){
	            return 0;
	        }

	        int left = 0;
	        int right = 1;
	        int totalP = 0;

	        while(right < n){
	            if(prices[right] > prices[left]){
	                totalP += prices[right] - prices[left];             
	            }

	            left = right;
	            right++;
	        }

	        return totalP;

	    }
	
	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		int maxProfit = maxProfit(prices);
		System.out.println("Max Profit : " + maxProfit);
	}

}
