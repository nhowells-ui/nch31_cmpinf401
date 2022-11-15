package nch31_Lab9;

public class Cylinder extends Circle{

	double height = 1;
	
	
	public Cylinder(){
		
	}
	
	public Cylinder(double radius, double height){
		
	}

	public Cylinder(double radius, double height, String color){
		super(radius, color);
	}
	
	public double Volume(double radius, double pi, double height) {
		super(radius, pi);
		double volume = (radius * radius) * height * pi;
		return volume;
		
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume(double volume) {
		return volume;
	}
	
	
}
