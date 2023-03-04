package Array;

public class ArrayFindEle {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,40,70};
        int ele=40;
        boolean f=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                f=true;
            }
        }
        if(!f)
        System.out.println("Not found");
        else
            System.out.println("Found");

    }
}
