package Array;

public class LaderElement {
    public static void main(String[] args) {
        int[] a={11,44,4,86,8,23,22};

        for(int i=0;i<a.length;i++)
        {
            int cnt=0;

            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                    cnt++;
               break;
            }
            if(cnt==0)
                System.out.println(a[i]);
        }

    }
}
