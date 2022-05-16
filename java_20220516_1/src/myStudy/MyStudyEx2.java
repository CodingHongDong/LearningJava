package myStudy;

public class MyStudyEx2 {
	
	public static void main(String[] args) {
		LambdaInterface li = () -> {
			String str = "메서드 출력";
			System.out.println(str);
		};
		
		li.print();
	}
}

interface LambdaInterface {
	void print();
}