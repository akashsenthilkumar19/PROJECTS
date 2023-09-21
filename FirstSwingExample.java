import javax.swing.*;  
public class FirstSwingExample {

    public static void main(String[] args)
    {
     /*  JFrame f=new JFrame("My Frame");  
       JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
//creating instance of JFrame                
          
f.setSize(400, 500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible */
        JFrame f= new JFrame("Label Example");  
    JLabel l1,l2;  
    l1=new JLabel("First Name. ");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("Last Name. ");  
    l2.setBounds(50,100, 100,30);  
    f.add(l1); f.add(l2);  
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    
}  
 
        
        
        
        
    }
    
