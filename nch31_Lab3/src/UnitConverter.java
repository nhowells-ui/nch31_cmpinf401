import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Input distance or weight amount, followed by the units of measurment: ");
		
		//separate number input from unit input
		int indexOfSpace = userInput.indexOf(" ");
		String numInput = userInput.substring(0, indexOfSpace);
		double number = Double.parseDouble(numInput);
		String unitInput = userInput.substring(indexOfSpace +1, userInput.length());
		
		
		//unit variables
		String cm = "cm";
		String in = "in";
		String yd = "yd";
		String m = "m";
		String gm = "gm";
		String oz = "oz";
		String lb = "lb";
		String kg = "kg";
		
		//conditional conversions
		if (unitInput.equalsIgnoreCase(cm))
		{
			number = number/2.54;
			System.out.println(userInput + " = " + number + " in");
		}
		else if (unitInput.equalsIgnoreCase(in))
		{
			number = number*2.54;
			System.out.println(userInput + " = " + number + " cm");
		}
		else if (unitInput.equalsIgnoreCase(yd))
		{
			number = number/1.094;
			System.out.println(userInput + " = " + number + " m");
		}
		else if (unitInput.equalsIgnoreCase(m))
		{
			number = number*1.094;
			System.out.println(userInput + " = " + number + " yd");
		}
		else if (unitInput.equalsIgnoreCase(gm))
		{
			number = number/28.35;
			System.out.println(userInput + " = " + number + " oz");
		}
		else if (unitInput.equalsIgnoreCase(oz))
		{
			number = number*28.35;
			System.out.println(userInput + " = " + number + " gm");			
		}
		else if (unitInput.equalsIgnoreCase(lb))
		{
			number = number/2.205;
			System.out.println(userInput + " = " + number + " kg");
		}
		else if (unitInput.equalsIgnoreCase(kg))
		{
			number = number*2.205;
			System.out.println(userInput + " = " + number + " lb");
		}	

	}

}
