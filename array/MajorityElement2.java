package com.practice.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

//	[Better Approach] Using Hash Map or Dictionary - O(n) Time and O(n) Space
//	public static ArrayList<Integer> solution(int arr[]) {
//		
//		Map<Integer, Integer> countMap = new HashMap<>();
//		int n = arr.length / 3;
//		ArrayList<Integer> nums = new ArrayList<>();
//		
//		for(int ele : arr) {
//			countMap.put(ele, countMap.getOrDefault(ele, 0) + 1);
//			
//			if(countMap.get(ele) > n && !nums.contains(ele)) {
//				nums.add(ele);
//			}
//			
//		}
//		
//		Collections.sort(nums);
//		
//		return nums;
//	}
	
	public static ArrayList<Integer> solution(int arr[]) {
		
		int n = arr.length;

        // Initialize two candidates and their counts
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;

        for (int ele : arr) {

            // Increment count for candidate 1
            if (ele1 == ele) {
                cnt1++;
            }

            // Increment count for candidate 2
            else if (ele2 == ele) {
                cnt2++;
            }

            // New candidate 1 if count is zero
            else if (cnt1 == 0) {
                ele1 = ele;
                cnt1++;
            }

            // New candidate 2 if count is zero
            else if (cnt2 == 0) {
                ele2 = ele;
                cnt2++;
            }

            // Decrease counts if neither candidate
            else {
                cnt1--;
                cnt2--;
            }
        }

        
        System.out.println("Candidate : " + ele1 + "\nCandidate : " + ele2);
        
        ArrayList<Integer> res = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;

        // Count the occurrences of candidates
        for (int ele : arr) {
            if (ele1 == ele) cnt1++;
            if (ele2 == ele) cnt2++;
        }

        // Add to result if they are majority elements
        if (cnt1 > n / 3) res.add(ele1);
        if (cnt2 > n / 3) res.add(ele2);

        Collections.sort(res);

        return res;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {3,2,3};
		ArrayList<Integer> solution = solution(arr);
		
		for(int ele : solution)
			System.out.print(ele + " ");
	}

}
