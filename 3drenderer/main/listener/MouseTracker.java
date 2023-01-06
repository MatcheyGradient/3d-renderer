package main.listener;

import main.RenderObjects;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseTracker implements MouseMotionListener {

    static double finalX, finalY;

    @Override
    public void mouseDragged(MouseEvent e) {
        finalX = RenderObjects.xAngle = ClickListener.currentX + (e.getY() - ClickListener.mY)/1000f;
        finalY = RenderObjects.yAngle = ClickListener.currentY + (e.getX() - ClickListener.mX)/1000f;
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
