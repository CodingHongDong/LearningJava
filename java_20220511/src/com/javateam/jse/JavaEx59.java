package com.javateam.jse;

import java.util.Date;
import java.util.regex.Pattern;

public class JavaEx59 {

	public static void main(String[] args) {
		
		// System.out.println(new Date());
		
		String phone = "019-1244-5678";
		boolean flag = Pattern.compile("010-\\d{4}-\\d{4}")
							  .matcher(phone)
							  .matches();
		System.out.println(flag);
		
		System.out.println("----------------");
		
		// String str = "1234.05";
		String str = "1234";
		String regex = "[0-9]{1,}";
		boolean flag2 = Pattern.compile(regex)
							  .matcher(str)
							  .matches();
		System.out.println(flag2 == true ? "정수" : "정수 아님");
		
	}
}
