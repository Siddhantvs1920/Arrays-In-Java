package Array;

import java.util.Arrays;

public class TriplePairs {
    public static void main(String[] args) {
        int[] a={5,1,3,6,8,9,4};
        int num=12;
        for(int i=0;i< a.length;i++)
        {
            for(int j=i+1;j< a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                for (int k=j+1;k<a.length;k++)
                {
                    if(a[i]+a[j]+a[k]<num)
                        System.out.println(a[i]+" "+a[j]+ " "+a[k]);
                }
            }
        }
        }
    }