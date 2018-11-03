package Variable;

public class Student {
	public int StdAge;
	public int StdId;
	public void study()
	{
		System.out.println("Student Id:"+StdId+" StudentAge:"+StdAge);
	}
public static void main(String[] Args)
{
Student s1 =new Student();
s1.StdAge=24;
//s1.StdAge=34; the last value would be taken as an input
s1.StdId=9746;
s1.study();
Student s2= new Student();
s2.StdAge=23;
s2.StdId=4545;
s2.study();
}
}