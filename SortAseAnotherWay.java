package Array;

import java.util.Arrays;

public class SortAseAnotherWay {
    public static void main(String[] args) {
        int[] a={4,1,2,8,7,6,5,2,3};
        for(int i=0;i<a.length;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++) {
                if (a[i] < a[min]) {
                   min=j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
