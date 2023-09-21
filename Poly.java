class Polymo
{
    
    public void disp()
    {
        System.out.println("Method overloading is ceated");
    }
    public void disp(int age,int height)
    {
        System.out.println("Age is " +age);
        System.out.println("Height is "+height);
        
    }
    public void disp(String name,int id) 
    {
        System.out.println("Name " +name);
        System.out.println("Id "+id);
    }
    }

public class Poly 
{

    
    public static void main(String[] args) 
    {
        Polymo obj=new Polymo();
        obj.disp();
        obj.disp(23, 167);
        obj.disp("Senthil", 101);
        
        
        
        
        
            }
    
}
