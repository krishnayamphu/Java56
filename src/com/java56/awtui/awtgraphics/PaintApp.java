package com.java56.awtui.awtgraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PaintApp extends Canvas implements MouseMotionListener {
    Button btn, btnc;

    public PaintApp() {
        btn = new Button("Draw");
        btnc = new Button("Clear");
        setBackground(Color.PINK);
        addMouseMotionListener(this);
    }

    public static void main(String[] args) {
        PaintApp app = new PaintApp();
        Frame f = new Frame();
        Panel p = new Panel();
        p.setLayout(new GridLayout(1, 2));
        p.add(app.btn);
        p.add(app.btnc);
        app.btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g=app.getGraphics();
                int[] x={50,100,150};
                int[] y={150,50,150};
                g.setColor(Color.cyan);
                g.fillPolygon(x,y,3);

                g.setColor(Color.green);
                g.fillRect(200,50,100,100);
            }
        });
        app.btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = app.getGraphics();
                g.clearRect(0, 0, app.getWidth(), app.getHeight());
            }
        });
        f.setLayout(new BorderLayout());
        f.add(p, BorderLayout.NORTH);
        f.add(app, BorderLayout.CENTER);
        f.setSize(600, 400);
        f.setVisible(true);


    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = this.getGraphics();
        g.fillOval(e.getX(), e.getY(), 5, 5);
        System.out.println("x="+e.getX()+", y="+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
