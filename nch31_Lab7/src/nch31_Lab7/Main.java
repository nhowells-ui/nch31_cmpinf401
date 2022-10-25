package nch31_Lab7;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//gets user input and converts to integer
		String input = JOptionPane.showInputDialog("Please input the number of items to be stored: ");
		int inputNum = Integer.parseInt(input);
		
		
		//creates array from user input
		double[] inputArray = new double[inputNum];
		
		
		//creates random class
		Random randNums = new Random();
		
		
		//fills array with random numbers
		for (int i = 0; i < inputNum; i++) {
			inputArray[i] = randNums.nextInt(100);
		}
		System.out.println(Arrays.toString(inputArray)); //prints entire array
		System.out.println("Maximum: " + max(inputArray));
		System.out.println("Minimum: " + min(inputArray));
		System.out.println("Sum: " + sum(inputArray));
		System.out.println("Average: " + ave(inputArray));
	}
	
	
	//array maximum method
	public static double max(double[] inputArray) {
		int i;
		
		double max = inputArray[0];
		
		for(i = 1; i < inputArray.length; i++) {
			if(inputArray[i] > max)
				max = inputArray[i];
		}
		return max;
	}
	
	
	//array minimum method
	public static double min(double[] inputArray) {
		int i;
		
		double min = inputArray[0];
		
		for(i = 1; i < inputArray.length; i++) {
			if(inputArray[i] < min)
				min = inputArray[i];
		}
		return min;
	}
	
	
	//array sum method
	public static double sum(double[] inputArray) {
		int i;
		double sum = 0;
		
		for(i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
		}
		return sum;
	}
	
	
	//array average method
	public static double ave(double[] inputArray) {
		int i;
		double ave = 0;
		double sum = 0;
		
		for(i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
			ave = sum / inputArray.length;
		}
		return ave;
	}
}
