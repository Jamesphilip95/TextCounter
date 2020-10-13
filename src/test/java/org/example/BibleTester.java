package org.example;

import org.example.display.Display;
import org.example.model.Counter;
import org.example.model.TextReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BibleTester { //large file test
    TextReader textReader = new TextReader();
    BufferedReader br;
    Counter counter = new Counter();
    Display display = new Display();

    @Before
    public void setUp() throws IOException {
        br = textReader.readFile("HolyBible.txt");
        counter.count(br);

    }

    @Test
    public void testWordCount() throws IOException {
        Assert.assertEquals(783137, counter.getWordCount()); ;
    }

    @Test
    public void testDisplayWordCount() throws IOException { //visual display to do test
        display.displayWordCount(counter.getWordCount());
        display.displayAverageWordLength(counter.getAverage());
        display.displayWordLengthCount(counter.getLengthCountMap());
        display.displayMostFreqLength(counter.getLengthCountMap());
    }
}
