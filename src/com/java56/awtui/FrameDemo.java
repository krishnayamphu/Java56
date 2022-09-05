package com.java56.awtui;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(400,300);
        f.setTitle("Frame Example");
        f.setLocation(500,100);
        f.setResizable(false);
        f.setVisible(true);
    }
}
