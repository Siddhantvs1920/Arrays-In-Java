package Array;

import java.util.Arrays;

public class UnikEleArrySize{
    public static void main(String[] args) {
        int[] a={11,22,11,55,44,33,66,88,55,22,55,44,66,88,88};
        int uniqueCount=0;
        int[] b=new int[uniqueCount];

        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    //break;
                }
            }
            if(count==0)
            uniqueCount++;
        }


        System.out.println("size of unique element : "+uniqueCount);


    }
}
