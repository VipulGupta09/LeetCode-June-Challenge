package com.leetcode.June;

import java.util.Arrays;

public class TwoCityScheduling {

	public static void main(String[] args) {
		int[][] costs = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };//-10,-170,350,-10
		twoCitySchedCost(costs);
	}

	public static void twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs, (a, b) -> {
			return a[0] - a[1] - (b[0] - b[1]);
		});
		int cost = 0;
		for (int i = 0; i < costs.length / 2; ++i) {
			cost += costs[i][0];
		}
		for (int i = costs.length / 2; i < costs.length; ++i) {
			cost += costs[i][1];
		}
		System.out.println(cost);
		Math.sqrt(2.0);
	}

}
