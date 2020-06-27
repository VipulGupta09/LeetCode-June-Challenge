package com.leetcode.June;

import java.util.ArrayList;
import java.util.List;

public class SortColors {

	public static void main(String[] args) {
		int[] nums= {2,0,2,1,1,0};
		sortColors(nums);
	}
	 public static void sortColors(int[] nums) {
	      int low=0;
	      int high=nums.length-1;
	      int mid=0;
	      while(mid<=high) {
	    	  switch(nums[mid]) {
	    	  case 0:{
	    		  int temp=nums[low];
	    		  nums[low]=nums[mid];
	    		  nums[mid]=temp;
	    		  low++;
	    		  mid++;
	    		  break;
	    	  }
	    	  case 1:{
	    		  mid++;
	    		  break;
	    	  }
	    	  case 2:{
	    		  int temp=nums[mid];
	    		  nums[mid]=nums[high];
	    		  nums[high]=temp;
	    		  high--;
	    		  break;
	    	  }
	    	  
	    	  }
	      }
	    	  
		 
	    }

}
