package exercise4;

/*
 * inspiration would be I am from Washington and there are allot of apples and I was hungry
 * I got help from Subin to make sure which loop should be used
 * Tried looking for average apple count per tree and could not find one so I came up with these ones
 * 
 */


import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class Appletrees {

	public static int trees[]= {0,0,0,0,0}; // Creates array
	public static int total; // Creates int total
	public static SecureRandom myGenerator = new SecureRandom(); // Creates random number generator
	
	public static void main(String[] args) throws Exception
	{
		int apples;
		
		FileReader file = new FileReader("C:/users/Kalan Knott/Desktop/readme.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();
		while (line != null){
			text += line;
			line = reader.readLine();
		}
		
		reader.close();
		System.out.println(text);
		
		File newfile = new File("C:/Users/Kalan Knott/Desktop/newFile.txt");
		if (newfile.exists())
			System.out.println("The file already exists!");
		else
		{
			try
			{
				newfile.createNewFile();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			try
			{
			FileWriter fileW = new FileWriter(newfile);
			BufferedWriter buffW = new BufferedWriter(fileW);
			buffW.write("This is how it writes in to text file!");
			buffW.close();
			System.out.println("Check newFile!");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		String name; //Name prompt
		name = JOptionPane.showInputDialog("Howdy farmer! You got a name?");
		
		JOptionPane.showMessageDialog(null, "Congradulations you are a proud owner of 5 apple trees!");
		
		String ans;
		ans = JOptionPane.showInputDialog("Would you like to fertilize the trees?");
		//Takes answer and puts it in to if statement
		
		if (ans.equalsIgnoreCase("yes")){
			apples = myGenerator.nextInt(31);
			feed(apples, name); //Runs and carries apples and name to feed
		}
		else{
			apples = myGenerator.nextInt(16);
			normal(apples, name); //Runs and carries apples and name to normal
		}
		
	}
	
	public static void feed(int apples, String name){
		for(int i = 0; i < trees.length; i++){
			trees[i] = apples;
			//Sets all trees to equal the random number in if
		}
	
		total= trees[0] + trees[1] + trees[2] + trees[3]; //Adds all trees to total
		
		JOptionPane.showMessageDialog(null, name + ", you had a great harvest and managed to get " + total + " apples!");
		//Displays name and how many apples produced in harvest
	}
	
	public static void normal(int apples, String name){
		for(int i = 0; i < trees.length; i++){
			trees[i] = apples;
			//Sets all trees to equal the random number in else
		}
	
		total= trees[0] + trees[1] + trees[2] + trees[3]; //Adds all trees to total
		
		JOptionPane.showMessageDialog(null, name + ", you had a ok harvest and managed to get " + total + " apples.");
		//Displays name and how many apples produced in harvest
	}

}
