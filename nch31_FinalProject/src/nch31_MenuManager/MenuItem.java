package nch31_MenuManager;

/**
 * Class MenuItem
 * @author Noah Howells
 * Created 12/1/2022
 *
 */

public class MenuItem {
	
	String name;
	String type;
	String description;
	int calories;
	double price;
	
	MenuItem(String name, String type, String description, int calories, double price){
		this.name = name;
		this.type = type;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}
	
	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
