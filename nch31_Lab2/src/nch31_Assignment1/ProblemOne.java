package nch31_Assignment1;

import javax.swing.JOptionPane;

public class ProblemOne {
	public static void main(String[] args) {
		String userInput1 = JOptionPane.showInputDialog("Please enter a number for the length of side A: ");
		String userInput2 = JOptionPane.showInputDialog("Please enter a number for the length of side B: ");
		
		//converting string to integer
		int userInput1num = Integer.valueOf(userInput1);
		int userInput2num = Integer.valueOf(userInput2);
		
		//side A and B square roots
		double sideASqrd = Math.pow(userInput1num, 2);
		double sideBSqrd = Math.pow(userInput2num, 2);

		//hypotenuse calculation
		double sidesSum = (sideASqrd + sideBSqrd);
		double hypotenuse = Math.sqrt(sidesSum); 
		
		//results window
		JOptionPane.showInputDialog("The hypotenuse is: ", hypotenuse);

		
		
		

		
		
		

	}

}
