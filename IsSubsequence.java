package com.leetcode.June;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abc", t = "ahbgd";
		System.out.println(isSubsequence(s, t));
	}
	public static boolean isSubsequence(String s, String t) {
		int slen=s.length();
		int tlen=t.length();
		if(s==null || slen>tlen)
			return false;
		int i=0;
		int j=0;
		while(j<tlen && i<slen) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;	
			}	
			else {
					j++;
				}
		}
		return i==slen?true:false;
	
        
    }

}
