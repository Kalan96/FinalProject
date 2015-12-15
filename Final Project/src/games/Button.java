package games;

//some code i found on stack over flow

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame{
	
	private JButton game1;
	private JButton game2;// Buttons to push numbers	
	
	public Button(){
		super("Welcome to GameBox!");// Tittle for jframe
		setLayout(new FlowLayout());
		
		game1 = new JButton("Tic Tac Toe");// First button name
		add(game1);
		
		game2 = new JButton("Appletree Chance");// Second button name
		add(game2);
		
		game1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TicTacToe.main(null);// Launches TICTACTOE
			}			
		});		
		
		game2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				AppletreeChance.main(null);// Launches Chance game
			}
		});
	}		
}
