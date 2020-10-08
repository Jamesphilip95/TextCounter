package org.example.model;

import java.io.*;

public class TextReader {
    public BufferedReader readFile(String s) throws FileNotFoundException {
        File file = new File("resources/TestFile.txt");
        FileInputStream stream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(stream);
        return new BufferedReader(reader);
    }


}
