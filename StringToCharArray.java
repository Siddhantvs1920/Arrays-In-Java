package Array;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args)
    {
        String s="hefsine";
        char[] ch=s.toCharArray();
        System.out.println(Arrays.toString(ch));
        String m="Siddhant";
        char[] ch1=myMethod(m);
        System.out.println(Arrays.toString(ch1));

    }

    private static char[] myMethod(String s) {
        char[] ch=new char[s.length()];
        for (int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        return ch;
    }
}
