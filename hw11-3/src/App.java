import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App {
    public static void main(String[] args) throws Exception {
        JButton bouttonarray[]= new JButton[9];
        TicTacToeGame game = new TicTacToeGame();
        JLabel turn = new JLabel("now is "+game.getCurrentPlayer()+" turn",SwingConstants.CENTER);
        JFrame window =new JFrame();
        window.setSize(300,300);
        window.setLayout(new BorderLayout(1,1));
        JPanel broad = new JPanel(new GridLayout(3,3,5,5)); 
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                    JButton clickeButton = (JButton) e.getSource();
                    clickeButton.setText(String.valueOf(game.getCurrentPlayer()));
                    
                    int index =-1;
                    for(Integer i=0;i<bouttonarray.length;i++){
                        if(clickeButton.equals(bouttonarray[i])){
                            index = i;
                            continue;
                        }
                    }
                    Integer row = index/3;
                    Integer col =index%3;
                    game.makeMove(row, col);
                    game.printBoard(game.getGameBoard());
                    if (game.hasWinner()) {
                        turn.setText("Player " + game.getCurrentPlayer() + " wins!");
                        System.out.println("Player " + game.getCurrentPlayer() + " wins!");
                    } else if (game.isBoardFull()) {
                        turn.setText("It's a tie!");
                        System.out.println("It's a tie!");
                    } else {
                        turn.setText("now is "+game.getCurrentPlayer()+" turn");
                        game.switchPlayer();
                        
                    }
                    
                }
            }
        };
        for(Integer i=0;i<9;i++){
            bouttonarray[i] =new JButton();
            broad.add(bouttonarray[i]);
            bouttonarray[i].addActionListener(listener);
        }
        
        
        window.getContentPane().add(broad,BorderLayout.CENTER);
        window.getContentPane().add(turn,BorderLayout.PAGE_END);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("broad");
        window.setVisible(true);
        boolean gameEnded = false;
        while(!gameEnded){

        }
    }
    
}