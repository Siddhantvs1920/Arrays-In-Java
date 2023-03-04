package Array;

public class MaxNoMinNo
{
    public static void main(String[] args)
    {
        int[] a={1,20,10,400,50,80,7,3};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if (a[i] > max)
                max = a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Max no of array :"+max);
        System.out.println("Min no of array : "+min);
    }
}
