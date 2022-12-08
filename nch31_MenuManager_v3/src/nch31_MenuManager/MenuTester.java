package nch31_MenuManager;

/**
 * Class MenuTester
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class MenuTester {

	public static void main(String[] args) {
		
		MenuManager m = new MenuManager("data/dishes.txt");
		Menu rm = m.randomMenu("Menu 1");
		
		System.out.println(rm.getEntree().getDescription());
		System.out.println(rm.getSide().getDescription());
		System.out.println(rm.getSalad().getDescription());
		System.out.println(rm.getDessert().getDescription());
		
		
	}
}
