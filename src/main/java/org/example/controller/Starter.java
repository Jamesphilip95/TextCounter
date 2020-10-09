package org.example.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args ) throws IOException {
        CounterManager counterManager = new CounterManager();
        counterManager.run();
    }
}
