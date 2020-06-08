package com.leetcode.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionByHeight {

	public static void main(String[] args) {
		int arr[][]={{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		System.out.println(reconstructQueue(arr));
	}
	 public static int[][] reconstructQueue(int[][] people) {
	        List<int[]> results=new ArrayList<>();
	        Arrays.sort(people, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
				}

				
			});
			
			
			/*{{
	        	return (a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);//[[7, 0], [7, 1], [6, 1], [5, 0], [5, 2], [4, 4]]
	        });*/
	        for(int[]x:people) {
	        	results.add(x[1],x);
	        }
	        
	        List<Integer> list=new ArrayList<>();
	        for(int i=0;i<10;i++){
	        	list.add(0, i);
	        }
	        return results.toArray(new int[people.length][2]);
	    }
}
