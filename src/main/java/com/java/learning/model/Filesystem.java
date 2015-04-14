package com.java.learning.model;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Created by jsoler on 14.04.15.
 */
public class Filesystem implements Closeable {

    Random generator = new Random();


    public void close() throws IOException {
        System.out.println("Closing resource");
    }

    public void backupItems(List<BillableItem> processedItems) {
        if (generator.nextBoolean()) {
            throw new RuntimeException("Filesystem Error");
        }
    }
}
