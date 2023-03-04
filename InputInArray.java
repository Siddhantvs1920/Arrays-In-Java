package Array;

public class InputInArray {
    public static void main(String[] args) {
        int[] a=new int[10];
        int count=1;
        for(int i=0;i<a.length;i++)
        {
            a[i]=count;
            count++;

        }
        System.out.println(a[8]);

    }
}
