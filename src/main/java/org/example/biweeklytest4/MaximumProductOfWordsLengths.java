package org.example.biweeklytest4;

import java.util.ArrayList;

public class MaximumProductOfWordsLengths {
    public static int findMaximumProduct( ArrayList<String> arr){
        int max = 0;
        for(int i = 0; i< arr.size(); i++){
            String s1 = arr.get(i);
            for(int j = i + 1; j< arr.size(); j++){
                String s2 = arr.get(j);
                if(hasCharacterCommon(s1 , s2)){
                    max = Math.max((s1.length() * s2.length()) , max);
                }
            }
        }
        return max;
    }
    public static boolean hasCharacterCommon(String s1 , String s2){
        boolean [] freq = new boolean[26];
        for(char c : s1.toCharArray()){
            freq[c -'a'] = true;
        }
        for(char c : s2.toCharArray()){
            if(freq[c - 'a']) return false;
        }
        return true;
    }
}
