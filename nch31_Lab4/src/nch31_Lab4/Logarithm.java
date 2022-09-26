package nch31_Lab4;

import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		
		String log = JOptionPane.showInputDialog("Input a number greater than 0 to be used as a logarithm: ");
		int logNum = Integer.valueOf(log);
		
		while (logNum <= 0)//bars user from inputting value less than 0
		{
			log = JOptionPane.showInputDialog("Invalid Input. Please enter a number greater than 0: ");
			logNum = Integer.valueOf(log); //stores log input as int
		}
		
		
		String base = JOptionPane.showInputDialog("Input a number greater than 1 to be used as a base: ");
		int baseNum = Integer.valueOf(base);
		
		while (baseNum <= 1)//bars user from inputting value less than 1
		{
			base = JOptionPane.showInputDialog("Invalid Input. Please enter a number greater than 1: ");
			baseNum = Integer.valueOf(base); //stores base input as int
		}
		
		int divCount = 0; //counts the number of divisions
				
		
		while (baseNum >= logNum)//loops logarithm division
		{
			int result = baseNum/logNum; //divides base by log looped
			baseNum = result;
			
			divCount++;//adds one counter each time a division occurs
						
		}
		System.out.println("It takes " + divCount + " divisions for the quotient to be less than the base.");
		System.out.println("The answer is " + divCount + ".");
	}
	
}

