package nch31_MenuManager;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize
 * @author Noah Howells
 * Created 11/8/2022
 *
 */

public class MenuRandomize {
	
	
	private ArrayList<Entree> entreeList;
	private ArrayList<Side> sideList;
	private ArrayList<Salad> saladList;
	private ArrayList<Dessert> dessertList;
	

	
	/**
	 * Method MenuRandomize
	 * @param entreeFile
	 * @param sideFile
	 * @param saladFile
	 * @param dessertFile
	 */
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile){
		FileManager fm = new FileManager();
		this.entreeList = fm.readEntrees(entreeFile);
		this.sideList = fm.readSides(sideFile);
		this.saladList = fm.readSalads(saladFile);
		this.dessertList = fm.readDesserts(dessertFile);
		
	}
	
	
	/**
	 * Method randomMenu
	 * @param 
	 * @return
	 */
	public Menu randomMenu() {
		Menu m = new Menu(null, null, null, null, null);				
		Random r = new Random();
		m.setEntree(entreeList.get(r.nextInt(entreeList.size())));
		m.setSide(sideList.get(r.nextInt(sideList.size())));
		m.setSalad(saladList.get(r.nextInt(saladList.size())));
		m.setDessert(dessertList.get(r.nextInt(dessertList.size())));
			
		return m;

	}
	
	

	
}
