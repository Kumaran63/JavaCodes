package OopsConcept;

class sub
{

  int age;
  String name = "bob";
  void method ()
  {

    System.out.println ("I am :" + name + " " + "My age is :" + age);
  }

}
public class Method
{
  public static void main (String[]args)
  {
    sub s = new sub ();
      s.age = 23;
    //s.name= "kumaran";
      s.method ();
    sub s1 = new sub ();
      s1.age = 35;
    //s1.name = "MSD";
    //      System.out.println(s1.method(););
      s1.method ();

    //      s.afa = 24;
      System.out.println (s.name);

  }
}

