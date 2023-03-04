package Array;

import java.util.Arrays;

public class SortPositiveNegative {
    public static void main(String[] args) {
        int[] a={11,-22,-5,6,8,-9,4,32,-51,-87};
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if(a[i]<0&&a[j]>0)
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
