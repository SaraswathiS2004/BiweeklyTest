package org.example.biweeklytest7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SherlockandAnagrams {

    public static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substr = s.substring(i, j + 1);
                char[] arr = substr.toCharArray();
                Arrays.sort(arr);
                String key = new String(arr);
                map.put(key, map.getOrDefault(key, 0) + 1);

            }
        }

        int count = 0;

        for (int val : map.values()) {
            count += (val * (val - 1)) / 2;
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "ifailuhkqq";
        System.out.println(sherlockAndAnagrams(str));
    }

}
