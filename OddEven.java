package Array;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[] a={22,23,88,45,16,89,45,19,76};
        int evenSize=0;
        int oddSize=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        int[] evenNo=new int[evenSize];
        int[] oddNo=new int[oddSize];
        int count=0;
        int cnt=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                evenNo[count++]=a[i];
            else
                oddNo[cnt++]=a[i];
        }
        System.out.println("Even No Array : "+Arrays.toString(evenNo));
        System.out.println("Odd No Array : "+Arrays.toString(oddNo));

    }
}
