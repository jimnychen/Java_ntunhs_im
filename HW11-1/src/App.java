import javax.swing.*;
import java.awt.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JFrame window =new JFrame();
        window.setSize(300,300);
        window.setLayout(new BorderLayout(1,1));
        JPanel broad = new JPanel(new GridLayout(3,3,5,5));
        for(Integer i=0;i<9;i++){
           broad.add(new JButton());
        }
        window.getContentPane().add(broad,BorderLayout.CENTER);
        JLabel turn = new JLabel("now is x turn",SwingConstants.CENTER);
        window.getContentPane().add(turn,BorderLayout.PAGE_END);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("broad");
        window.setVisible(true);
       
        
    }
    
}
