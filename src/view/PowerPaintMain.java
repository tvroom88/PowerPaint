/*
 * TCSS 305 – Fall 2020
 * Assignment 4 - PowerPaint.
 */

package view;

import java.awt.EventQueue;

/**
 * The driver for this application. 
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020
 */

public class PowerPaintMain {

    /**
     * Private constructor to inhibit instantiation.
     */
    private PowerPaintMain() {
        throw new IllegalStateException();
    }

    /**
     * Creates and makes visible a PowerPaintGUI.
     * 
     * @param theArgs Command line arguments, ignored.
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PowerPaintGUI();
            }
        });
    }

}
