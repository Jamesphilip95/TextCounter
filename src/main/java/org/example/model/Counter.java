package org.example.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class Counter {
    private String string;
    private double wordCount = 0;
    private double letterCount = 0;
    private HashMap<Integer, Integer> lengthCountMap = new HashMap<>();

    public void count(BufferedReader br) throws IOException {
        while ((string = br.readLine()) != null) {
            String[] wordsArray = string.split("\\s+");
            for (String word : wordsArray) {
                word = word.replaceAll("[^a-zA-Z1-9&/]","");
                if (word.length() != 0) {
                    addLengthCount(word.length());
                    letterCount += word.length();
                    wordCount++;// rename wordsArray and word, add other comments for clarity.
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

    public double getAverage() {
        double averageLength = letterCount / wordCount;
        return averageLength;
    }

    public int getWordCount() {
        return (int) wordCount;
    }

    public HashMap<Integer, Integer> getLengthCount() {
        return lengthCountMap;
    }
}
