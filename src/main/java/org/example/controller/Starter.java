package org.example.controller;

import java.io.IOException;

public class Starter
{
    public static void main( String[] args ) throws IOException {
        CounterManager counterManager = new CounterManager();
        counterManager.countText("HolyBible.txt"); //type in the file you wish to count here
    }
}
