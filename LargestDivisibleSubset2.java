package com.leetcode.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset2 {

	public static void main(String[] args) {
		int arr[]= {2,3,4,8};
		System.out.println(largestDivisibleSubset(arr));
	}
	public static List<Integer> largestDivisibleSubset(int[] nums) {
		Arrays.sort(nums);
		int [] dp=new int[nums.length];
		int max=1;
		dp[0]=1;
		for(int i=1;i<nums.length;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(nums[i]%nums[j]==0) {
					dp[i]=1+dp[j];
					if(max<dp[i])
						max=dp[i];
				}
			}
		}
		int prev=-1;
		List<Integer> list=new ArrayList<Integer>();
		for(int i=nums.length-1;i>=0;i--) {
			if(dp[i]==max && (prev%nums[i]==0||prev==-1)) {
				list.add(nums[i]);
				prev=nums[i];
				max--;
			}
		}
		return list;   
	    }
}
