import java.util.*;

public class RotatingArray {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int d = sc.nextInt();
            int j = 0;
            while(j<d)
            {
                int i = 0;
                int temp = arr[0];
                for(i = 1; i<arr.length; i++)
                {
                    arr[i-1] = arr[i];
                }
                arr[arr.length-1] = temp;
                j++;
            }
            for(int i = 0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }

