package com.javateam.jse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaEx57 {

	public static void main(String[] args) {
		
		
		// System.out.print("입력 : ");
		Scanner sc = null;
		String input;
		int num = 0; 
		
		while(true) {
		
		try {
			System.out.print("입력(입력을 종료하시려면 exit를 입력하세요) : ");
			sc = new Scanner(System.in); // 무한 반복 오류 패치 !
			
			input = sc.nextLine();
			// num = sc.nextInt();
			
			if(input.trim().equalsIgnoreCase("exit")) {
				// 공백제거 후 대소문자 구분없이 비교
				System.out.println("입력 종료하겠습니다.");
				break;
			}
			
			// 조건부)점수면 분기 아니면 계속 입력
			try {
				num = Integer.parseInt(input);
				break; //분기
			} catch (NumberFormatException e) {
				System.out.println("입력값은 정수가 아닙니다. 다시 입력하십시오.");
			}
			
		} catch (InputMismatchException e) {
			System.err.println("입력 오류");
		}
		
		} // while
		System.out.println("num : " + num);
		
		sc.close();
	}
}
