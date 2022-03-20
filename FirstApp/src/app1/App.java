package app1;

public class App {
	public static void main(String[] args) {
		AppLogic logic = new AppLogic();
		
		while (true) {
			logic.printMenu();
			logic.calcMenu(logic.getMenuNum());
			
		}//while
		
	}//main

}
