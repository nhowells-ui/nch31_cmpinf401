package nch31_Assignment1;

import javax.swing.JOptionPane;

public class ProblemThree {

	public static void main(String[] args) {
		String money = JOptionPane.showInputDialog("Input any amount of money between 1 and 9999 dollars: ");
		
		//convert to int
		int moneyInput = Integer.parseInt(money);
		
		
		//splits numbers up
		int grandsI = moneyInput%1000;
		int grandsF = moneyInput/1000;
		
		int benjaminsI = grandsI%100;
		int benjaminsF = grandsI/100;
		
		int sawbucksI = benjaminsI%10;
		int sawbucksF = benjaminsI/10;
		
		int bucksF = sawbucksI/1;
		
		
		
		//results
		System.out.println(grandsF + " Grands");
		System.out.println(benjaminsF + " Benjamins");
		System.out.println(sawbucksF + " Sawbucks");
		System.out.println(bucksF + " Bucks");
		
		

	}

}
