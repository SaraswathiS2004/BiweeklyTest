package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CroakingFrogs {

    public static int findNumberOfFrogs(String str){
        char [] croaks = {'c' , 'r' , 'o' , 'a' , 'k'};
        int n = isValidCroak(croaks , str);
        if(n == 0){
            return -1;
        }
        return n;
    }
    public static int isValidCroak(char [] croaks , String s){

        int numberOfCroaks = 0;
        int n = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(isCroak(croaks , c)){
                n ++;
            }
            else {
                n--;
            }
            if(n == 4){
                numberOfCroaks++;
                n= 0;
            }
        }
        return numberOfCroaks;
    }
    public static boolean isCroak(char [] croaks , char word){

        for(int i = 0; i< croaks.length; i++){
            char c = croaks[i];
            if(c == word){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String croakOfFrogs = "croakcroak";
        System.out.println(findNumberOfFrogs(croakOfFrogs));
    }
}
