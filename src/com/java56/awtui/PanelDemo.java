package com.java56.awtui;

import java.awt.*;

public class PanelDemo extends Frame {
    private Panel pnl;
    public PanelDemo(){
        pnl=new Panel();
        pnl.setBackground(Color.cyan);
        pnl.add(new Button("Test"));


       // setLayout(new FlowLayout());
        setSize(500,350);
        setVisible(true);
        add(pnl);
    }

    public static void main(String[] args) {
        new PanelDemo();
    }
}
