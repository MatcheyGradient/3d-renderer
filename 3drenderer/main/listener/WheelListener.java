package main.listener;

import main.RenderObjects;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class WheelListener implements MouseWheelListener {
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        switch (e.getWheelRotation()) {
            case 1:
                RenderObjects.distance += 2;
                break;
            case -1:
                RenderObjects.distance -= 2;
                break;
        }
    }
}
