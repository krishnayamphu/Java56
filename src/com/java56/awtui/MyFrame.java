package com.java56.awtui;

import java.awt.*;

public class MyFrame extends Frame {
    private Label lbltext;
    private Button btn;
    public MyFrame(){
        lbltext=new Label("Hello World");
        btn=new Button("Click Me");

        add(lbltext);
        add(btn);
        setLayout(new FlowLayout());
        setSize(500,400);
        setTitle("Frame Demo");
        setLocation(400,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
