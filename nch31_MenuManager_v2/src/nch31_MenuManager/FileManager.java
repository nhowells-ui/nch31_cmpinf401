package nch31_MenuManager;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

/**
 * Class FileManger
 * @author Noah Howells
 * Created 11/8/2022
 */

public class FileManager {
	
	String fileName;
	
	
	/**
	 * Method Entree ArrayList
	 * @param entreeFile
	 * @return entreeList
	 */
	public ArrayList<Entree> readEntrees(String entreeFile) {
		
		try {
			FileReader eFr = new FileReader(entreeFile);
			BufferedReader eBr = new BufferedReader(eFr);
			ArrayList<Entree> entreeList = new ArrayList<Entree>();
			String line = "";
			
			// Loops through data file
			while((line = eBr.readLine()) != null) {
				String[] data = line.split("@@");
				String name = data[0];
				String description = data[1];
				String calories = data[2];
				
				//creates new object of entree, with each category separated into different arrays
				Entree entree = new Entree(name, description, Integer.parseInt(calories));
				entreeList.add(entree); //adds new object back into the array list
			}
			eBr.close();
			eFr.close();
			return entreeList;
		}
		catch (IOException e) {
			    System.out.println(e.getMessage());
		}
		return null;
	}
	
	/**
	 * Method Side ArrayList
	 * @param sideFile
	 * @return sideList
	 */
	public ArrayList<Side> readSides(String sideFile) {

		try {
			FileReader siFr = new FileReader(sideFile);
			BufferedReader siBr = new BufferedReader(siFr);
			ArrayList<Side> sideList = new ArrayList<Side>();
			String line = "";

			while ((line = siBr.readLine()) != null) {
				String[] data = line.split("@@");
				String name = data[0];
				String description = data[1];
				String calories = data[2];
				
				Side side = new Side(name, description, Integer.parseInt(calories));
				sideList.add(side);
			}	
			siBr.close();
			siFr.close();
			return sideList;
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	
	/**
	 * Method Salad ArrayList
	 * @param saladFile
	 * @return saladList
	 */
	public ArrayList<Salad> readSalads(String saladFile) {

		try {
			FileReader saFr = new FileReader(saladFile);
			BufferedReader saBr = new BufferedReader(saFr);
			ArrayList<Salad> saladList = new ArrayList<Salad>();
			String line = "";

			while ((line = saBr.readLine()) != null) {
				String[] data = line.split("@@");
				String name = data[0];
				String description = data[1];
				String calories = data[2];
				
				Salad salad = new Salad(name, description, Integer.parseInt(calories));
				saladList.add(salad);
			}	
			saBr.close();
			saFr.close();
			return saladList;
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	
	/**
	 * Method Dessert ArrayList
	 * @param dessertFile
	 * @return dessertList
	 */
	public ArrayList<Dessert> readDesserts(String dessertFile) {

		try {
			FileReader dFr = new FileReader(dessertFile);
			BufferedReader dBr = new BufferedReader(dFr);
			ArrayList<Dessert> dessertList = new ArrayList<Dessert>();
			String line = "";

			while ((line = dBr.readLine()) != null) {
				String[] data = line.split("@@");
				String name = data[0];
				String description = data[1];
				String calories = data[2];
				
				Dessert dessert = new Dessert(name, description, Integer.parseInt(calories));
				dessertList.add(dessert);
			}	
			dBr.close();
			dFr.close();
			return dessertList;
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
