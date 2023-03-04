package Array;

public class MAxIn2DA {
    public static void main(String[] args) {
        int[][] a={
                {18,2,3},
                {44,5,60},
                {7,8,9}
        };
        int max=a[0][0];
        int min=a[0][0];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>max)
                    max=a[i][j];
                if(a[i][j]<min)
                    min=a[i][j];
            }
        }
        System.out.println("max element in the array : "+max);
        System.out.println("min element in the array : "+min);
    }
}
