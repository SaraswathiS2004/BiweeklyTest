package org.example.biweeklytest6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceLane {


    public static List<Integer> serviceLane(int n, List<List<Integer>> cases , List<Integer> width) {
        // Write your code here

        List<Integer> list = new ArrayList<>();

        for(int j = 0; j< cases.size(); j++){
            int start = cases.get(j).get(0);
            int end = cases.get(j).get(1);
            int min = Integer.MAX_VALUE;

            for(int k = start; k <= end; k++){
                min = Math.min(width.get(k) , min);
            }
            list.add(min);
        }

        return list;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] widthTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> width = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthTemp[i]);
            width.add(widthItem);
        }

        List<List<Integer>> cases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String[] casesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> casesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowTempItems[j]);
                casesRowItems.add(casesItem);
            }

            cases.add(casesRowItems);
        }
        List<Integer> result = serviceLane(n, cases , width);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
