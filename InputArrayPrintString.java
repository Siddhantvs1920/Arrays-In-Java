package Array;

import java.util.Scanner;

public class InputArrayPrintString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of String Array");
        int b=s.nextInt();
        String[] a=new String[b];

        System.out.println("enter the element of Array");
        for(int i=0;i<a.length;i++)
        {

            a[i]=s.next();
        }
        System.out.println(a[3]);

    }
}
