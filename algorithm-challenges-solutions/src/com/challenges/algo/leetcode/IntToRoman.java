package com.challenges.algo.leetcode;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IntToRoman {
	
public String intToRoman(int num) {
        Map<Integer, String> mapSet=new LinkedHashMap<>();
        mapSet.put(1000, "M");
        mapSet.put(900, "CM");
        mapSet.put(500, "D");
        mapSet.put(400, "CD");
        mapSet.put(100, "C");
        mapSet.put(90, "XC");
        mapSet.put(50, "L");
        mapSet.put(40, "XL");
        mapSet.put(10, "X");
        mapSet.put(9, "IX");
        mapSet.put(5, "V");
        mapSet.put(4, "IV");
        mapSet.put(1, "I");
        
        StringBuilder result=new StringBuilder();
        Set< Map.Entry<Integer,String> > st = mapSet.entrySet();  
        
        for (Map.Entry<Integer,String> inside: st) {
			while (num-inside.getKey()>=0) {
				System.out.println(inside.getKey());
				result.append(inside.getValue());
				num=num-inside.getKey();
			}
		}
        
        return result.toString();
        
    }

}
