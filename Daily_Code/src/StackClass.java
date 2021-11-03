import java.util.Scanner;
import java.util.Stack;

public class StackClass implements StackInterface{

    @Override
    public void pop() {
        System.out.println("pop method called!");
    }

    @Override
    public void push() {
        System.out.println("push method called!");
    }

    @Override
    public void display() {
        System.out.println("display method called");
    }
    public static void main(String[] args){
        int select;
        StackClass stackClass=new StackClass();
        Stack stack =new Stack();
        Scanner sc=new Scanner(System.in);
        var item="";

        do {
            System.out.println("");
            System.out.println("press 1 for pop");
            System.out.println("press 2 for push");
            System.out.println("press 3 for Display");
            System.out.print("enter your option: ");
            select=sc.nextInt();
            switch (select){
                case 1:
                    var removeItem="";
                    System.out.println("item in stack..");
                    System.out.println(stack);


                    break;
                case 2:
                    stackClass.push();
                    System.out.println("enter the item you want to add");
                    item=sc.next();
                    stack.push(item);
                    break;
                case 3:
                    stackClass.display();
                    System.out.println("item in stack..");
                    System.out.println(stack);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }while (select!=4);


    }
}
