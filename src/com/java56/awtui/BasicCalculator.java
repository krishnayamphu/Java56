package com.java56.awtui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BasicCalculator extends Frame {
    private Label lbln1,lbln2,lblre;
    private TextField txtn1,txtn2,txtre;
    private Button btnp,btnm,btnmul,btnd;
    private double n1,n2,re;
    public BasicCalculator(){

        lbln1=new Label("N1:");
        lbln2=new Label("N2:");
        lblre=new Label("RE:");

        txtn1=new TextField(30);
        txtn2=new TextField(30);
        txtre=new TextField(30);

        btnp=new Button(" + ");
        btnm=new Button(" - ");
        btnmul=new Button(" x ");
        btnd=new Button(" / ");

        add(lbln1); add(txtn1);
        add(lbln2); add(txtn2);
        add(lblre); add(txtre);

        add(btnp); add(btnm); add(btnmul); add(btnd);

        btnp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                re=n1+n2;
                txtre.setText(String.valueOf(re));
            }
        });
        btnm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                re=n1-n2;
                txtre.setText(String.valueOf(re));
            }
        });
        btnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                re=n1*n2;
                txtre.setText(String.valueOf(re));
            }
        });
        btnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(txtn1.getText());
                n2=Double.parseDouble(txtn2.getText());
                re=n1/n2;
                txtre.setText(String.valueOf(re));
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(300,300);
        setTitle("Calculator");
        setVisible(true);
    }
    public static void main(String[] args) {
        new BasicCalculator();
    }
}
