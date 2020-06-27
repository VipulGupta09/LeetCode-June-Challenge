package com.leetcode.June;

public class HindexII {

	public static void main(String[] args) {
		int arr[]= {0,1,3,6,7,8};
		System.out.println(hIndex(arr));

	}
	public static int hIndex(int[] citations) {
		int n=citations.length;
		int l=0,r=n-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(citations[mid]<n-mid) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		
		return n-l;
	        
	    }
}
