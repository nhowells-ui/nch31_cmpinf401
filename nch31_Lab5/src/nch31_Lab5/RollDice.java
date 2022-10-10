package nch31_Lab5;

import java.util.*;

public class RollDice {
			
		//counts number of rolls
		public int rollCount = 0;
		Random ran = new Random();		
		
		public int getRollCount() {
			return rollCount;
		}
		public int nxt() {
			return ran.nextInt(7) + 1;
		}
		public int nxt2() {
			return ran.nextInt(7) + 1;		
		}
		
	}

