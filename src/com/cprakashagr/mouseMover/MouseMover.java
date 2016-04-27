package com.cprakashagr.mouseMover;

import java.awt.*;

/**
 * Created by chandra on 4/27/16.
 */
public class MouseMover {

    private int moveFactor;

    private Robot robot;

    public MouseMover() throws AWTException {

        robot = new Robot();
        moveFactor = 10;
    }

    public void moveAction() {

        if (robot!=null) {
            robot.mouseMove(moveFactor,moveFactor);
            moveFactor *= -1;
        }
    }
}
