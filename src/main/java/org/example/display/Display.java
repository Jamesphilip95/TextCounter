package org.example.display;

import java.util.HashMap;

public class Display {

    public void displayWordCount(int wordCount) {
        System.out.println("Word count = " +wordCount);
    }


    public void displayAverageWordLength(double average) {
        String average_3db = String.format("%.3f", average);
        System.out.println("Average word Length = " +average_3db);
    }

    public void displayWordLengthCount(HashMap<Integer, Integer> lengthCount) {
        for(Integer number: lengthCount.keySet()){
            System.out.println("Number of words length " +number.intValue() + " is " +lengthCount.get(number).intValue());
        }
    }

    public void displayMostFreqLength(HashMap<Integer, Integer> lengthCount) {
        int max = 0;
        int wordLength = 0;
       for(Integer count: lengthCount.keySet()){
           if(lengthCount.get(count).intValue()>max) {
               wordLength = count.intValue();
               max = lengthCount.get(count).intValue();
           }
       }
        System.out.println("The most frequently occurring word length is " + max + ", for word length " + wordLength );
    }
}
