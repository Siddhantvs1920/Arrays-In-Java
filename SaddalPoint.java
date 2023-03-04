package Array;

public class SaddalPoint {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sid=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                int count=0;
                for (int k=0;k<a[i].length;k++)
                {
                    if(a[i][j]>a[i][k])
                        count++;
                }
                int cnt= 0;
                for (int k=0;k<a.length;k++)
                {
                    if(a[k][j]>a[i][j])
                        cnt++;
                }
                if(count==0 && cnt==0)
                {
                    System.out.println(a[i][j]);
                    sid++;
                }
            }
        }
        if(sid==0)
            System.out.println("Not Found");
    }
}
