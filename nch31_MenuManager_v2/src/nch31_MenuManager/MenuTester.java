package nch31_MenuManager;

import java.util.ArrayList;

/**
 * Class MenuTester
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class MenuTester {

	public static void main(String[] args) {
		
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt", "data/sides.txt","data/salads.txt","data/desserts.txt");
			Menu myMenu = randomize.randomMenu();
			System.out.println(myMenu.name() + myMenu.description()+"\nTotal calories: "+ myMenu.totalCalories());
	}
}
