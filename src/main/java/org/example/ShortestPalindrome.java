package org.example;

public class ShortestPalindrome {

    public static String findShortestPalindrome(String s){

        if(s.length() == 0){
            return null;
        }
        int longestCommonPrefix = 0;
        String res = "";
       for(int i = 0; i< s.length(); i++){
           String str = s.substring(0 , i+1);
           if(isPalindrome(str)){
               if(longestCommonPrefix < str.length()){
                   longestCommonPrefix = str.length();
                   res = str;
               }
           }
       }
       String s1 = s.substring(longestCommonPrefix);
       StringBuilder output = new StringBuilder(s1);
       String s2 = output.reverse().toString();
        return s2 + res + s1;
    }
    public static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        String s =  "aacecaaa";
        System.out.println(findShortestPalindrome(s));//output //aaacecaaa
    }
}
