package Array;

public class RemoveFirstFromSecondPractice {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,12,2,1,3,4,1,8};
        int[] b={1,2,3,4,5};
        for (int i=0;i<b.length;i++)
        {
            int count=0;
            for(int j=0;j<a.length;j++) {
                if (b[i] == a[j])
                    count++;
                if (count >= 2)
                    break;
            }
            int[] c=giveMeModifiedArray(a,count,b[i]);
            a=c;
        }
        for (int data:a)
            System.out.print(data+" ");

    }

    private static int[] giveMeModifiedArray(int[] a, int count,int num){
        int[] c=new int[a.length-count];
        int index=0;
        int cnt=0;
        for (int j=0;j<a.length;j++)
        {
            if(num==a[j]&&cnt<2)
                cnt++;
            else
                c[index++]=a[j];
        }
        return c;
    }
}
