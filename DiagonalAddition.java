package Array;

public class DiagonalAddition {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3,4},
                {4,5,6,7},
                {7,8,9,0},
                {8,5,1,3}
        };
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                if(i+j==a.length-1||j-i==0)
                    sum=sum+a[i][j];
        }
        System.out.println(sum);

    }
}
