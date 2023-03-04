package Array;

public class SubArrayPractice {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55, 66, 77};
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i <= a.length - 3; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum = sum + a[j];
            }
            int avg = sum / 3;
            if (avg < min) {
                min = avg;
                index = i;
            }
        }
            System.out.println(min+" "+index);
        }

}
