package org.example.controller;

import org.example.display.Display;
import org.example.model.Counter;
import org.example.model.TextCounter;
import org.example.model.TextReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CounterManager implements TextCounter {
    @Override
    public void countText(String fileName) throws IOException {
        TextReader textReader = new TextReader();
        Counter counter = new Counter();
        Display display = new Display();
        BufferedReader br = textReader.readFile(fileName);
        counter.count(br);
        display.displayWordCount(counter.getWordCount());
        display.displayAverageWordLength(counter.getAverage());
        display.displayWordLengthCount(counter.getLengthCount());
        display.displayMostFreqLength(counter.getLengthCount());

    }
}
