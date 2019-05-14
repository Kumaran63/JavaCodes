package OopsConcept;

class parameter{
    public void method(int age, String name)
    {
        System.out.println(" the name is "+name+" and the age is "+age);
    }
    public void method(){
        System.out.println("No parameter");
    }
    public void method(String name, int age){
        System.out.println("the age is "+age+" and the name is "+name);
    }
public void method(int age){
    System.out.println(" the age is printing");
}
/*public void method(int salary){
    System.out.println(" salary is printing");
}*/ //this can't happen since a parameter with int is decalared
}
public class Method_Parameter
{
	public static void main(String[] args) {
		parameter p = new parameter();
		p.method();
		p.method(34,"Kumaran");
		p.method("Kumaran",54);
		p.method(34);
	}
}


