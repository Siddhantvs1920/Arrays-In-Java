package Array;

public class Queue {
    private int[] a=new int[5];
    private int index=0;
    public int pop()
    {
        if(index==0)
        {
            System.out.println("Queue is empty");
            return 0;
        }
        else
        {
            int temp=a[0];
            for(int i=0;i<index-1;i++)
                a[i]=a[i+1];
            index--;
            return temp;
        }
    }
    public void push(int num)
    {
        if(index<a.length)
        {
            a[index]=num;
            index++;
        }
        else {
            System.out.println("Queue is full");
        }
    }
}
