package com.java56.awtui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormEvent extends Frame implements ActionListener {
    private Button btnok,btnclose;
    public FormEvent(){
        btnok=new Button("Click");
        btnok.addActionListener(this);
        add(btnok);

        btnclose=new Button("close");
        btnclose.addActionListener(this);
        add(btnclose);
        setLayout(new FlowLayout());
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FormEvent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnok){
            System.out.println("Hello World");
        }
        if(e.getSource()==btnclose){
            System.exit(0);
        }
    }
}
