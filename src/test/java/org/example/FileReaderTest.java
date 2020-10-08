package org.example;




import org.example.model.TextReader;
import org.junit.Assert;
import org.junit.Test;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class FileReaderTest
{
    TextReader textReader = new TextReader();
    BufferedReader br;

    @Test
    public void testFileRead() throws IOException {
       br = textReader.readFile("resources/TestFile.txt");
        Assert.assertTrue(br.readLine()!=null);


    }
}
