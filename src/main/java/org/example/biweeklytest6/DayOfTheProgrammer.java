package org.example.biweeklytest6;

import java.io.*;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {

        if(year  == 1918){
            return "26.09.1918";
        }
        else if(findCalander(year)){
            return "12.09."+String.valueOf(year);
        }
        else {
            return "13.09."+String.valueOf(year);
        }

    }
    public static boolean findCalander(int year){

        if(year < 1918){
            if(year % 4 == 0 ) return true;
            else return false;
        }
        else if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            return true;
        }
        else return false;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
