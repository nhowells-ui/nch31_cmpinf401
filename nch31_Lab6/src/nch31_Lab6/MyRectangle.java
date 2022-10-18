package nch31_Lab6;

public class MyRectangle {

	int startX;
	int startY;
	int width;
	int height;
	
	public MyRectangle() {
		startX = 0;
		startY = 0;
		width = 0;
		height = 0;
	}
	public MyRectangle(int x, int y, int w, int h) {
		startX = x;
		startY = y;
		width = w;
		height = h;
	}
	public int area() {
		int area = width * height;
		return area();
	}
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	public boolean isInside(int x, int y) {
		
		return true;
	}
	public void setSize(int w, int h) {
	}
	public void setPosition(int x, int y) {
	}
}
