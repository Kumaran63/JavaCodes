package OopsConcept;

class a
{
  int age;
  String name;
  void method()
  {
    System.out.println ("the age is " + age);
  }
  int calcAgeOfret()
  {
    int retAge = 65 - age;
    return retAge;
  }
  int getAge()
  {
    return age;
  }
  String getName()
  {
    return name;
  }
}


public class Getter
{
  public static void main (String[]args)
  {
    a s = new a();
      s.age = 23;
      s.name = "MSD";

    int ages = s.calcAgeOfret();
      System.out.println ("the ret age is " + ages);

    int age = s.getAge();
String name = s.getName();
      System.out.println ("the name is " + name);
      System.out.println (" the age is " + age);
  }
}

