package logic1swap;

public class Runner {

	
	public void swap (Point point) {
		int x = point.getX();
		int y = point.getY();
		
		x = x + y;
		y = x - y; // (x + y) - y = x
		x = x - y; // (x + y) - x = y
		
		point.setX(x);
		point.setY(y);
	}

	public static void main(String[] args) {
		Point p = new Point(5, 7);
		new Runner().swap(p);
		System.out.println(p.getX() + " " + p.getY());

	}

}
