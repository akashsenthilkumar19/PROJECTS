class Animal
{
    int legs=4;
    public void Eat()
    {
        System.out.println("Animals are eating ");
    }
    public void walk()
    {
        System.out.println("Animals are walking"); 
        System.out.println("Legs are " +legs);
    }
}
class Dog extends Animal
{
    public void wow()
    {
        System.out.println("wow wow ");
    }
}
    
public class Methods 
{
    public static void main(String[] args) 
    {  
        Dog obj=new Dog();
        obj.wow();
        obj.walk();
        obj.Eat();
        

       

    }
}
    

