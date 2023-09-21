class Airtel implements Sim
{
    public void msg()
    {
        System.out.println("Airtel messaging ");
    }
    public void calls()
    {
        System.out.println("Airtel calling ");
    }
    public void browse()
    {
        System.out.println("Airtel browse ");
    }

}
class Jio implements Sim
{
    public void msg()
    {
        System.out.println("Jio messaging ");
    }
    public void calls()
    {
        System.out.println("Jio calling ");
    }
    public void browse()
    {
        System.out.println("Jio browse ");
    }
}


public class Demo {

    
    public static void main(String[] args)
    {
        Sim obj=new Jio();
        obj.msg();
        obj.calls();
        obj.browse();
        
        
        
        
    }
    
}
