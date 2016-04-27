package com.cprakashagr.mouseMover;

import java.awt.*;

/**
 * Created by chandra on 4/27/16.
 */
public class MouseMover {

    private int moveFactor;
    private int width;
    private int height;

    private Robot robot;
    private Dimension screenSize;

    public MouseMover() throws AWTException {

        robot = new Robot();
        moveFactor = 10;
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int) screenSize.getWidth() / 2;
        height = (int) screenSize.getHeight() /2;
    }

    public void moveAction() {

        if (robot!=null) {

            robot.mouseMove(width + moveFactor, height + moveFactor);
            moveFactor *= -1;
        }
    }
}
