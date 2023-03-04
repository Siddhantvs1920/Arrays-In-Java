package Array;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {

        System.out.println("Enter The Size Array ");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        System.out.println("Enter The Para of Array");
        int[] sid=new int[size];


        for(int i=0;i<sid.length;i++)
        {
            sid[i]=s.nextInt();
        }
        System.out.println(sid[2]);
    }
}
