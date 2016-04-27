package com.cprakashagr.mouseMover;

import java.awt.*;

/**
 * Created by chandra on 4/27/16.
 */
public class RunnerClass {

    public static void main(String[] args) {

        MouseMover mover = null;
        try {
            mover = new MouseMover();
            while (true) {
                try {
                    Thread.sleep(2000);
                    mover.moveAction();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
