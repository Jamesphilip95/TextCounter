package org.example.model;

import java.io.*;

public class TextReader {
    public BufferedReader readFile(String fileName) throws FileNotFoundException {
        File file = new File("resources/" + fileName);
        FileInputStream stream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(stream);
        return new BufferedReader(reader);
    }


}
