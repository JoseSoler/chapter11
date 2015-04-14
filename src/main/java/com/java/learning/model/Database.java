package com.java.learning.model;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by jsoler on 14.04.15.
 */
public class Database implements Closeable {

    private boolean connected = false;

    public List<BillableItem> getBillableItemsToInvoice() {
        if (!connected) {
            throw new IllegalStateException("No connection established.");
        } else {
            return Collections.emptyList();

        }
    }

    public void openConnection() {
        if (connected) {
            throw new IllegalStateException("Connection already open.");
        }else {
            connected = true;
        }
    }

    @Override
    public void close() throws IOException {
        if (!connected) {
            throw new IllegalStateException("Connection already closed.");
        }

    }
}
