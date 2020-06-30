package com.leetcode.June;

import java.util.Arrays;

public class UniquePaths {

	public static void main(String[] args) {
		int m=3,n=2;
		System.out.println(uniquePaths(m, n));

	}
	 public static int uniquePaths(int m, int n) {
		 int[][] dp=new int[m][n];
			for(int i=0;i<m;i++)
				Arrays.fill(dp[i], -1);
			return	totalUniquePaths(m-1, n-1,dp);
	        
	    }
	 public static int totalUniquePaths(int m,int n,int dp[][]) {
		 if(m==0 && n==0)
			 return 1;
		 if(m<0 || n<0)
			 return 0;
		 if(dp[m][n]!=-1)
			 return dp[m][n];
		 
		 return dp[m][n]=totalUniquePaths(m-1, n, dp)+totalUniquePaths(m, n-1, dp);
		
		 
	 }
	 
}
