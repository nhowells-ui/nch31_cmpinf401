package nch31_Assignment1;

import javax.swing.JOptionPane;

public class ProblemTwo {

	private static final double PI = 3.14;

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Input the radius of the circle: ");
		
		//convert string to double
		double radius = Double.parseDouble(userInput);
		
		//calculation
		double perimeter = (2 * PI * radius);
		double area = (PI * radius * radius);
		
		//results
		System.out.println("A circle with a radius of "  + radius + " has an area of " + area + " and a perimeter of " + perimeter);
		//JOptionPane.showInputDialog("A circle with a radius of "  + radius + " has an area of " + area + " and a perimeter of " + perimeter);
		
		
	}

}
