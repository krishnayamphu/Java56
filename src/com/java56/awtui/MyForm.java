package com.java56.awtui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyForm extends Frame {
    private Button btnok,btnclear;
    private TextField txtbox;
    public MyForm(){
        txtbox=new TextField(40);
        add(txtbox);

        btnok=new Button("Get Text");
        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=txtbox.getText();
                System.out.println(s);
            }
        });
        add(btnok);

        btnclear=new Button("Clear");
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox.setText("");
            }
        });
        add(btnclear);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });

        setSize(380,300);
        setLayout(new FlowLayout());
        setTitle("My Form");
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyForm();
    }
}
