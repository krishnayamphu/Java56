package com.java56.awtui.awtgraphics;

import java.awt.*;

public class GraphicsDemo extends Frame {
    public GraphicsDemo(){
        setSize(500,400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(50,50,100,100);

        g.setColor(Color.cyan);
        g.fillRect(200,50,100,100);

        g.setColor(Color.black);
        g.drawLine(50,170,250,170);

        g.drawArc(100,200,100,100,0,90);
        g.fillArc(50,200,100,100,0,-90);
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
