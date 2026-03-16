package org.example.biweeklytest4;

public class EditDistance {
    public static int findMinDistance(String word1 , String word2){

        StringBuilder str = new StringBuilder(word1);
        int i = 0;
        int j = 0;
        int operations = 0;
        while(i < str.length() && j < word2.length()){
            if(str.charAt(i) == word2.charAt(j)){
                i++;
                j++;
            }
            else {
                if (i + 1 < str.length() && str.charAt(i + 1) == word2.charAt(j)) {
                    str.deleteCharAt(i);
                    operations++;
                } else if (j + 1 < str.length() && str.charAt(i) == word2.charAt(j + 1)) {
                    str.insert(i, word2.charAt(j));
                    operations++;
                    j++;
                    i++;
                } else {
                    str.setCharAt(i, word2.charAt(j));
                    operations++;
                    i++;
                    j++;
                }
            }
        }
        operations += Math.abs(str.length() - i) + Math.abs(word2.length() - j);
        return operations;
    }
}
