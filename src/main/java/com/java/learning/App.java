package com.java.learning;

import com.java.learning.controller.Controller;

/**
 * Created by jsoler on 14.04.15.
 */
public class App {
    public static void main(String args[]){
        Controller controller = new Controller();
        controller.runInvoiceProcess();
    }
}
