package Array;

public class SumAvgOf2D {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                sum=sum+a[i][j];
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }
}
