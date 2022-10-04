package nch31_Lab5;

import java.util.*;

public class RollDice {
			
		//counts number of rolls
		public int rollCount = 0;
		
			Random ran = new Random();
			public int nxt = ran.nextInt(1, 7);
			int nxt2 = ran.nextInt(1, 7);		
		
		public int getRollCount() {
			return rollCount;
		}

		
	}

