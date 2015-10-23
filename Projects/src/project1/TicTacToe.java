//First game to pop up in my head
//Help from stack over flow and Youtube mainly from NVTHD and Cross Coast Gaming
package project1;

import java.util.Scanner;//Imports Scanner

import javax.swing.JOptionPane;//Imports JOptionPane

public class TicTacToe {//Name
	public static int row, col;// Creates row and column
	public static Scanner scan = new Scanner(System.in);// Creates Scanner
	public static char [][] board = new char[3][3];// Board grid
	public static char turn = 'x';// Starting turn character so must be single quotes
	public static boolean playAgain = true;// To Play again if wanted
	
	public static void main(String[] args){
		int credit = 0;
		String again;
		do{
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++) {
					board[i][j] = '_';
				}
			}
			
			Play();
			
			again = JOptionPane.showInputDialog("Play again?");// Asking if they want to play again
			if(again.equalsIgnoreCase("Yes")){
				playAgain = true;
			}else{
				playAgain = false;// Closes if they don't want to play again
			}
			if(credit < 3){
				credit ++;
			}else{
				System.exit(0);
			}
		}while(playAgain);
	}

	public static void Play() { //Method creates game structure
		boolean playing = true;
		boolean userInputCheck = true;
		PrintBoard();
		while (playing){
			do{
				System.out.println("Please enter a row and column: ");
				row = scan.nextInt() - 1;// See where to put character - 1 since java starts at 0
				col = scan.nextInt() - 1;
				if(row >= 0 && row <= 2 && col >= 0 && col <= 2){
					userInputCheck=false;
				} else{
					userInputCheck=true;// Checks for accurate number
					System.out.println("Make sure to enter a valid number!");
				}
			}while(userInputCheck);
			board[row][col] = turn;
			if (GameOver(row, col)){
				playing = false;// Checks to see if there is a winner
				System.out.println("Game over! Player " + turn + " wins!");
			}
			
			PrintBoard();// Turn changing or deciding
			if(turn == 'x')
				turn = '0';
			else
				turn = 'x';
		}
	}
	
	public static void PrintBoard(){ //Method creates board layout
		for (int i = 0; i < 3; i++){
			System.out.println();
			for (int j = 0; j < 3; j++){
				if (j == 0)
					System.out.print("| ");
				System.out.print(board[i][j] + " | ");
			}
		}
		System.out.println();// Creates board
	}
	
	public static boolean GameOver(int rMove, int cMove){ // Last method and creates int row move and column move
		// Check perpendicular victory					// Boolean makes sure it returns to the main method making it not a void
		if (board [0][cMove] == board[1][cMove]
				&& board[0][cMove] == board[2][cMove])
			return true;
		// Check parallel victory
		if (board[rMove][0] == board[rMove][1]
				&& board[rMove][0] == board[rMove][2])
			return true;
		// Check diagonal victory
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
				&& board[1][1] != '_')
			return true;
		if (board[0][2] == board[1][1] && board[0][2] == board[2][0]
				&& board[1][1] !='_')
			return true;
		return false;		
	}
}
