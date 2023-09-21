class Animal3
{
    int legs=4;
    public void Eat()
    {
        System.out.println("Animals are eating");
    }
    public void walk1 ()
    {
        System.out.println("Animals  is walking");
        System.out.println("LEgs are"+legs);
    }
    }
class Dog3 extends Animal3
{
    int legs=3;
    public void Eat()
    {
        System.out.println("Dogs are eating ");
    }
    }

public class Sample {

       public static void main(String[] args)
       {
           Dog3 obj=new Dog3();
           obj.Eat();
           obj.walk1();
           
           
           
           
          }
    
}
