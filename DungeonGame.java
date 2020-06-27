package com.leetcode.June;

import java.util.Arrays;

public class DungeonGame {

	public static void main(String[] args) {
	 int arr[][]= { {-2, -3,   3}, 
             {-5, -10,  1}, 
             {10,  30, -5} 
           };
	 System.out.println(calculateMinimumHP(arr));

	}
	 public static int calculateMinimumHP(int[][] dungeon) {
		 int m=dungeon.length;
		 int n=dungeon[0].length;
		 int dp[][]=new int[m+1][n+1];
		 for(int i=0;i<=m;i++) {
			 Arrays.fill(dp[i], Integer.MAX_VALUE);
		 }
		 dp[m][n-1]=1;
		 dp[m-1][n]=1;
		 for(int i=m-1;i>=0;i--) {
			 for(int j=n-1;j>=0;j--) {
				 int minHp=Math.min(dp[i+1][j], dp[i][j+1])-dungeon[i][j];
				 if(minHp<1) {
					 dp[i][j]=1;
				 }else {
					 dp[i][j]=minHp;
				 }
			 }
		 }
		 
		return dp[0][0];
	        
	    }

}
