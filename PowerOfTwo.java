package com.leetcode.June;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(128));

	}
	public static boolean isPowerOfTwo(int n) {
        
		if(n<=0) return false;
        return (n&(n-1)) == 0;
       
       
    }

}
//2,4,8,16,32
//101
//10000
// 1111