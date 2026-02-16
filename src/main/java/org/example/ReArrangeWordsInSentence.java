package org.example;

import java.util.HashMap;

public class ReArrangeWordsInSentence {

    public static String rearrange(String s) {
        s = s.toLowerCase();
        String split[] = s.split(" ");
        accendiongOrder(split);
        boolean isFirst = true;
        String result = "";
        for(String str : split){
            String res = str;
            if(isFirst){
                String s1 = String.valueOf(str.charAt(0)).toUpperCase();
                res = s1;
                if(str.length() > 1){
                   res += str.substring(1);
                }
                isFirst = false;
            }
            result += res +" ";
        }
        return result;
    }

    public static void accendiongOrder(String str[]){

        for(int i = 0; i< str.length; i++){
            for(int j = i; j>0; j--){
                String s1 = str[j];
                String s2 = str[j -1];
                int n = str[j].length();
                int m = str[j -1].length();
                if(m > n){
                    str[j-1] = s1;
                    str[j] = s2;
                }
            }
        }
    }

    public static void main(String[] args){
        String sentence = "Leetcode makes me happy";
        System.out.println(rearrange(sentence)); //output : Me makes happy leetcode
    }
}
