package Array;

import java.util.Arrays;

public class UnikPairs {
    public static void main(String[] args) {
        int[] a={1,2,3,1,2};
        //finding unik array start
        int uniklength=0;
        for (int i=0;i<a.length;i++)
        {
            int cnt=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                cnt++;
            }
            if(cnt==0)
                uniklength++;
        }
        System.out.println(uniklength);
        int[] unikArray=new int[uniklength];
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            int cnt=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                    cnt++;
            }
            if(cnt==0)
                unikArray[count++]=a[i];
        }
        System.out.println(Arrays.toString(unikArray));
        //finding unique array end
        for (int i=0;i<unikArray.length;i++)
        {
            for (int j=0;j<unikArray.length;j++)
                System.out.println(a[i]+" "+a[j]);
        }


    }

}
