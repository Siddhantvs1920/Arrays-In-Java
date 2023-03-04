package Array;

public class SuddlePointPractice {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {8,5,6},
                {7,8,9}
        };
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                int count=0;
                for (int k=0;k<a.length;k++)
                {
                    if(a[i][j]>a[i][k])
                        count++;
                }
                int cnt=0;
                for (int k=0;k<a.length;k++)
                {
                    if(a[i][j]<a[k][j])
                        cnt++;
                }
                if(count==0&&cnt==0)
                {
                    System.out.println(a[i][j]);
                    flag=true;
                }
            }
        }
        if(!flag)
            System.out.println("not suddle point");
    }
}
