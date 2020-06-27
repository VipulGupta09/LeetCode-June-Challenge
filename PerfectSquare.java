package com.leetcode.June;

import java.util.Arrays;

public class PerfectSquare {

	public static void main(String[] args) {
		int num=13;
		System.out.println(numSquares(num));
	}
	public static int numSquares(int n) {
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
       return numSquaresSol(n,dp);
    }
    public static int numSquaresSol(int n,int []dp) {
		if(dp[n]!=-1)return dp[n];
		if(n==0)
			return 0;
		int min=Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int count=1+numSquaresSol(n-i*i,dp);
			min=Math.min(min,count);
		}
		return dp[n]=min;
	}
}
