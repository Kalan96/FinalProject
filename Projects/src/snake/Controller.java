package snake;

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Controller extends JFrame {

	private static final long serialVersionUID = 1L;


	public Controller() {

        add(new Snake());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new Controller();
                ex.setVisible(true);                
            }
        });
    }
}
