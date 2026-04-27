package org.example.biweeklytest7;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {

        int level = 0;
        int valleysCount = 0;

        for (int i = 0; i < path.length(); i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                level++;
                if (level == 0) {
                    valleysCount++;
                }
            } else {
                level--;
            }
        }

        return valleysCount;
    }

}
