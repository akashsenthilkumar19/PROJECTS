class Animal3
{
    int legs=4;
    public void Eat1()
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
    public void Wow1()
    {
        System.out.println("WOw Wow");
    }
    }
public class methods1
{

    public Static void main(String[]args)
    {
        Dog3 Obj=new Dog3();
        Obj.Wow1();
        Obj.walk1();
        Obj.Eat1();
        
    }
}
