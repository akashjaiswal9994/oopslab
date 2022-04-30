package com.akash.hashmaptrial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui1 extends JFrame implements ActionListener {
    public void implementGui(){
        HashMap1 hashMap=new HashMap1();
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setTitle("Akash  Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton addData=new JButton("ADD");
        JLabel Jl1=new JLabel("Add Data");
        JButton showData=new JButton("SHOW");
        JLabel Jl2=new JLabel("Show DATA");
        add(Jl1);
        add(addData);
        add(Jl2);
        add(showData);
        addData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   hashMap.addNewData();
            }
        });
        showData.addActionListener(this);
    }
    public static void main(String[] args){
        Gui1 gui1=new Gui1();
        gui1.implementGui();

    }

    public void actionPerformed(ActionEvent e) {

    }
}
