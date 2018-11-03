package Variable;

public class IfCalc {

	public void CheckBig(float a,int b,int c) {
		if(a>b && a>c)
		{
			System.out.println("A is bigger");
		}else if(b>c) {
			System.out.println("B is Bigger");
		} else {
			System.out.println("C is bigger");
		}
	}
}
