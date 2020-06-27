package com.leetcode.June;

public class SingleNumberII {

	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,1,99};
		System.out.println(singleNumber1(arr));

	}
	public static int singleNumber(int[] nums) {

        int ones=0,twos=0,three=0;
     for(int i=0;i<nums.length;i++){
       twos=twos | (nums[i] &ones);
         ones= ones^nums[i] ;
         three = ones&twos;
         ones= ones & (~three);
         twos= twos &(~three);
     } 
     return ones;
	}
	public static int singleNumber1(int[]nums) {
		int res=0;
		int sum,mask;
		for(int i=0;i<32;i++) {
			mask=(1<<i);
			sum=0;
			for(int num:nums) {
				if((num & mask)!=0) {
					sum++;
				}
			}
			if(sum%3!=0)
				res=res|mask;
		}
		return res;
		
	}
}
