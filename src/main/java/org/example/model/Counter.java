package org.example.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;

public class Counter {
    private String string;
    private int wordCount = 0;
    private int maxLength = 0;
    private int letterCount = 0;
    private HashMap<Integer, Integer> lengthCount = new HashMap<>();

    public void count(BufferedReader br) throws IOException {
        while ((string = br.readLine()) != null) {
            String[] words = string.split("\\s+");
            for (String word : words) {
                addLengthCount(word.length());
                checkMax(word.length());
                letterCount += word.length();// rename words and word, add other comments for clarity.
            }
            wordCount += words.length;
        }
    }

    private void checkMax(int wordLength) {
        if (wordLength > maxLength) maxLength = wordLength;
    }

    private void addLengthCount(int wordLength) {
        if (lengthCount.containsKey(Integer.valueOf(wordLength))) {
            int temp = lengthCount.get(Integer.valueOf(wordLength)).intValue();
            temp++;
            lengthCount.put(Integer.valueOf(wordLength), Integer.valueOf(temp));
        } else {
            lengthCount.put(Integer.valueOf(wordLength), Integer.valueOf(1));
        }
    }

    public int getAverage() {
        int averageLength = letterCount / wordCount;
        return averageLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public HashMap<Integer, Integer> getLengthCount() {
        return lengthCount;
    }
}
