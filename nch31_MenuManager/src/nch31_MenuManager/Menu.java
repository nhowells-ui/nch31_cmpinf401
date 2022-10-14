package nch31_MenuManager;

/**
 * Class Menu
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class Menu {
	
	String name;
	Entree entree;
	Side side;
	Salad salad;
	Dessert dessert;
	
	public Menu(String name) {
		this.name = name;
		entree = null;
		side = null;
		salad = null;
		dessert = null;
	}
	
	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.entree = entree;
		side = null;
		this.salad = salad;
		dessert = null;
	}
	
	public  Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;
	}
	public  Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
	//total calories addition
	public int totalCalories() {
		int caloriesSum = 0;
		if (entree != null) {
			caloriesSum += entree.getCalories();
		}
		if (side != null) {
			caloriesSum += side.getCalories();
		}
		if (salad != null) {
			caloriesSum += salad.getCalories();
		}
		if (dessert != null) {
			caloriesSum += dessert.getCalories();
		}
	return caloriesSum;
	}

	//returns item descriptions
	public String description() {
		String totalDescription = "";
		if (entree != null) {
			totalDescription += "Entree: " + entree.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "Entree: N/A";	
			totalDescription += '\n';
		}
		if (side != null) {
			totalDescription += "Side: " + side.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "Side: N/A";	
			totalDescription += '\n';
		}
		if (salad != null) {
			totalDescription += "Salad: " + salad.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "Salad: N/A";
			totalDescription += '\n';
		}
		if (dessert != null) {
			totalDescription += "Dessert: " + dessert.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "Dessert: N/A";
			totalDescription += "\n";
		}
		return totalDescription;
		
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
}

