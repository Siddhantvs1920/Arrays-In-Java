package Array;

public class SecondLargest {
    public static void main(String[] args)
    {
        int[] a={390,-1,70,400,50,90,7,3};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Max no of array :"+max);
        int max2=a[0];
        for(int i=0;i<a.length;i++)
        {
            if (a[i]!=max&&a[i] >max2)
                max2= a[i];
        }
        System.out.println(max2);


    }
}
