import java.awt.Font;
import java.io.File;
import java.io.IOException;
        



public class Files 
{
    public static void main(String[] args) 
    {
        try
        {
         Files f0 = new Files("D : sk1.txt");
         if(f0.createnewfiles())
         {
             System.out.println("file"+f0.getName()+"is created");
         }
             
             
        }
    }
    
}
