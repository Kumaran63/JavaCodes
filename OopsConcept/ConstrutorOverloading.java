package OopsConcept;

public class ConstrutorOverloading {
private int a,b,c;
public ConstrutorOverloading(int x,int y)
{
	a=x;
	b=y;
}
public void add()
{
	c=a+b;
	//System.out.println("Addition is="+ c);
}
public void sub()
{
	c=a-b;
	//System.out.println("subraction is="+ c);
}
}
