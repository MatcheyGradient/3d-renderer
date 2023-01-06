package main;

import main.listener.*;
import main.listener.KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.*;

public class Window extends JPanel implements ActionListener {

    Timer timer;
    public static final int boardSizeX = 1500;
    public static final int boardSizeY = 900;

    public Window(){
        this.setPreferredSize(new Dimension(boardSizeX, boardSizeY));
        this.setBackground(new Color(0, 0, 0, 255));
        this.addMouseListener(new ClickListener());
        this.addMouseMotionListener(new MouseTracker());
        this.addMouseWheelListener(new WheelListener());
        this.addKeyListener(new KeyListener());
        this.setFocusable(true);
        timer = new Timer(0, this);
        start();
    }

    public void start() {
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    public void draw(Graphics g){
        g.setColor(white);
        RenderObjects.render(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();

        RenderObjects.checkRot();
    }
}