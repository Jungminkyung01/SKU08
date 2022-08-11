package day02;

//Point클래스를 만들라고 했지만 Shape클래스를 생성
public class Shape {
	
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x= x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("좌표");
	}
}
