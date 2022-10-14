package nch31_MenuManager;

/**
 * Class Side
 * @author Noah Howells
 * created: 10/14/2022
 *
 */

public class Side {
	
	String name;
	String description;
	int calories;

	//parameters
	public Side(String sideName, String sideDescription, int sideCalories) {
		name = sideName;
		description = sideDescription;
		calories = sideCalories;
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
