package nch31_Lab9;

public class Circle {
	
	double radius = 5.0;
	double pi = 3.14;
	String color = "Green";
	
	public Circle(){
	
	}
	
	

	public Circle(double radius){
		
	}	
	
	public Circle(double radius, String color){
		
		this.radius = radius;
		this.color = color;
		
	}
	public double Area() {
		
		return radius * pi;

	}
	
	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea(double Area) {
		return Area;
	}
}
