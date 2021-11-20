package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Order;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet {
    private final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Tablet{number=%d}", number);
    }

    public void createOrder(){
        try {
            Order order = new Order(this);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "The console is unavailable.");
        }

    }
}
