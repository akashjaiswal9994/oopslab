import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_com {
    public static void main(String[] args) {
        int[] array = new int[7];
        int[] datatrans = new int[7];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            if(i == 3) continue;
            System.out.print("Enter bit number " + (i +1) +" :");
            array[i] = scan.nextInt();
        }

        int counter = 0;
        for(int i = 0; i < 5; i+=2)
        {
            if(array[i] == 1) counter +=1;

        }
        if(counter%2 ==0) array[6] = 0;
        else array[6] = 1;

        counter = 0;
        for(int i = 0; i < 3 ; i++)
        {
            if(array[i] == 1) counter +=1;

        }
        if(counter%2 ==0) array[3] = 0;
        else array[3] = 1;

        counter = 0;
        if(array[0] == 1) counter++;
        if(array[1] == 1) counter++;
        if(array[4] == 1) counter++;
        if(counter%2 ==0) array[5] = 0;
        else array[5] = 1;

        System.out.println("Final  data bits are : ");
        System.out.println(Arrays.toString(array));

        System.out.println("Input Recieved data bits : ");
        for(int i = 0 ; i < 7 ; i++) datatrans[i] = scan.nextInt();
        //System.out.println(Arrays.toString(datatrans));

        counter = 0;
        int c1,c2,c3;
        for(int i = 0; i < 7; i+=2)
        {
            if(datatrans[i] == 1) counter +=1;

        }
        if(counter%2 ==0) c1 = 0;
        else c1 = 1;

        counter = 0;
        for(int i = 0; i < 4 ; i++)
        {
            if(datatrans[i] == 1) counter +=1;

        }
        if(counter%2 ==0) c3 = 0;
        else c3 = 1;

        counter = 0;
        if(datatrans[0] == 1) counter++;
        if(datatrans[1] == 1) counter++;
        if(datatrans[4] == 1) counter++;
        if(datatrans[5] == 1) counter++;
        if(counter%2 ==0) c2 = 0;
        else c2 = 1;
        int c = c3 *4 + c2 *2 + c1 * 1;
        int pos = 7 -c;

        if(c == 0) System.out.println("No error is present");
        else {
            System.out.println("Error at position " + pos);
            if (datatrans[pos] == 0) datatrans[pos] = 1;
            else datatrans[pos] = 0;
        }
        System.out.println("The correct result is : ");
        System.out.println(Arrays.toString(datatrans));



    }


}
