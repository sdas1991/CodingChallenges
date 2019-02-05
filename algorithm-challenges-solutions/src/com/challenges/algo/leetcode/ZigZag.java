package com.challenges.algo.leetcode;

public class ZigZag {
	
	public String convert(String s, int numRows) {
		 if(s==null || s.length()==0 || numRows<=1 || numRows>s.length()) {
			 return s;
		 }
		 char[] zigZagChar=new char[s.length()];
		 int interval=2*numRows-2;
		 int count=0;
		 for (int i = 0; i < numRows; i++) {
			 int step=interval-2*i;
			 //System.out.println("Step now "+step);
			 
			 for (int j = i; j < s.length(); j+=interval) {
				zigZagChar[count]=s.charAt(j);
				//System.out.println("s.charat j "+s.charAt(j));
				//System.out.println("count first "+count);
				count++;
				if(step>0 && step< interval && j+step< s.length()) {
					zigZagChar[count]=s.charAt(j+step);
					//System.out.println("count here "+count);
					//System.out.println(s.charAt(j+step));
					count++;				}
			}
			 
			 
			 
		}
		
		
		return new String(zigZagChar);
	}

}
