package nch31_Lab5;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {		
		
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		int count11 = 0;
		int count12 = 0;
		
		RollDice r = new RollDice();
		
		//receives user input for number of tests to run
		String userInput = JOptionPane.showInputDialog("Input the number of tests you want to run: ");
		int tests = Integer.valueOf(userInput);
		

		
		//loop to simulate 100 dice rolls
		for (int i = 0; i < tests; i++){
			int result = r.nxt;
			int result2 = r.nxt2;
			
			if (result + result2 == 2) {
					count2 ++;
				}
			else if (result + result2 == 3) {
					count3 ++;
				}
			else if (result + result2 == 4) {
					count4 ++;
				}
			else if (result + result2 == 5) {
					count5 ++;
				}
			else if (result + result2 == 6) {
					count6 ++;
				}
			else if (result + result2 == 7) {
					count7 ++;
				}
			else if (result + result2 == 8) {
					count8 ++;
				}	
		System.out.println(result + result2);

			
			
		}

	}
		
}