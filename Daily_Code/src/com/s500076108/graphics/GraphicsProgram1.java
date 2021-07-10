package com.s500076108.graphics;

import javax.swing.*;
import java.awt.*;

public class GraphicsProgram1 extends Canvas {
    public  static void main(String args[]){
        JFrame jFrame =new JFrame("My First Drawing");
        Canvas canvas=new Canvas();
        canvas.setSize(400,400);
        jFrame.add(canvas);
        jFrame.pack();
        jFrame.setVisible(true);
    }
    public void paint(Graphics g){
        g.fillOval(100,100,200,200);
    }
}
