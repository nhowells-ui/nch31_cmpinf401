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
		

		
		//loop to simulate dice rolls
		for (int i = 1; i < tests; i++){
			int result = r.nxt();
			int result2 = r.nxt2();
			
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
			else if (result + result2 == 9) {
				count9 ++;
			}	
			else if (result + result2 == 10) {
				count10 ++;
			}	
			else if (result + result2 == 11) {
				count11 ++;
			}	
			else if (result + result2 == 12) {
				count12 ++;
			}

			System.out.println("Roll " + i + ": " + (result + result2));
	
		System.out.println(count2 + "/" + tests);
		System.out.println(count3 + "/" + tests);
		System.out.println(count4 + "/" + tests);
		System.out.println(count5 + "/" + tests);
		System.out.println(count6 + "/" + tests);
		System.out.println(count7 + "/" + tests);
		System.out.println(count8 + "/" + tests);
		System.out.println(count9 + "/" + tests);
		System.out.println(count10 + "/" + tests);
		System.out.println(count11 + "/" + tests);
		System.out.println(count12 + "/" + tests);			
		
		}

	}
		
}