package com.javateam.jse;

public class JavaEx56 {
	
	public static float avgTotal(float kor, float eng, float math, int limit) {
		int num = (int)Math.pow(10, limit); // 승수
		float sum = kor + eng + math;
		
		return (float)Math.round(sum / 3 * num) / num;
	}
	
	
	public static void main(String[] args) {
		
		// String str = "abcd";
		String str = "123";
		int num = Integer.parseInt(str) + 1;
		// int num = Integer.valueOf(str) + 1;
		// int num = new Integer(str) + 1;
		// java.lang.NumberFormatException 예외 발생 !
		
		String str2 = "123.456";
		
		float num2 = Float.parseFloat(str2);
		
		// int num3 = Math.round(num2);
		// int num3 = Math.floor(num2);
		// double num3 = Math.floor(num2);
		
		// 소수점 둘째자리에서 반올림 : 123.456 -> 123.46
		System.out.println((float)Math.round(num2*100) / 100);
		
		// 소수점 첫재자리에 반올림 : 123.456 -> 123.5
		System.out.println((float)Math.round(num2*10) / 10);
		
		
		// System.out.println(num);
		// System.out.println(num2);
		// System.out.println(num3);
		
		System.out.println(JavaEx56.avgTotal(45, 245, 345, 34));
		
	}
}
