package Array;

public class ArrayOfQueue {
    public static void main(String[] args) {


        Queue p = new Queue();
        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);
        int num = p.pop();
        System.out.println(num);
        num = p.pop();
        System.out.println(num);
    }

}
