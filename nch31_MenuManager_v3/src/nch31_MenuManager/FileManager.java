package nch31_MenuManager;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;

/**
 * Class FileManger
 * @author Noah Howells
 * Created 11/8/2022
 */

public class FileManager {
	
	String fileName;
	
	/**
	 * Method MenuItem ArrayList
	 * @param fileName
	 * @return menuList
	 */
	public static ArrayList<MenuItem> readItems(String fileName){
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
			String line = "";
			
			//loops through the file and separates 
			//the different sections of the text
			while ((line = br.readLine()) != null) {
				String[] data = line.split("@@");
				String name = data[0];
				String type = data[1];
				String description = data[2];
				int calories = Integer.parseInt(data[3]);
				double price = Double.parseDouble(data[4]);				
				
				if(type.equalsIgnoreCase("entree"))
				{
					menuList.add(new Entree(name, type, description, calories, price));
				}
				else if(type.equalsIgnoreCase("side"))
				{
					menuList.add(new Side(name, type, description, calories, price));
				}
				else if(type.equalsIgnoreCase("salad"))
				{
					menuList.add(new Salad(name, type, description, calories, price));
				}
				else if(type.equalsIgnoreCase("dessert"))
				{
					menuList.add(new Dessert(name, type, description, calories, price));
				}
		
			}
			fr.close();
			br.close();
			return menuList;
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	/**
	 * Method writeMenu
	 * @param fileName
	 * @param menus
	 * @return menus
	 * @throws IOException 
	 */
	public static void writeMenu(String fileName, ArrayList<Menu> menus) 
			throws IOException {
		
		FileWriter writer = new FileWriter(fileName);
		int size = menus.size();
		for(int i = 0; i < size; i++) {
			String str = menus.get(i).toString();
			writer.write(str);
			if(i < size-1) {
				writer.write("\n");
			}
		}
		writer.close();

	}

}
