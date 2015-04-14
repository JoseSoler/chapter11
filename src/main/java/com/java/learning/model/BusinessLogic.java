package com.java.learning.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsoler on 14.04.15.
 */
public class BusinessLogic {
    /**
     * Applies the most stupid business logic ever... or maybe not.
     *
     * @param rawItems
     * @return a List with already processed items
     */
    public List<BillableItem> apply(List<BillableItem> rawItems) {
        List<BillableItem> processedItems = new ArrayList<>();
        processedItems.add(rawItems.get(5));
        processedItems.add(rawItems.get(15));
        processedItems.add(rawItems.get(55));
        return processedItems;
    }
}
