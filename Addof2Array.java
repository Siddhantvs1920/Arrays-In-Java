package Array;

public class Addof2Array {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3,1},
                {4,5,6,4},
                {7,8,9,7},
                {1,9,8,2}
        };
        int[][] b={
                {1,2,1,2},
                {1,2,1,2},
                {1,2,1,2},
                {1,2,3,4}
        };
        int sum=0;
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
