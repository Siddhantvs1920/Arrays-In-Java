package Array;

import java.util.Arrays;
//Insertion sort

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={33,44,55,11,23,51,20,9,8,5,1};
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i;
            for (;j>0;j--)
            {
                if(temp<a[j-1])
                {
                    a[j]=a[j-1];

                }
                else
                {
                    break;
                }

            }
            a[j]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
