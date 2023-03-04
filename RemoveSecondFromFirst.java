package Array;

import java.util.Arrays;

public class RemoveSecondFromFirst {
    public static void main(String[] args) {
        int[] a={1,1,1,1,1,2,2,3,4};
        int[] b={1,2,4};
        for (int i=0;i<b.length;i++)
        {
            int count1=0;
            for(int j=0;j<a.length;j++)
            {
                if(b[i]==a[j])
                    count1++;
                if(count1>=2)
                  break;

            }
            int[] c=new int[a.length-count1];
            int index=0;
            int count2=0;
            for (int j=0;j<a.length;j++)
            {
                if(b[i]==a[j]&&count2<2)
                    count2++;
                else
                    c[index++]=a[j];
            }
            a=c;

        }
        System.out.println(Arrays.toString(a));

    }
}
