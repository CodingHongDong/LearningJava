package com.javateam.jse;

public class JavaEx55 {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		String str4 = new String("Java");
		
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false
		System.out.println(str3 == str4); // false
		System.out.println(str3.equals(str4)); // true
		System.out.println(str1.equals(str4)); // true
		
	}
}
