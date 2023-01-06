package main.listener;

import main.RenderObjects;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickListener implements MouseListener {

    public static int mX, mY;
    static double currentX;
    static double currentY;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        mX = e.getX();
        mY = e.getY();

        currentX = RenderObjects.xAngle;
        currentY = RenderObjects.yAngle;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        currentX = MouseTracker.finalX;
        currentY = MouseTracker.finalY;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
