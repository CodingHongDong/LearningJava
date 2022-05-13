package object;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}

class Circle implements Cloneable {
	Point point;
	int redius;
	
	Circle(int x, int y, int redius) {
		this.redius = redius;
		point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고, " + "반지름은 " + redius + "입니다.";
	}

	@Override 					// CloneNotSupportedException : clone()메서드를 사용할 때 발생가능한 오류를 예외처리함.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}



public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
