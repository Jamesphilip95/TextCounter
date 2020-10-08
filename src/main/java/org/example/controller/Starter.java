package org.example.controller;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args ) throws FileNotFoundException {
        CounterManager counterManager = new CounterManager();
        counterManager.run();
    }
}
