package org.example.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class Counter {
    private String string;
    private double wordCount = 0;
    private double letterCount = 0;
    private HashMap<Integer, Integer> lengthCountMap = new HashMap<>(); //HashMap used to store number of words at each length. Key = number, value = frequency

    public void count(BufferedReader br) throws IOException {
        while ((string = br.readLine()) != null) {
            String[] wordsArray = string.split("\\s+");  //split words with blank space
            for (String word : wordsArray) {
                word = word.replaceAll("[^a-zA-Z0-9/&£$%+-]",""); //only allow permitted characters
                if (word.length() != 0) { //omit all words no letters i.e tabs, spaces, new lines
                    addLengthCount(word.length());
                    letterCount += word.length();
                    wordCount++;
                }
            }
        }
    }

    private void addLengthCount(int wordLength) {
        if (lengthCountMap.containsKey(Integer.valueOf(wordLength))) {
            int temp = lengthCountMap.get(Integer.valueOf(wordLength)).intValue();
            temp++;
            lengthCountMap.put(Integer.valueOf(wordLength), Integer.valueOf(temp));
        } else {
            lengthCountMap.put(Integer.valueOf(wordLength), Integer.valueOf(1));
        }
    }

    public double getLetterCount() {
        return letterCount;
    }

    public double getAverage() {
        double averageLength = letterCount / wordCount;
        return averageLength;
    }

    public int getWordCount() {
        return (int) wordCount;
    }

    public HashMap<Integer, Integer> getLengthCountMap() {
        return lengthCountMap;
    }
}
