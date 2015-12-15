package games;

//main idea of this type of program came from Cole with how to get to the games

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller{
	
	protected static String name;
	
	public void setName(String name){
		Controller.name = name;
	}								//Get & Set methods to bring name to other classes
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args){
		
		name = JOptionPane.showInputDialog("What is your Name?"); //Asks for name
		JOptionPane.showMessageDialog(null, "That is a cheesy name!");
		
		try{
			
			String content = name;
			
			File file = new File("C:/users/Kalan Knott/workspace/Final Project/LastToPlay.txt");
			
			if(!file.exists()){
				file.createNewFile();//Stores name in text file
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		Button go = new Button();// launches JButton
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setLocation(750, 500);
		go.setSize(450,200);
		go.setVisible(true);
	}
}
