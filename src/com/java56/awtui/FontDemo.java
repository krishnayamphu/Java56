package com.java56.awtui;

import java.awt.*;

public class FontDemo extends Frame {
    Label lbl1,lbl2;
    public FontDemo(){
        Font f=new Font("Arial",Font.BOLD,20);
        Font fi=new Font("Arial",Font.ITALIC,20);

        Color c=new Color(0,0,255);

        lbl1=new Label("Text Design");
        lbl1.setFont(f);
        lbl1.setForeground(c);

        lbl2=new Label("Text Design");
        lbl2.setFont(fi);
        lbl2.setForeground(Color.green);
        lbl2.setBackground(new Color(250,25,25));

        add(lbl1);
        add(lbl2);
        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FontDemo();
    }
}
