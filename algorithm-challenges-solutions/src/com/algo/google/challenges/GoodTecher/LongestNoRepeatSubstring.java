package com.algo.google.challenges.GoodTecher;

import java.util.HashSet;

public class LongestNoRepeatSubstring {

    private static HashSet<Character> checkForSubstring(String s){
        HashSet<Character> countSet= new HashSet<>();
        HashSet<Character> returnSet= new HashSet<>();
        int maxLength=0;

        int i=0;
        int j=0;
        while(j<s.length()){
            if(countSet.contains(s.charAt(j))){
                 countSet.remove(s.charAt(i));
                 i++;
                if(returnSet.size()< countSet.size()){
                    returnSet.clear();
                    returnSet.addAll(countSet);
                }
            }else{
                countSet.add(s.charAt(j));
                j++;
            }
        }
        if(returnSet.size()< countSet.size()){
            returnSet.clear();
            returnSet.addAll(countSet);
        }
        return returnSet;

    }

    public static void main(String[] args) {

        System.out.println(checkForSubstring("aybcdeyjk").toString());;


    }
}
