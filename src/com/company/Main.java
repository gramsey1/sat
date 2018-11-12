package com.company;
import java.io.IOException;
import java.util.*;
import java.io.File;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("scores.txt"));
        String array[] = new String[1000];

        int maxIndx = 0;

        /*while (sf.hasNextLine()) {
            int i = 1;

            String s = sf.nextLine();
            String dumbarray[] = s.split("\\t");

            if (dumbarray.length == 22) {

                while (i % 22 != 0) {

                    array[i - 1] = dumbarray[i - 1];
                    i++;

                }

            }

        }
        System.out.print(array[21]);
        String newArray[] = new String[10000];*/

        while (sf.hasNextLine())
        {
            array[maxIndx] = sf.nextLine();
            maxIndx++;
        }
        sf.close();
        System.out.println(array[3]);

        String columns [] = new String[array.length];



            System.out.println(columns[3]);



        String schoolName [] = new String[columns.length];
        double averageArray [] = new double[columns.length];

        for (int i = 0; i < columns.length; i++) {
            double num1, num2, num3;

            columns = array[i].split("\t");

            num1 = Double.parseDouble(columns[18]);
            num2 = Double.parseDouble(columns[19]);
            num3 = Double.parseDouble(columns[20]);


            double average = (num1 + num2 + num3) / 3;

            averageArray[i] = average;
            schoolName[i] = columns[1];

            System.out.println(columns[1] + ": " + average);

        }
    }

}
