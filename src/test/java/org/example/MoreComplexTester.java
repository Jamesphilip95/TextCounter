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

public class MoreComplexTester {

        TextReader textReader = new TextReader();
        BufferedReader br;
        Counter counter = new Counter();
        Display display = new Display();

        @Before
        public void setUp() throws FileNotFoundException {
            br = textReader.readFile("TestFile.txt"); //testing done by visually counting expected results from a test file.
        }

        @Test
        public void testWordCount() throws IOException {
            counter.count(br);
            Assert.assertEquals(14, counter.getWordCount()); ;
        }

        @Test
        public void testLetterCount() throws IOException {
            counter.count(br);
            Assert.assertEquals(86, counter.getLetterCount(), 0);
        }

        @Test
        public void testDisplayWordCount() throws IOException { //visual display to do test
            counter.count(br);
            display.displayWordCount(counter.getWordCount());
            display.displayAverageWordLength(counter.getAverage());
            display.displayWordLengthCount(counter.getLengthCountMap());
            display.displayMostFreqLength(counter.getLengthCountMap());
        }
    }
