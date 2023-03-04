package Array;

public class SortingOfArrayObject
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1, "somu", 41);
        Student s2 = new Student(2, "gomu", 52);
        Student s3 = new Student(3, "comu", 85);
        Student s4 = new Student(4, "momu", 56);
        Student[] s = {s1, s2, s3, s4};
        for (int i = 0; i < s.length; i++)
        {
            for (int j = i + 1; j < s.length; j++)
            {
                if (s[i].marks > s[j].marks)
                {;
                    Student temp=s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }


}
