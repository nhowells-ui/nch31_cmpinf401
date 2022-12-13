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
	
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
	@Override
	public String toString() {
		return this.name + this.entree + this.side + this.salad + this.dessert;
		
	}
		
	public String dishName() {
		
		return null;
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
			totalDescription += entree.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "N/A";	
			totalDescription += '\n';
		}
		if (side != null) {
			totalDescription += side.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "N/A";	
			totalDescription += '\n';
		}
		if (salad != null) {
			totalDescription += salad.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "N/A";
			totalDescription += '\n';
		}
		if (dessert != null) {
			totalDescription += dessert.getDescription();
			totalDescription += '\n';
		}
		else {
			totalDescription += "N/A";
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

