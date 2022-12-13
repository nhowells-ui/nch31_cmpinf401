package nch31_MenuManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Class MenuManagerGUI
 * @author Noah Howells
 * Created 12/10/2022
 */

public class MenuManagerGUI{
	
	private JComboBox<Entree> entreeBox;
	private JComboBox<Side> sideBox;
	private JComboBox<Salad> saladBox;
	private JComboBox<Dessert> dessertBox;
	
	private MenuManager mm;
	private FileManager fm;
	private Menu m;
	

	

	/**
	 * Method MenuManagerGUI
	 * @author Noah Howells
	 * Created 12/11/2022
	 */
	public MenuManagerGUI() {
		
		mm = new MenuManager("data\\dishes.txt");
		
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 1000, 650);
		
		
		//CREATED MENUS PANEL COMPONENTS//
		
		//CREATED MENUS list
		DefaultListModel<String> listModel = new DefaultListModel<>();
		JList<String> list = new JList<>();
		list.setModel(listModel);
		list.setBounds(25, 25, 415, 450);

		//CREATED MENUS buttons
		JButton detailsButton = new JButton("Details");
		detailsButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JLabel entree = new JLabel("Entree");
				entree.setBounds(30, 35, 50, 15);
				JLabel side = new JLabel("Side");
				side.setBounds(30, 105, 50, 15);
				JLabel salad = new JLabel("Salad");
				salad.setBounds(30, 195, 50, 15);
				JLabel dessert = new JLabel("Dessert");
				dessert.setBounds(30, 285, 50, 15);
				JLabel calories = new JLabel("Total Calories");
				calories.setBounds(30, 375, 100, 15);
				JLabel price = new JLabel("Total Price");
				price.setBounds(30, 465, 100, 15);
				
				JFrame frame = new JFrame();
				frame.add(entree);
				frame.add(side);
				frame.add(salad);
				frame.add(dessert);
				frame.add(calories);
				frame.add(price);

				frame.setBounds(20, 20, 750, 600);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setTitle(list.getName());
				frame.getContentPane().setLayout(null);
				frame.setVisible(true);
				
			}
		});
		detailsButton.setBounds(20, 500, 125, 35);

		JButton deleteButton = new JButton("Delete All");
		deleteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				listModel.removeAllElements();
			}
		});
		deleteButton.setBounds(170, 500, 125, 35);

		JButton saveButton = new JButton("Save to File");
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				fm = new FileManager();
			}
		});
		saveButton.setBounds(320, 500, 125, 35);


		//establish CREATED MENUS PANEL + all components added
		JPanel createdPanel = new JPanel();
		createdPanel.setBorder(BorderFactory.createTitledBorder("Created Menus:"));
		createdPanel.setBounds(515, 10, 465, 555);
		createdPanel.setLayout(null);

		//add buttons
		createdPanel.add(detailsButton);
		createdPanel.add(deleteButton);
		createdPanel.add(saveButton);
		createdPanel.add(list);
		
		
		
		

		
		
		
		
		//GENERATE PANEL COMPONENTS//
		
		//GENERATE PANEL button
		JButton generateButton = new JButton("Generate Random Menu");
		generateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Menu m = mm.randomMenu(JOptionPane.showInputDialog("Please enter a name for your menu: "));
				listModel.addElement(m.name.toString());
			}
		});
		generateButton.setBounds(25, 85, 450, 50);
	
		//establish GENERATE PANEL + all components added
		JPanel generatePanel = new JPanel();
		generatePanel.setBorder(BorderFactory.createTitledBorder("Generate a Menu"));
		generatePanel.setBounds(10, 315, 500, 250);
		generatePanel.setLayout(null);
		
		//add buttons
		generatePanel.add(generateButton);
		
		
		
		
				
		
		
		
	
		
		//BUILD PANEL COMPONENTS//
		
		//BUILD PANEL combo boxes
		ArrayList<Entree> entrees = mm.getEntrees();
		Entree[] entreeList = new Entree[entrees.size()];
		entreeList = entrees.toArray(entreeList);
		entreeBox = new JComboBox<Entree>(entreeList);
		entreeBox.setBounds(100, 30, 350, 25);
		
		ArrayList<Side> sides = mm.getSides();
		Side[] sideList = new Side[sides.size()];
		sideList = sides.toArray(sideList);
		sideBox = new JComboBox<Side>(sideList);
		sideBox.setBounds(100, 80, 350, 25);
		
		ArrayList<Salad> salads = mm.getSalads();
		Salad[] saladList = new Salad[salads.size()];
		saladList = salads.toArray(saladList);
		saladBox = new JComboBox<Salad>(saladList);
		saladBox.setBounds(100, 140, 350, 25);
		
		ArrayList<Dessert> desserts = mm.getDesserts();
		Dessert[] dessertList = new Dessert[desserts.size()];
		dessertList = desserts.toArray(dessertList);
		dessertBox = new JComboBox<Dessert>(dessertList);
		dessertBox.setBounds(100, 200, 350, 25);
				
		//BUILD PANEL labels
		JLabel entreeLabel = new JLabel("Entree");
		entreeLabel.setBounds(30, 35, 50, 15);
		
		JLabel sideLabel = new JLabel("Side");
		sideLabel.setBounds(30, 85, 50, 15);
		
		JLabel saladLabel = new JLabel("Salad");
		saladLabel.setBounds(30, 145, 50, 15);
		
		JLabel dessertLabel = new JLabel("Dessert");
		dessertLabel.setBounds(30, 205, 50, 15);
		
		//BUILD PANEL buttons
		JButton buildButton = new JButton("Create Menu with these Dishes");
		buildButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				m = new Menu(null, null, null, null, null);
				m.entree = (Entree)entreeBox.getSelectedItem();
				m.side = (Side)sideBox.getSelectedItem();
				m.salad = (Salad)saladBox.getSelectedItem();
				m.dessert = (Dessert)dessertBox.getSelectedItem();
				m.name = JOptionPane.showInputDialog("Please enter a name for your menu: ");
				listModel.addElement(m.name.toString());
				System.out.println(m);
				
			}
		});
		buildButton.setBounds(25, 260, 450, 25);		
		
		//establish BUILD PANEL + all components added
		JPanel buildPanel = new JPanel();
		buildPanel.setBorder(BorderFactory.createTitledBorder("Build a Menu"));
		buildPanel.setBounds(10, 10, 500, 300);
		buildPanel.setLayout(null);
		
		//add drop down boxes
		buildPanel.add(entreeBox);
		buildPanel.add(sideBox);
		buildPanel.add(saladBox);
		buildPanel.add(dessertBox);
		
		//add buttons
		buildPanel.add(buildButton);
		
		//add drop down labels
		buildPanel.add(entreeLabel);
		buildPanel.add(sideLabel);
		buildPanel.add(saladLabel);
		buildPanel.add(dessertLabel);
		
		
		
	
		
		//FRAME ESTABLISHMENT//
		frame.add(buildPanel);
		frame.add(generatePanel);
		frame.add(createdPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Menu Manager");
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}

	
	/**
	 * Method main
	 * @author Noah Howells
	 * @param args
	 * Created 12/10/2022
	 */
	public static void main(String[] args) {
		new MenuManagerGUI();
	}

}
