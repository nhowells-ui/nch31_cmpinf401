package nch31_MenuManager;

/**
 * Class Salad
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class Salad {
	
	String name;
	String description;
	int calories;
	
	//parameters
	public Salad(String saladName, String saladDescription, int saladCalories) {
		name = saladName;
		description = saladDescription;
		calories = saladCalories;
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
