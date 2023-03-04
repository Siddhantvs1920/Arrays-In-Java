package Array;

public class SumOfOuterElement {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3,1},
                {4,5,6,4},
                {7,8,9,7},
                {1,9,8,2}
        };
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==0||i==3||j==0||j==3)
                {
                    sum = sum + a[i][j];
                    count++;
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }
}
