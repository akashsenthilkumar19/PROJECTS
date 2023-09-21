
import javax.swing.*;


public class RegistraionForm {

    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Registraion Form");
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        
        JButton Submit = new JButton("SUBMIT");
        JButton Clear = new JButton("CLEAR");
        Submit.setBounds(380, 520, 80, 20);
        Clear.setBounds(470, 520, 80, 20);
        f.add(Submit);
        f.add(Clear);
        
        JLabel l1 = new JLabel("STUDENT NAME    : ");
        JLabel l2 = new JLabel("DATE OF BIRTH   : ");
        JLabel l3 = new JLabel("SCHOOL NAME     : ");
        JLabel l4 = new JLabel("CLASS STUDYING  : ");
        JLabel l5 = new JLabel("FATHER NAME     : ");
        JLabel l6 = new JLabel("MOTHER NAME     : ");
        JLabel l7 = new JLabel("STUDENT NO      : ");
        JLabel l8 = new JLabel("PARENT'S NO     : ");
        JLabel l9 = new JLabel("DECLARATION     : ");
        
        
        l1.setBounds(20,20, 120, 30);
        l2.setBounds(20,70, 120, 30);
        l3.setBounds(20,120, 120, 30);
        l4.setBounds(20,170, 120, 30);
        l5.setBounds(20,220, 120, 30);
        l6.setBounds(20,270, 120, 30);
        l7.setBounds(20,320, 120, 30);
        l8.setBounds(20,370, 120, 30);
        l9.setBounds(20,420, 120, 30);
        
        
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
          
        JTextField m1 = new JTextField();
        JTextField m2 = new JTextField();
        JTextField m3 = new JTextField();
        JTextField m4 = new JTextField();
        JTextField m5 = new JTextField();
        JTextField m6 = new JTextField();
        JTextField m7 = new JTextField();
        JTextField m8 = new JTextField();
        JTextArea m9 = new JTextArea();
        
        m1.setBounds(150,20, 250, 30);
        m2.setBounds(150,70, 250, 30);
        m3.setBounds(150,120, 250, 30);
        m4.setBounds(150,170, 250, 30);
        m5.setBounds(150,220, 250, 30);
        m6.setBounds(150,270, 250, 30);
        m7.setBounds(150,320, 250, 30);
        m8.setBounds(150,370, 250, 30);
        m9.setBounds(150,420, 370, 60);
       
        
        f.add(m1);
        f.add(m2);
        f.add(m3);
        f.add(m4);
        f.add(m5);
        f.add(m6);
        f.add(m7);
        f.add(m8);
        f.add(m9);
                
        
    }
    
}
