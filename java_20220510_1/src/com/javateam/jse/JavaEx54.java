package com.javateam.jse;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaEx54 {

	String name;
	String flavor;
	
	void method1() {
		
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
	
		JavaEx54 obj = new JavaEx54();
		Class clazz = obj.getClass();
		System.out.println("클래스의 이름 : " + clazz.getName()); 
		// com.javateam.jse.JavaEx54
		// 리플렉션(reflection) ex) 거울 보는 것 => 자신을 점검(확인)
		
		Field[] fids = clazz.getDeclaredFields();
		for(Field f : fids) {
			System.out.println(f);
		}
		// java.lang.String com.javateam.jse.JavaEx54.name
		// java.lang.String com.javateam.jse.JavaEx54.flavor
		
		Method[] mthds = clazz.getDeclaredMethods();
		for(Method m : mthds) {
			System.out.println(m);
		}
		// public static void com.javateam.jse.JavaEx54.main(java.lang.String[])
		// void com.javateam.jse.JavaEx54.method1()
		
		System.out.println("------------------------------");
		
		try {
			Class clazz2 = Class.forName("com.javateam.jse.JavaEx54");
			
			Field[] fids2 = clazz2.getDeclaredFields();
			for(Field f : fids2) {
				System.out.println(f);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------");
		
		Class clazz3 = JavaEx54.class;
		System.out.println(clazz3.getDeclaredField("name"));
		
	}
}
