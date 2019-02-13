package com.challenges.algo.leetcode;

import java.math.BigDecimal;

public class Atoi {
	
public int myAtoi(String str) {
     double num=0;
     boolean negativeVal=false;
     int startIndex=0;
	
     if(str==null || str.length()==0 || str.isEmpty()) {
		return 0;
	}
	
	
	//if space is there
	str=str.trim();
	if (str.equals("")) {
		return 0;
	}
	//if sign is different
	if(str.charAt(0)=='-') {
		negativeVal=true;
	}
	
	//start index
	if(str.charAt(0)=='-' || str.charAt(0)=='+') {
		startIndex++;
	}
	//best case
	for (int i = startIndex; i < str.length(); i++) {
		if (str.charAt(i) <'0' || str.charAt(i)>'9') {
			break;
		}
		 
		
		int rem=(int)(str.charAt(i)-'0');
		num=num*10+rem;
	}
	if (negativeVal) {
		num=0-num;
	}
	
	//if greater than integer
	if(num > Integer.MAX_VALUE) {
		
		return Integer.MAX_VALUE;
	}
	if(num<Integer.MIN_VALUE) {
		return Integer.MIN_VALUE;
	}
	
	return (int)(num);
    } 

}
