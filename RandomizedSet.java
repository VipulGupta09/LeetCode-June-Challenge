package com.leetcode.June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet {

	private HashMap<Integer, Integer> map;
	private List<Integer> list;
	private Random random;
	
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<Integer>();
        random=new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if(!map.containsKey(val)) {
    		list.add(val);
    		map.put(val, list.size()-1);
    		return true;
    	}
		return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if(!map.containsKey(val)) {
    		return false;
    	}
    	int indexToRemove=map.get(val);
    	int lastElement=list.get(list.size()-1);
    	list.set(indexToRemove, lastElement);
    	map.put(lastElement, indexToRemove);
    	map.remove(val);
    	list.remove(list.size()-1);
    	
		return true;  
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
		return list.get(random.nextInt(list.size()));
        
    }
}
