package nch31_MenuManager;

import java.util.*;

/**
 * Class MenuManager
 * @author Noah Howells
 * Created 12/1/2022
 *
 */

public class MenuManager {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	public MenuManager(String dishesFile){
		ArrayList<MenuItem> menus = FileManager.readItems(dishesFile);
		
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
		
		for(int i = 0; i < menus.size(); i++) {
			
			MenuItem item = menus.get(i);
			
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
		Menu m = new Menu(null, null, null, null, null);				
		Random r = new Random();
		m.setName(name);
		m.setEntree(entrees.get(r.nextInt(entrees.size())));
		m.setSide(sides.get(r.nextInt(sides.size())));
		m.setSalad(salads.get(r.nextInt(salads.size())));
		m.setDessert(desserts.get(r.nextInt(desserts.size())));
		
		return m;

	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}
	
	
}
