package Array;

public class FindElementUsingMethod {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 40, 70};
        int ele = 40;
        if (contain(a,ele) == 0)
            System.out.println("Not found");
        else
            System.out.println("Found");
    }
    private static int contain(int[] a, int ele)
        {
            int count=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==ele)
                    count++;
            }
            return count;
        }



}
