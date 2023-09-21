class Myapp1<T>
{
 private T a;
   
   public void setValue(T a)
   {
       this.a=a;
   }
   
   public T getValue()
   {
       return a;
   }
}
  

public class Myapp 
{

 public static void main(String[] args) 
 {
    Myapp1<Integer> obj1=new Myapp1<Integer>();
        obj1.setValue(20);
        System.out.println("value is"+obj1.getValue());


        System.out.println("value is"+obj1.getValue());
        Myapp1<String> obj2=new Myapp1<String>();
        obj2.setValue("good evening");

        System.out.println("value is"+obj2.getValue());

     
     
     
     
       
 }
    
}
