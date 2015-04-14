package com.java.learning.model;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * Created by jsoler on 14.04.15.
 */
public class Network implements Closeable {

    public void notifyExternalSystems(List<BillableItem> processedItems) {

    }

    @Override
    public void close() throws IOException {

    }
}
