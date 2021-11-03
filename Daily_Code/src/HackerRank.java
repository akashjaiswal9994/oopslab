import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int value= sc.nextInt();
        if(value%2==1) {
            System.out.print("Weird");
        }
        if (value%2==0 && value>=2 && value<=5){
            System.out.print("Not Weird");

            }
        if (value%2==0 && value>=6 && value<=20){
            System.out.print("Weird");

        }
        if (value%2==0 && value>20 ){
            System.out.print("Not Weird");

        }

        }
    }
