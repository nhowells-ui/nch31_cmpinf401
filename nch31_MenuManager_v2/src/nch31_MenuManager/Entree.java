package nch31_MenuManager;

/**
 * Class Entree
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class Entree {

	String name;
	String description;
	int calories;

	//parameters
	public Entree(String entreeName, String entreeDescription, int entreeCalories) {
		name = entreeName;
		description = entreeDescription;
		calories = entreeCalories;
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