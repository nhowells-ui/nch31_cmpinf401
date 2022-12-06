package nch31_Lab10;

import java.util.*;

public class Recursion {
	
	public static void main(String args[]) {
	    try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input a number: ");
			int num = input.nextInt();
			if(num < 0) {
				num = num * -1;
			}
			int s = sumOfDigits(num);
			System.out.println("Sum = "+s);
		}
	}
	
	public static int sumOfDigits(int x){
	    int sum = 0;
	    if(x == 0) {
	    	return sum;
	    }
	    else {
	    	sum = x % 10 + sumOfDigits(x/10);
	    }
	          
	    return sum;
	}
}
