package OopsConcept;

public class ConstrutorOverloading2 {
	double width,height,depth;
	public ConstrutorOverloading2() //Constructor created for the class
	{
		width = 10;
		height = 5;
		depth = 15;
	}
	public ConstrutorOverloading2(double value) // another constructor with different parameters this shows that any number of constructor.
	{
		width=height=depth=value;
	}
	public double volume()
	{
		return width*height*depth;
	}

}
