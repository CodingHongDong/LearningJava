package myStudy;

public class MyStudyEx1 {
	
	public static void main(String[] args) {
		InterfaceEx ie = (int x, int y) -> x+y;
		System.out.println(ie.sum(1, 2));
	}
}

interface InterfaceEx {
	public int sum(int x, int y);
}