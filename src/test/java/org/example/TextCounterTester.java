package org.example;




import org.example.model.Counter;
import org.example.model.TextReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class TextCounterTester
{
    TextReader textReader = new TextReader();
    BufferedReader br;
    Counter counter = new Counter();

    @Before
    public void setUp() throws FileNotFoundException {
        br = textReader.readFile("resources/TestFile.txt");
    }

    @Test
    public void testFileRead() throws IOException {
        Assert.assertTrue(br.readLine()!=null);
    }

    @Test
    public void testWordCount() throws IOException {
        counter.count(br);
        Assert.assertEquals(8, counter.getWordCount()); ;
    }

    @Test
    public void testWordAverage() throws IOException {
        counter.count(br);
        Assert.assertEquals(4, counter.getAverage());
    }

    @Test
    public void testMapSize() throws IOException {
        counter.count(br);
        Assert.assertEquals(6, counter.getLengthCount().size());

    }
}
