import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
public class App {
    public static void main(String[] args) throws Exception {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                    JButton clickeButton = (JButton) e.getSource();
                    clickeButton.setText("x");
                }
            }
        };
        System.out.println("Hello, World!");
        JFrame window =new JFrame();
        window.setSize(300,300);
        window.setLayout(new BorderLayout(1,1));
        JPanel broad = new JPanel(new GridLayout(3,3,5,5));
        JButton bouttonarray[]= new JButton[9];
        Integer i=0; 
        for(i=0;i<9;i++){
            bouttonarray[i] =new JButton();
            broad.add(bouttonarray[i]);
            bouttonarray[i].addActionListener(listener);
        }
        
        
        window.getContentPane().add(broad,BorderLayout.CENTER);
        JLabel turn = new JLabel("now is x turn",SwingConstants.CENTER);
        window.getContentPane().add(turn,BorderLayout.PAGE_END);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("broad");
        window.setVisible(true);
    }
    
}
