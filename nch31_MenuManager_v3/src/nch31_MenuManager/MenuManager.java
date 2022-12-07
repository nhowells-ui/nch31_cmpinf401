package nch31_MenuManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
			if(item.getType().equals("entree")) {
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
			else {
				System.out.println("hI");
			}
		}
	}
	
	public Menu randomMenu(String name) {
		Menu m = new Menu(null, null, null, null, null);				
		Random r = new Random();
		System.out.println(entrees.size());
		int t = r.nextInt(entrees.size());
		System.out.println(t);
		m.setName(name);
		m.setEntree(entrees.get(r.nextInt(entrees.size())));
		m.setSide(sides.get(r.nextInt(sides.size())));
		m.setSalad(salads.get(r.nextInt(salads.size())));
		m.setDessert(desserts.get(r.nextInt(desserts.size())));
		
		return m;

	}
	
	
}
