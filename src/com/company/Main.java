package com.company;
import java.io.IOException;
import java.util.*;
import java.io.File;
public class Main {

    public static void main(String[] args) throws IOException{
//0, 1 = School name, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 = math average, 19 = reading average, 20 = writing average, 21 = percent tested
        Scanner sf = new Scanner (new File ("scores.txt"));

        String array [] = new String [1000];

        int maxIndx = -1;
        while(sf.hasNext()) {
            maxIndx++;
            array[maxIndx]= sf.nextLine();
        }
        System.out.println(array[1]);
        String newArray [] = new String [10000];

        for ()
    }
}
