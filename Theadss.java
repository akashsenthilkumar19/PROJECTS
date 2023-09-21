
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AKASH
 */
class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   static  class B extends Thread
    {
      public static void get()
    {
        for(int i=1;i<=5;i++)
        System.out.println("Thread is stopping");
    }
}
public class Theadss 
{
    public static void main(String[] args)
    {
        
        A a=new A();
        a.start();
        B b=new B();
        b.get();
       
        
    }
    
}
