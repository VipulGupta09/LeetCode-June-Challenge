package com.leetcode.June;

public class ValidIPAddress {

	public static void main(String[] args) {
		System.out.println(validIPAddress("192.01.01.1"));

	}
	public static String validIPAddress(String IP) {
		if(IP.length()<1)
			return "Neither";
		String[] str=IP.split("\\.");
		if(str.length==4)
			return checkForIP4(str);
		if(IP.charAt(0)=='.'||IP.charAt(0)==':' || IP.charAt(IP.length()-1)=='.'||IP.charAt(IP.length()-1)==':') {
			return "Neither";
		}
		str=IP.split(":");
		if(str.length==8)
		return checkForIP6(str);
		return "Neither";
}
	public static String checkForIP4(String[] str) {
		for(int i=0;i<str.length;i++) {
			if(str[i].isEmpty())
				return "Neither";
			for(int j=0;j<str[i].length();j++) {
				if(str[i].length()>3||(str[i].charAt(0)==48&&str[i].length()>1) || (str[i].charAt(j)<48 ||str[i].charAt(j)>57))
					return "Neither";
			}
			
			
		}
		for(int i=0;i<str.length;i++)
		if(Integer.parseInt(str[i])>255) {
			return "Neither";
		}
		return "IPv4";
		//if(str[i].length()>3||str[i].charAt(0)==48 || (str[i].charAt(j)<48 ||str[i].charAt(j)>57))
		//Integer.parseInt(str[i])>255
	}
	public static String checkForIP6(String[]str) {
		for(int i=0;i<str.length;i++) {
			if(str[i].isEmpty())
				return "Neither";
			for(int j=0;j<str[i].length();j++) {
				if(str[i].length()>4 ||!((str[i].charAt(j)>47 &&str[i].charAt(j)<58) ||
						(str[i].charAt(j)>64 &&str[i].charAt(j)<71)||
						(str[i].charAt(j)>96 &&str[i].charAt(j)<103)))
					return "Neither";
			}
		}
		return "IPv6";
		
	}
}
