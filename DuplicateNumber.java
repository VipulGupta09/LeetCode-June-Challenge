package com.leetcode.June;

public class DuplicateNumber {

	public static void main(String[] args) {
			//  0,1,2,3,4,5,6,7,8,9
	int arr[]= {2,5,9,6,9,3,8,9,7,1};
	int arr1[]= {1,4,3,4,2};
		//System.out.println(findDuplicate(arr1));
		System.out.println(findDuplicate2(arr1));

	}
	public static int findDuplicate2(int[]nums) {
		int n=nums.length;
		int max_num=0;
		int max_id=0;
		for(int i=0;i<n;i++) {
			int id=nums[i]%n;
			nums[id]+=n;
		}
		for(int i=0;i<n;i++) {
			if(nums[i]>max_num) {
				max_num=nums[i];
				max_id=i;
			}
			nums[i]=nums[i]%n;
		}
		return max_id;
		
	}
	
	
	public static int findDuplicate(int[] nums) {
        int rabbit = 0, turtle = 0;
        do {
            rabbit = nums[nums[rabbit]];
            turtle = nums[turtle];
        } while (rabbit != turtle);
        System.out.println(rabbit);
        rabbit = 0;
         while (rabbit != turtle) {
            rabbit = nums[rabbit];
            turtle = nums[turtle];
        }
        return turtle;
        }
	 public static int findDuplicate1(int[] nums) {
			int tortoise=nums[0];
			int hare=nums[0];
			do{
				tortoise=nums[tortoise];
				hare=nums[nums[hare]];
			}while(tortoise!=hare);
			 System.out.println(hare);
			tortoise=nums[0];
			while(hare!=tortoise) {
				tortoise=nums[tortoise];
				hare=nums[hare];
			}
			return hare;
			}
}
