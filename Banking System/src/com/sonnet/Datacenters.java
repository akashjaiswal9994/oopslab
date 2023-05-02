package com.sonnet;

import java.sql.*;
import java.util.Scanner;

public class Datacenters extends UserData{
    public static void main(String args[]) throws Exception {
        UserData ud=new UserData();
        Scanner sc =new Scanner(System.in);
        String url="jdbc:mysql://127.0.0.1:3306/BankingSystem";
        String username="root";
        String password="root";

        Class.forName("com.mysql.cj.jdbc.Driver");
     //   String query="create table UserDetails(Userid BIGINT Primary key,Uname varchar(20),Amount float,Withdraw float,Deposit float )";
        String insertQuery="insert into UserDetails Values( ?,?,?,?,?)";
        String updateAmount= "UPDATE userDetails set Amount=Deposit where Userid=?";


        Connection connection=DriverManager.getConnection(url,username,password);
        Statement st=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        Statement st1=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        Statement st2=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        Statement st3=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        PreparedStatement p1;
        PreparedStatement p2;
//        int rs=st.executeUpdate(query);

//        System.out.println(rs);
        int select,select1;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("|                                           |");
            System.out.println("Open Account            - Press 1");
            System.out.println("Login Into Your Account - Press 2");
            System.out.println("Exit                    - Press 3");
            System.out.print("enter your option: ");
            select =sc.nextInt();
            switch (select){
                case 1:
                    System.out.print("\n");
                    System.out.println("******************* Fill the details ********************");
                    ud.getData();
                    p1=connection.prepareStatement(insertQuery);
                    p1.setLong(1,ud.getUserId());
                    p1.setString(2,ud.getUname());
                    p1.setFloat(3,ud.getAmount());
                    p1.setFloat(4,ud.getWithdraw());
                    p1.setFloat(5,ud.getDeposit());
                    p2=connection.prepareStatement(updateAmount);
                    p2.setLong(1,ud.getUserId());
                    int row=p1.executeUpdate();
                    int rowAmount=p2.executeUpdate();
                    break;
                case 2:
                    boolean flag=false;
                    final long getSapId;
                    System.out.print("\n");
                    System.out.println("******************* Login into account ********************");
                    System.out.print("Enter User ID (sap id): ");
                    getSapId =sc.nextLong();
                    ResultSet rs=st.executeQuery("select Userid from userDetails");
                    while(rs.next()){
                        if(rs.getLong(1)==getSapId){
                            flag=true;

                            do {
                                System.out.println("==========================================================");
                                System.out.println("Check Balance         - press 1");
                                System.out.println("Withdraw money        - press 2");
                                System.out.println("Deposit money         - press 3");
                                System.out.println("Exit                  - press 4");
                                System.out.print("enter your option ");
                                select1=sc.nextInt();
                                switch(select1){
                                    case 1:
                                        System.out.println("checking balance");
                                        ResultSet checkAm=st3.executeQuery("select Uname ,Amount from UserDetails where Userid ="+getSapId);
                                        System.out.println("########################################################");
                                        System.out.println("User name          Amount ");
                                        while (checkAm.next()){
                                            System.out.println(checkAm.getString("Uname")+"         "+checkAm.getString("Amount"));
                                        }
                                        System.out.println("########################################################");
                                        System.out.println();
                                        break;
                                    case 2:
                                        float withdrawAmount;
                                        System.out.println("Enter the amount to be withdraw");
                                        withdrawAmount=sc.nextFloat();
                                        ResultSet wA=st1.executeQuery("select Amount from userDetails where Userid ="+getSapId);
                                        wA.next();
                                        if (wA.getFloat("Amount") > 0) {
                                            int wa = st1.executeUpdate("UPDATE userDetails set Amount=Amount"+ - + withdrawAmount + "where Userid=" + getSapId);
                                            System.out.println("Amount " + withdrawAmount + " Withdraw Successful ");
                                        } else {
                                            System.out.println("your Account balance is Zero. Kindly Deposit some amount ");
                                        }



                                        break;
                                    case 3:
                                        float depositAmount;
                                        System.out.println("Enter the Amount to be deposit");
                                        depositAmount=sc.nextFloat();
                                        ResultSet dA=st2.executeQuery("select Amount from userDetails where Userid ="+getSapId);

                                        int da = st2.executeUpdate("UPDATE userDetails set Amount=Amount +" + depositAmount + "where Userid=" + getSapId);
                                        System.out.println("Amount " + depositAmount + " Deposit Successful ");


                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Invalid Choice");
                                }

                            }while (select1!=4);

                        }

                    }
                    if (flag==false){
                        System.out.println("Invalid user id kindly recheck the id or user may not be register.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Choice please select valid option");


            }
        }while (select!=3);
//        st3.close();
//      st1.close();
//        st2.close();
        st.close();
        connection.close();
    }
}
