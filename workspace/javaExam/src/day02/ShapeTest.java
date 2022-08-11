package day02;

public class ShapeTest {
	public static void main(String[] args) {
		Shape p = new Shape();
		p.setX(2);
		p.setY(5);
		
		p.show();
		
		Shape p2 = new Shape(10,23);
		p2.show();

	}
}
