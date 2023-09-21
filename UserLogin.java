import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class LoginFrame implements ActionListener
{
JFrame frame;
JPanel panel;
JLabel lblName,lblPassword;
JTextField tfName;
JPasswordField tfPass;
JButton btnSubmit,btnCancel;

    public LoginFrame() {
        frame=new JFrame();
        frame.setTitle("Login Form");
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        panel=new JPanel();
        panel.setLayout(null);
        
        lblName=new JLabel("username");
        lblName.setBounds(50, 50, 100, 20);
        
        tfName=new JTextField();
        tfName.setBounds(170,50, 100, 20);
        
        lblPassword=new JLabel("Password");
        lblPassword.setBounds(50, 100, 100, 20);        
        
        tfPass=new JPasswordField();
        tfPass.setBounds(170,100, 100, 20);
        
        btnSubmit=new JButton("submit");
        btnSubmit.setBounds(50, 150, 100, 20);
        btnSubmit.addActionListener(this);
        
        btnCancel=new JButton("cancel");
        btnCancel.setBounds(170, 150, 100, 20);
        btnCancel.addActionListener(this);
        
        panel.add(lblName);
        panel.add(tfName);
        panel.add(lblPassword);
        panel.add(tfPass);
        panel.add(btnSubmit);
        panel.add(btnCancel);
        
        
        frame.add(panel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btnSubmit)
          {
              JOptionPane.showMessageDialog(panel,"login success");
          }
          else if(e.getSource()==btnCancel)
          {
                 tfName.setText("");
                 tfPass.setText("");
          }
    }
    
}
public class UserLogin {

    public static void main(String[] args) {
      LoginFrame obj=new LoginFrame();
    }
    
}
