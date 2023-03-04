package Array;

public class TriplatePairs {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55,66};

        //if array is not unik then firstly we need to make array Unik and then Perform action

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=j+1;k<a.length;k++)
                {
                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
                }
            }
        }
    }
}
