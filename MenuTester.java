package nch31_MenuManager;

/**
 * Class MenuTester
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class MenuTester {

	public static void main(String[] args) {
		
		Entree e = new Entree("", "Sirloin Steak. A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked. ", 330);
		Entree e2 = new Entree("", "Spaghetti and Meatballs. Spaghetti pasta with rich tomato sauce and meatballs.", 340);
		Side si = new Side("", "Breaksticks. Italian breadsticks coated in garlic butter.", 240);
		Salad sa2 = new Salad("", "Greek Salad. Pieces of tomatoes, cucumbers, onion, feta cheese, and olives and dressed with salt, Greek oregano, and olive oil.", 270);
		Salad sa = new Salad("", "Caesar Salad. Romain lettuce with parmesan cheese, and croutons, covered in caesar dressing.", 290);
		Dessert d = new Dessert("", "Hot Fudge Sundae. Vanilla ice cream with hot fudge, sprinkles, and a maraschino cherry on top.", 250);

		Menu m = new Menu("Big Al's Steak House", e, sa);
		Menu m2 = new Menu("Fabrizio's Italian Cuisine", e2, si, sa2, d);

		m.totalCalories();
		m.description();
		
		System.out.println(m.name);
		System.out.println(m.description());
		System.out.println("Calories: " + m.totalCalories());
		System.out.println("\n");
		System.out.println(m2.name);
		System.out.println(m2.description());
		System.out.println("Calories: " + m2.totalCalories());
		
		


	}

}
