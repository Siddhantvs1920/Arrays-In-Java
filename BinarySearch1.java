package Array;
//for binary search array need sorted compalsary
public class BinarySearch1 {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55,56,77,88,99};
                int num=89;
        int start=0;
        int end=a.length-1;
        while (true)
        {
            int mid=(start+end)/2;
            if (a[mid]==num) {
                System.out.println("Found at index "+mid);
                break;
            }
            else if(num<a[mid])
                end=mid-1;
            else
                start=mid+1;

            if(start>end)
            {
                System.out.println("not found");
                break;
            }
        }
    }
}
