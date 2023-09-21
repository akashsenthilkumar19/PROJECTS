class Animal6
{
void eat5()
{
    System.out.println("eating....");
    
}
}
class Dog7 extends Animal6
{
    void bark()
    {
        System.out.println("barking..");
    }
    }
class cat3 extends Animal6
{
    void meow()
    {
        System.out.println("meowig...");
    }
    class testinheritance3
    {
public static void main(String[] args) 
{
  cat3 c=new cat3();
        c.meow();
        c.eat5();
    }
    
}
}
