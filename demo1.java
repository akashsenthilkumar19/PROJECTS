class sk
{
    sk()
    {
        System.out.println("Constructor is created");
    }
sk(int a,int b)
{
    System.out.println("the value is "+a);
    System.out.println("the B value is "+b);
    }
sk(int 1,String Name,int c)
{
    System.out.println("the a value is" +1);
    System.out.println("the b value is" +Name);
    System.out.println("the value is " +c);
}
}

public class demo1
{
public static void main(String[] args) 
{
    sk d=new sk();
    sk d5=new sk(10,20);
    sk d6=new sk(2,"sk",3);
    
    
}
}

