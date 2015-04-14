package com.java.learning.controller;

import com.java.learning.model.*;
import com.java.learning.view.ConsoleWriter;

import java.util.List;

/**
 * Created by jsoler on 14.04.15.
 */
public class Controller {

    private BusinessLogic   businessLogic  = new BusinessLogic();
    private Database        database       = new Database();
    private Filesystem      filesystem     = new Filesystem();
    private Network         network        = new Network();
    private ConsoleWriter   view           = new ConsoleWriter();

    public void runInvoiceProcess() {

        database.openConnection();
        List<BillableItem> rawItems = database.getBillableItemsToInvoice();
        List<BillableItem> processedItems = businessLogic.apply(rawItems);
        network.notifyExternalSystems(processedItems);
        filesystem.backupItems(processedItems);

        view.setItems(processedItems);
        view.showItems();
    }
}
