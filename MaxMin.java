package Array;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the Parameter of array");
        for (int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
                int min=a[0];
                int max=a[0];
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]<min)
                        min=a[i];
                    if(a[i]>max)
                        max=a[i];
                }
        System.out.println("Min no in the array is : "+min+"\nMax no in the array is : "+max);
       // System.out.println("Max no in the array"+max);
    }
}
