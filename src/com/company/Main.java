package com.company;
import java.io.IOException;
import java.util.*;
import java.io.File;
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sf = new Scanner (new File ("scores.txt"));
        String array [] = new String [1000];

        int maxIndx = 0;
        while(sf.hasNextLine()) {

            String s = sf.nextLine();
            String dumbarray [] = s.split("\\t");
            if(dumbarray.length == 22) {

            }
            
//
        }

        System.out.print(array[1]);
        String newArray [] = new String [10000];





    }
}
