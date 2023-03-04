package Array;

import java.util.Arrays;

public class InseertionSorting {
    public static void main(String[] args) {
        int[] a={5,3,4,1,6,2,7,3};
        for (int i=1;i<a.length;i++)
        {
           int temp=a[i];
           int j=i;
            for (;j>0;j--)
            {
                if(temp<a[j-1])
                    a[j]=a[j-1];
                else
                    break;
            }
            a[j]=temp;
        }
        System.out.println(Arrays.toString(a));

    }
}
