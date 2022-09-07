package com.java56.awtui;

import java.awt.*;

public class FormDemo extends Frame {
    Label lblname, lblcourse,lblgender,lblremarks,lblcountry,lbllist;
    TextField txtname;
    Checkbox cbbasic,cbweb,cbmale,cbfemale;
    CheckboxGroup gender;
    TextArea ta;
    Choice country;
    List list;
    Button btnok;
    public FormDemo(){
        lblname=new Label("Name:");
        lblcourse=new Label("Course:");
        lblgender=new Label("Gender:");
        lblremarks=new Label("Remarks:");
        lblcountry=new Label("Country:");
        lbllist=new Label("List");

        txtname=new TextField(20);
        cbbasic=new Checkbox("Basic",true);
        cbweb=new Checkbox("Web");
        gender=new CheckboxGroup();
        cbmale=new Checkbox("Male",gender,false);
        cbfemale=new Checkbox("Female",gender,false);

        ta=new TextArea(5,20);
        country=new Choice();
        country.add("Nepal");
        country.add("China");
        country.add("India");
        country.add("Japan");
        country.add("Korea");

        list=new List();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");

        btnok=new Button("Submit");

        add(lblname);
        add(txtname);
        add(lblcourse);
        add(cbbasic);
        add(cbweb);

        add(lblgender);
        add(cbmale);
        add(cbfemale);

        add(lblremarks);
        add(ta);

        add(lblcountry);
        add(country);

        add(lbllist);
        add(list);

        add(btnok);

        setLayout(new FlowLayout());
        setSize(200,400);
        setTitle("Form Example");
        setVisible(true);
    }
    public static void main(String[] args) {
        new FormDemo();
    }
}
