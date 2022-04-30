package com.akash.SwingDemo;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGUI {
 public static void main(String[] args){
     TestDemo testDemo=new TestDemo();

 }
}
class TestDemo extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton jb;
    JLabel jl;
    JLabel jl_1;
    public TestDemo(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        jb=new JButton("Submit");
        jl=new JLabel("Result = ");
        jl_1=new JLabel();
        add(t1);
        add(t2);
        add(jb);
        add(jl);
        add(jl_1);
        jb.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setTitle("Akash Jaiswal Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value_1= Integer.parseInt(t1.getText());
        int value_2= Integer.parseInt(t2.getText());
        int result = value_1 +value_2;
        jl_1.setText(Integer.toString(result));



    }
}
