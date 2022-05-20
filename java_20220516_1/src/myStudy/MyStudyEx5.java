package myStudy;

public class MyStudyEx5 {
	
	public static void main(String[] args) {
		
	LambdaInterface4 f4 = (x, y) -> {
		return x * y;
	};
	System.out.println("두 수의 곱 : " + f4.cal(3, 2));
	
	f4 = (x, y) -> x + y;
	System.out.println("두 수의 합 : " + f4.cal(3, 2));
	
	f4 = (x, y) -> {return x / y;};
	System.out.println("두 수의 몫 : " + f4.cal(5, 2));
	
	f4 = (x, y) -> x%y;
	System.out.println("두 수의 나머지 : " + f4.cal(5, 2));
	} // main
}// MyStudyEx5

@FunctionalInterface
interface LambdaInterface4 {
	int cal(int x, int y);
}
