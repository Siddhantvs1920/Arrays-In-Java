package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55,66,77,88};
        int num=66;
        int start=0;
        int end=a.length-1;
        while (true)
        {
            int mid=(start+end)/2;
            if(a[mid]==num){
                System.out.println(mid);
            break;}
            if(num<mid)
                end=mid-1;
            else if(num>mid)
                start=mid+1;
            if(start>end){
                System.out.println("Element not found");
            break;}
        }
    }
}
