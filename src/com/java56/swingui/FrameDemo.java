package com.java56.swingui;

import javax.swing.*;
import java.awt.*;

public class FrameDemo{

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JButton btn=new JButton("Click");
        frame.add(btn);
        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
