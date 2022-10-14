package nch31_MenuManager;

/**
 * Class Dessert
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class Dessert {
	
	String name;
	String description;
	int calories;
	
	//parameters
	public Dessert(String dessertName, String dessertDescription, int dessertCalories) {
		name = dessertName;
		description = dessertDescription;
		calories = dessertCalories;
	}

	//getters and setters
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
	
	

}
