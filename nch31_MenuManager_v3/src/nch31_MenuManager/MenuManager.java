package nch31_MenuManager;

import java.util.*;

/**
 * Class MenuManager
 * @author Noah Howells
 * Created 12/1/2022
 *
 */

public class MenuManager {

	ArrayList<Entree> entrees;
	ArrayList<Side> sides;
	ArrayList<Salad> salads;
	ArrayList<Dessert> desserts;
	
	MenuManager(String dishesFile){
		ArrayList<MenuItem> menus = FileManager.readItems(dishesFile);
		
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
		
		for(int i = 0; i < menus.size(); i++) {
			
			MenuItem item = menus.get(i);
			// System.out.println(item.getDescription());
			
			if(item instanceof Entree) {
				entrees.add((Entree)item);
			}
			else if(item instanceof Side) {
				sides.add((Side)item);
			}
			else if(item instanceof Salad) {
				salads.add((Salad)item);
			}
			else if(item instanceof Dessert) {
				desserts.add((Dessert)item);
			}
		}
		
	}
	
	public Menu randomMenu(String name) {
		Menu m;			
		Random r = new Random();
		
		int index = r.nextInt(entrees.size());
		
		m = new Menu(name, entrees.get(index), sides.get(index), salads.get(index), desserts.get(index));	
		
		return m;

	}
	
	
}
