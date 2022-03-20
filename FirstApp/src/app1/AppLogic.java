package app1;

import java.util.Scanner;

import calc.Calc;

public class AppLogic {
	Calc calc = new Calc();
	Scanner sc = new Scanner(System.in); 
	
	public void printMenu() {
		System.out.println("=======================");
		System.out.println("   �޴��� �����ϼ���   ");
		System.out.println("1. ���� 2. ���� 3. ���� 4. ������ 9. ����");
		System.out.println("=======================");
	}
	
	public int getMenuNum() {
		
		int calcMenuNum = sc.nextInt();	
		return calcMenuNum;
	}
	
	public void calcMenu(int menuNum) {
		switch (menuNum) {
		case 1: 
			System.out.println("���ϱ� �޴��Դϴ�.");
			calc.add(getCalcNum(1), getCalcNum(2));	
		break;
			
		case 2: 
			System.out.println("���� �޴��Դϴ�.");
			calc.minus(getCalcNum(1), getCalcNum(2));
		break;
		
		case 3: calc.multi(getCalcNum(1), getCalcNum(2));
		System.out.println("���ϱ� �޴��Դϴ�.");
		break;
		
		case 4: calc.divide(getCalcNum(1), getCalcNum(2));
		System.out.println("������ �޴��Դϴ�.");
		break;
		
		case 9: System.out.println("���α׷� ����.");
			System.exit(0);	
		break;
		
		default: System.out.println("�߸��� ��ȣ.");
			break;
		}
	}//calcMenu �޼���
	
	private int getCalcNum(int idx) {
		System.out.printf("%d��° ���ڸ� �Է��ϼ���. %n",idx);
		int calcNum = sc.nextInt();
		
		return calcNum;
		
		
	}
	
}
