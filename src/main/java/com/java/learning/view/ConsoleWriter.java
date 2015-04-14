package com.java.learning.view;

import com.java.learning.model.BillableItem;

import java.util.List;

/**
 * Created by jsoler on 14.04.15.
 */
public class ConsoleWriter {

    private List<BillableItem> items;

    /**
     * Gives to the View the Domain Elements to present.
     *
     * @param items
     */
    public void setItems(List<BillableItem> items) {
        this.items = items;
    }

    /**
     * Displays / Shows the Domain Elements.
     */
    public void showItems() {
         System.out.println(items);
    }
}
