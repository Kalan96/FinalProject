package games;

/*
 * inspiration would be I am from Washington and there are allot of apples and I was hungry
 * I got help from Subin to make sure which loop should be used
 * Tried looking for average apple count per tree and could not find one so I came up with these ones
 * 
 */


import javax.swing.JOptionPane;
import java.security.SecureRandom;

public class AppletreeChance extends Controller{
	
	public static String ft;
	public static int trees[]= {0,0,0,0,0}; // Creates array
	public static int total; // Creates integer total
	public static SecureRandom myGenerator = new SecureRandom(); // Creates random number generator
	
	public static void main(String[] args)
	{
		int apples;
		
		JOptionPane.showMessageDialog(null, "Congradulations you are a proud owner of 5 apple trees!");
		
		String ans;
		ans = JOptionPane.showInputDialog("Would you like to fertilize the trees?");
		//Takes answer and puts it in to if statement
		
		if (ans.equalsIgnoreCase("yes")){
			apples = myGenerator.nextInt(31);
			fertilize(apples); //Runs and carries apples and name to feed
		}
		else{
			apples = myGenerator.nextInt(16);
			normal(apples); //Runs and carries apples and name to normal
		}
		
	}
	
	public static void fertilize(int apples){
		for(int i = 0; i < trees.length; i++){
			trees[i] = apples;
			//Sets all trees to equal the random number in if
		}
	
		total= trees[0] + trees[1] + trees[2] + trees[3]; //Adds all trees to total
		
		JOptionPane.showMessageDialog(null, name + ", you had a great harvest and managed to get " + total + " apples!");
		//Displays name and how many apples produced in harvest
	}
	
	public static void normal(int apples){
		for(int i = 0; i < trees.length; i++){
			trees[i] = apples;
			//Sets all trees to equal the random number in else
		}
	
		total= trees[0] + trees[1] + trees[2] + trees[3]; //Adds all trees to total
		
		
		JOptionPane.showMessageDialog(null, name + ", you had a ok harvest and managed to get " + total + " apples.");
		//Displays name and how many apples produced in harvest
	}

}
