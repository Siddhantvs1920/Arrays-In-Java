package Array;

import java.util.Arrays;

public class ThirdArray {
    public static void main(String[] args) {
        char[] c={'a','b','c','d'};
        char[] c1={'p','q','r','s','t'};
        char[] c3=new char[c.length+ c1.length];
        int count=0;
        for(int i=0;i<c.length||i<c1.length;i++)
        {
            if(i<c.length)
                c3[count++]=c[i];
             if(i<c1.length)
                 c3[count++]=c1[i];

        }
        System.out.println(Arrays.toString(c3));
    }
}
