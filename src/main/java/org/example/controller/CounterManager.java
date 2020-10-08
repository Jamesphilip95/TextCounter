package org.example.controller;

import org.example.model.TextReader;

import java.io.FileNotFoundException;

public class CounterManager {
    public void run() throws FileNotFoundException {
        TextReader textReader = new TextReader();
        textReader.readFile("resources/TestFile.txt");

    }
}
