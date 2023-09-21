
class Outer
{
    private int id=30;
    private String name="Anu";
    
    public void show()
    {
        System.out.println("Outer class can be created ");
    }
    class Inner
    {
        public void disp()
        {
            System.out.println("Id" +id);
            System.out.println("Name" +name);
        }
    }
}
public class OuterInn {

    public static void main(String[] args)
    {
        Outer obj=new Outer();
        obj.show();
       Outer.Inner in=obj.new Inner();
       in.disp();
        

    }
    
}
