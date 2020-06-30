package com.leetcode.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructItinerary {

	public static void main(String[] args) {
		//[["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
		//[["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
		//[["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]
		List<String> childList=new ArrayList<String>();
		childList.add("JFK");
		childList.add("KUL");
		List<String> childList1=new ArrayList<String>();
		childList1.add("JFK");
		childList1.add("NRT");
		List<String> childList2=new ArrayList<String>();
		childList2.add("NRT");
		childList2.add("JFK");
		/*List<String> childList3=new ArrayList<String>();
		childList3.add("ATL");
		childList3.add("JFK");
		List<String> childList4=new ArrayList<String>();
		childList4.add("ATL");
		childList4.add("SFO");*/
		
		List<List<String>> list=new ArrayList<>();
		list.add(childList);
		list.add(childList1);
		list.add(childList2);
		/*list.add(childList3);
		list.add(childList4);*/
		findItinerary1(list);
	}

	//[["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]
   static LinkedList<String> list = new LinkedList<>();
   static Map<String, PriorityQueue<String>> map = new HashMap<>();
    public static List<String> findItinerary1(List<List<String>> t) {
        for(List<String> e : t){
            String from = e.get(0), to = e.get(1);
            if(!map.containsKey(from))
                map.put(from, new PriorityQueue<>());
            map.get(from).add(to);
        }
        itineraryHelper("JFK");
        return list;
    }
    private static void itineraryHelper(String str){
        PriorityQueue<String> pq = map.get(str);
        while(pq != null && !pq.isEmpty())
            itineraryHelper(pq.poll());
        list.addFirst(str);
    }
}
