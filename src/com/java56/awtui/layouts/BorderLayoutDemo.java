package com.java56.awtui.layouts;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    private Button btn1,btn2,btn3,btn4,btn5;
    public BorderLayoutDemo(){
        btn1=new Button("North");
        btn2=new Button("South");
        btn3=new Button("East");
        btn4=new Button("West");
        btn5=new Button("Center");

        setLayout(new BorderLayout());
        setSize(400,400);
        setVisible(true);

        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        add(btn3,BorderLayout.EAST);
        add(btn4,BorderLayout.WEST);
        add(btn5,BorderLayout.CENTER);


    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
