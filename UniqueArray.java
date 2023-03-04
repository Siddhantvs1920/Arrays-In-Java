package Array;

import java.util.Arrays;

public class UniqueArray
{
    public static void main(String[] args) {
        int[] a={11,22,11,55,66,44,55,33,22,66,55};
                int uniqueCount=0;
        for (int i=0;i<a.length;i++)
        {
            int count=0;
            for (int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                    count++;
            }
            if(count==0)
                uniqueCount++;
        }
        System.out.println(uniqueCount);
        int cnt=0;
        int[] b=new int[uniqueCount];
        for (int i=0;i<a.length;i++)
        {
            int count=0;
            for (int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                    count++;
            }
            if(count==0)
                b[cnt++]=a[i];

        }
        System.out.println(Arrays.toString(b));

    }
}

