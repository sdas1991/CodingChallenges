package com.challenges.algo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class visatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> u= new ArrayList<>();
		u.add("alex");
		u.add("bhalo");
		u.add("alex");
		
		
		int increment=1;
	    List<String> userString=new ArrayList<String>();

	    for(int i=0;i<u.size()-1;i++){
	        for (int j = 1; j < u.size()-2; j++) {
				if(u.get(i).equalsIgnoreCase(u.get(j))) {
					userString.add(u.get(i));
					String s=u.get(j)+Integer.toString(increment);
					userString.add(s);
					increment++;
					u.remove(i);
					u.remove(j);
				}
			}

	    }
	    
	    userString.addAll(u);
	    
	    for (String string : userString) {
			System.out.println(string);
		}

	}

}
