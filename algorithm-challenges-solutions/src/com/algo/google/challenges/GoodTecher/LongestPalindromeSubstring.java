package com.algo.google.challenges.GoodTecher;

import java.net.MalformedURLException;
import java.net.URL;

public class LongestPalindromeSubstring {

    private static String checkForPalindrome(String s){
        if (s== null && !s.isEmpty()){
            return null;
        }
        boolean[][] isPalindrome = new boolean[s.length()][s.length()];
        int right=0;
        int left=0;

        for (int j=1; j<s.length();j++){
            for (int i=0; i<j;i++){
                boolean innerPalindromeCheck = isPalindrome[i+1][j-1] || j-i<=2;
                if(s.charAt(i)== s.charAt(j) && innerPalindromeCheck){
                    isPalindrome[i][j] = true;
                    if(j-i>right-left){
                        right=j;
                        left=i;
                    }
                }
            }
        }
        return s.substring(left, right+1);
    }
    

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccbapoop"));

    }
}
