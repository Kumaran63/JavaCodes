package Variable;

public class WhileLoop {
public void display()
{
	int count=0;
	char str = 'y';
	while(str == 'y')
	{
		System.out.println("Whlie Loop Works");
		count++;
		if(count==5) {
			break;
		}
		
	}
}
}
