package app1;

import java.util.Scanner;

import calc.Calc;

public class AppLogic {
	Calc calc = new Calc();
	Scanner sc = new Scanner(System.in); 
	
	public void printMenu() {
		System.out.println("=======================");
		System.out.println("   메뉴를 선택하세요   ");
		System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 9. 종료");
		System.out.println("=======================");
	}
	
	public int getMenuNum() {
		
		int calcMenuNum = sc.nextInt();	
		return calcMenuNum;
	}
	
	public void calcMenu(int menuNum) {
		switch (menuNum) {
		case 1: 
			System.out.println("더하기 메뉴입니다.");
			calc.add(getCalcNum(1), getCalcNum(2));	
		break;
			
		case 2: 
			System.out.println("빼기 메뉴입니다.");
			calc.minus(getCalcNum(1), getCalcNum(2));
		break;
		
		case 3: calc.multi(getCalcNum(1), getCalcNum(2));
		System.out.println("곱하기 메뉴입니다.");
		break;
		
		case 4: calc.divide(getCalcNum(1), getCalcNum(2));
		System.out.println("나누기 메뉴입니다.");
		break;
		
		case 9: System.out.println("프로그램 종료.");
			System.exit(0);	
		break;
		
		default: System.out.println("잘못된 번호.");
			break;
		}
	}//calcMenu 메서드
	
	private int getCalcNum(int idx) {
		System.out.printf("%d번째 숫자를 입력하세요. %n",idx);
		int calcNum = sc.nextInt();
		
		return calcNum;
		
		
	}
	
}
