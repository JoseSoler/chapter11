package com.java.learning.model;

import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.rmi.UnexpectedException;
import java.util.List;
import java.util.Random;

/**
 * Created by jsoler on 14.04.15.
 */
public class Network implements Closeable {

    Random generator = new Random();

    public void notifyExternalSystems(List<BillableItem> processedItems) {

        if (generator.nextBoolean()) {
           throw new RuntimeException("Network Error");
        }

    }

    @Override
    public void close() throws IOException {

    }
}
