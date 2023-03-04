package Array;

import java.util.Arrays;

public class InsertionPractice {
    public static void main(String[] args) {
        int[] a={5,6,2,4,9,8,3,1,7};
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i;
            for(;j>0;j--)
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
