
import java.util.Scanner;


public class Exceptions {

    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int a,b;
        System.out.println("Enter the a and b value ");
        a=in.nextInt();
        b=in.nextInt();
        try
        {
        int c=a/b;
        System.out.println("The value is " +c);
        }
        catch(ArithmeticException ea)
        {
            System.err.println("exception is occurs " +ea);
            
        }
        
        finally
        {
        System.out.println("Done");
        }
        System.out.println("Successfully done");
        
        
        
        
          }
    
}
