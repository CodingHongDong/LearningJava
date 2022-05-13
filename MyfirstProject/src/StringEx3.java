
public class StringEx3 {

	public static void main(String[] args) {
		String myStr = "Hello to the Universe";
		System.out.println(myStr);
		
		myStr = myStr.concat(myStr);
		
		setStr(myStr);
		System.out.println(myStr);
		
		

	}
	static String setStr(String myStr) {
		myStr = new String("Hello to the Universe");
		
		return myStr;
	}
	
		// call by Value : 값!!!만 전달하는 방식 <<요것이 자바!
		// call by reference : 주소를 전달하는 방식
		
		// 기대한 값이 나오기 위해서는 !!
		
	
		
		
		
}
