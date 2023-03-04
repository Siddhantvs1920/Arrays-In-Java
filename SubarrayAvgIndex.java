package Array;

public class SubarrayAvgIndex {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60,70};
        int k=3;
        int index=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=a.length-k;i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + a[j];
            }
            if (sum < min) {
                min = sum;
                index = i;
            }
        }
            System.out.println(index);
            System.out.println( min);
            System.out.println(min/k);

    }
}
