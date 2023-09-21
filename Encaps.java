class Bank 
{
    int amt=12000;
    String name="Senthil";
    
    public void show()
    {
        System.out.println("Banking Details ");
        System.out.println("*****Indian bank****** ");
    }
    public void get()
    {
        System.out.println("Bank Details ");
        System.out.println("Id" +amt);
        System.out.println("Name " +name);
        
    }
}

public class Encaps {

     public static void main(String[] args) 
     {
         Bank obj=new Bank();
       obj.get();
       obj.show();
         
         
         
         
         
    }
    
}
