package com.r500076108.q5;
import java.util.Scanner;

public class Employee extends Exception {
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("\n");
        System.out.println("Employee Name -: "+this.name);
        System.out.println("Employee age -: "+this.age);
    }
    public Employee(String Ename, int Eage){
        super("");
        name=Ename;
        age=Eage;
        if(name.matches("^\\d+(\\.\\d+)?")){
            System.out.println("name cannot be number");
        }
        else if(age>50){
            System.out.println("age is greater than 50");
        }
        else{
            show();
        }

    }
}
class Check{
    public  static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Employee Name = ");
        String eName=sc.next();
        System.out.print("Enter Employee age = ");
        int eAge=sc.nextInt();
        try{
            throw new Employee(eName,eAge);
        }catch (Employee ep){
            System.out.println(ep.getMessage());

        }

    }
}