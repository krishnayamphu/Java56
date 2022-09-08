package com.java56.awtui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Frame {
    private Button btnok;
    public EventDemo(){
        btnok=new Button("Click Me!");
        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Its Working");
            }
        });
        add(btnok);

        setLayout(new FlowLayout());
        setSize(400,300);
        setTitle("Event Demo");
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventDemo();
    }
}
