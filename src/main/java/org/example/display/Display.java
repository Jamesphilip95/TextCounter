package org.example.display;

import java.util.ArrayList;
import java.util.HashMap;

public class Display {


    public void displayWordCount(int wordCount) {
        System.out.println("Word count = " + wordCount);
    }


    public void displayAverageWordLength(double average) {
        String average_3db = String.format("%.3f", average);
        System.out.println("Average word Length = " + average_3db);
    }

    public void displayWordLengthCount(HashMap<Integer, Integer> lengthCount) {
        for (Integer number : lengthCount.keySet()) {
            System.out.println("Number of words length " + number.intValue() + " is " + lengthCount.get(number).intValue());
        }
    }

    public void displayMostFreqLength(HashMap<Integer, Integer> lengthCountMap) {
        int maxFrequency = 0;
        String mostFrequentLength = ""; //string to add on the end
        boolean firstAnswer = true; //used for '&' if there are multiple word frequencies
        ArrayList<Integer> wordLengthList = new ArrayList<>(); //used to store multiple word lengths with same max frequency

        for (Integer number : lengthCountMap.keySet()) { //find the maximum frequency
            if (lengthCountMap.get(number).intValue() > maxFrequency) {
                mostFrequentLength = String.valueOf(number.intValue());
                maxFrequency = lengthCountMap.get(number).intValue();
            }
        }

        for (Integer number : lengthCountMap.keySet()) { //see if another length shares this maximum
            if (lengthCountMap.get(number).intValue() == maxFrequency) {
                wordLengthList.add(number);
            }
        }

        if (wordLengthList.size() != 1) {
            for (Integer frequency : wordLengthList) {
                if (firstAnswer) {
                    mostFrequentLength = String.valueOf(frequency.intValue());
                    firstAnswer = false;
                }
                else {
                    mostFrequentLength += " & " + String.valueOf(frequency.intValue());
                }
            }
        }

        System.out.println("The most frequently occurring word length is " + maxFrequency + ", for word length " + mostFrequentLength);
    }
}
