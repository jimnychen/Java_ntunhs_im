import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JFrame window =new JFrame();
        window.setSize(300,300);
        window.setBounds(500,500,400,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("brod");
        window.setVisible(true);
    }
    
}
