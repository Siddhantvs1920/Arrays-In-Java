package Array;

public class EqualiberiumIndex {
    public static void main(String[] args) {
        int [] a={1,3,5,2,2};
        for(int i=0;i<a.length;i++)
        {
            int leftSum=0;
            for(int j=0;j<i;j++)
                leftSum+=a[j];
            int rightSum=0;
            for (int j=i+1;j<a.length;j++)
                rightSum+=a[j];
            if (leftSum==rightSum)
                System.out.println(i);

        }
    }

}
