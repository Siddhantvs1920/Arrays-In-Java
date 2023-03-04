package Array;

public class FindSameArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60,70,80,90,100};
        int[] b = {10, 20, 30, 40, 50, 60,70,80,90,100};

       //String sc=same(a,b);
        System.out.println(same(a,b));

    }
    private static String same(int a[], int b[])
    {
        if(a.length!=b.length)
            return "Not Same";
        for (int i=0;i<a.length;i++)
            if(a[i]!=b[i])
                return "Not Same";
        return "Same";
    }
}
