package org.example;

import java.util.Arrays;

public class MessageEncoded {

    public static int findNumberOfPossibledecoded(String s){
        int [] dp = new int[s.length() + 1];
        Arrays.fill(dp , -1);
       int n = findNumberOfPossible(s , 0 ,0 , dp);

       return n;
    }
    public static int findNumberOfPossible(String s , int index , int n , int [] dp){
        if(index >= s.length()) return 1;
        if(s.charAt(index) == '0') return 0;
        if(dp[index]!= -1) return dp[index];

        int count = findNumberOfPossible(s, index + 1,  n, dp);
        if(index+1 < s.length()) {
            int val = (s.charAt(index) - '0') * 10 + s.charAt(index + 1) - '0';
            if (val <= 26) {
                count += findNumberOfPossible(s, index + 2, n, dp);
            }
        }
        dp[index] = count;
        return dp[index];
    }
    public static void main(String[] args){

        String s = "226";
        int n = findNumberOfPossibledecoded(s);
        System.out.println(n);
    }
}
