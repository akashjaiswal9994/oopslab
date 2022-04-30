package com.akash.hashmaptrial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap1 extends JFrame implements ActionListener {
    HashMap<Integer ,String> data;
    String name;
    int id;
    public HashMap1(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setTitle("Akash Jaiswal Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addNewData(String name,int id){
       data = new HashMap<Integer,String>();
        data.put(id, name);
    }
    public void showAllData(int id){

    }
    public static void main(String[] args){
     HashMap1 hashMap=new HashMap1();
//        HashMap<Integer ,String> data = new HashMap<Integer,String>();
//        String name;
//        int id;
//        Scanner sc=new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("******************************\n");
//            System.out.println("Select your option  below");
//            System.out.println("Press 1: Enter Data");
//            System.out.println("Press 2: View Single Data");
//            System.out.println("Press 3: View  All Data");
//            System.out.println("Press 4: exit");
//             choice=sc.nextInt();
//            switch(choice) {
//                case 1:
//                    System.out.print("enter ID: ");
//                    id=sc.nextInt();
//                    System.out.print("Enter Name: ");
//                    name=sc.next();
//                    data.put(id,name);
//                    break;
//                case 2:
//                    System.out.println("Enter ID");
//                    id=sc.nextInt();
//                    if(data.containsKey(id)){
//                        System.out.println(data.get(id));
//                    }
//                    else{
//                        System.out.println("id does not exist");
//                        }
//
//                    break;
//                case 3:
//                    System.out.println("ID    Name");
//                    for(Map.Entry m:data.entrySet())
//                    System.out.println(m.getKey()+"    "+m.getValue());
//                    break;
//                case 4:
//                    break;
//                default:
//                    System.out.println("Wrong input please try again later");
//
//            }
//        }while(choice>=1 && choice<=3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
