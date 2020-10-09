package org.example.controller;

import org.example.model.Counter;
import org.example.model.TextReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CounterManager {
    public void run() throws IOException {
        TextReader textReader = new TextReader();
        Counter counter = new Counter();
       BufferedReader br = textReader.readFile("resources/TestFile.txt");
       counter.count(br);
    }
}
