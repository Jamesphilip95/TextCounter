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

public class ExampleTester
{
    TextReader textReader = new TextReader();
    BufferedReader br;
    Counter counter = new Counter();
    Display display = new Display();

    @Before
    public void setUp() throws FileNotFoundException {
        br = textReader.readFile("ExampleFile.txt"); //testing done by visually counting expected results from a test file.

    }

    @Test
    public void testFileRead() throws IOException {
        Assert.assertTrue(br.readLine()!=null);
    }

    @Test
    public void testWordCount() throws IOException {
        counter.count(br);
        Assert.assertEquals(9, counter.getWordCount()); ;
    }

    @Test
    public void testLetterCount() throws IOException {
        counter.count(br);
        Assert.assertEquals(41, counter.getLetterCount(), 0);
    }

    @Test
    public void testWordAverage() throws IOException {
        counter.count(br);
        Assert.assertEquals(4.556, counter.getAverage(),.3);
    }

    @Test
    public void testMapSize() throws IOException {
        counter.count(br);
        Assert.assertEquals(7, counter.getLengthCountMap().size());

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
