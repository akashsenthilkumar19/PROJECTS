import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class KeyDemo extends KeyAdapter {

    JFrame frame;
    JPanel panel;
    JLabel lblName, lblPassword;
    JTextField tfName;

    public KeyDemo() {
        frame = new JFrame();
        frame.setTitle("My Form");
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);

        lblName = new JLabel("Student Name");
        lblName.setBounds(50, 50, 100, 20);

        tfName = new JTextField();
        tfName.setBounds(170, 50, 100, 20);
        tfName.addKeyListener(this);
        
        
        panel.add(lblName);
        panel.add(tfName);
        frame.add(panel);
    }



    @Override
    public void keyReleased(KeyEvent e) {
         tfName.setText(tfName.getText().toUpperCase());
    }

}

public class KeyboardDemo1 {
    public static void main(String[] args) {
        KeyDemo obj=new KeyDemo();
    }
}
