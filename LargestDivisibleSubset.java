package com.leetcode.June;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LargestDivisibleSubset {

	public static void main(String[] args) {
		int [] arr= {1,2,4,8};
		largestDivisibleSubset(arr);

	}
   public static List<Integer> largestDivisibleSubset(int[] nums) {
	Arrays.sort(nums);
    int n = nums.length;
    int[] count = new int[n];
    int[]pre = new int[n];
    int max = 0, index = -1;
    for (int i = 0; i < n; i++) {
        count[i] = 1;
        pre[i] = -1;
        for (int j = i - 1; j >= 0; j--) {
            if (nums[i] % nums[j] == 0 && 1 + count[j] > count[i]) {
                count[i] = count[j] + 1;
                pre[i] = j;
            }
        }
        if (count[i] > max) {
            max = count[i];
            index = i;
        }
    }
    LinkedList<Integer> list = new LinkedList<>();
    while (index != -1) {
        list.addFirst(nums[index]);
        index = pre[index];
    }
    return list;
   }
}
