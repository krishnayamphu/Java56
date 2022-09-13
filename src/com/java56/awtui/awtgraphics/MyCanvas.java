package com.java56.awtui.awtgraphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCanvas extends Canvas {
    Button btn,btnc;
    public MyCanvas(){
        btn=new Button("Draw");
        btnc=new Button("Clear");
        this.setBackground(Color.cyan);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public static void main(String[] args) {
        MyCanvas canvas=new MyCanvas();
        Frame f=new Frame();
        Panel p=new Panel();
        p.setLayout(new GridLayout(1,2));
        p.add(canvas.btn);
        p.add(canvas.btnc);
        f.setLayout(new BorderLayout());
        f.add(p,BorderLayout.NORTH);
        canvas.btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi");
                Graphics g= canvas.getGraphics();
                g.fillRect(200,50,100,100);
            }
        });
        canvas.btnc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.setBackground(Color.red);
                System.out.println("repaint");
            }
        });

        f.add(canvas,BorderLayout.CENTER);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(500,500);
        f.setVisible(true);
    }
}
