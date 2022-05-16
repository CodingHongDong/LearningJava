package com.javateam.jse;

import java.util.Properties;

public class JavaEx70 {
	
	public static void main(String[] args) {
		
		Properties props = System.getProperties();
		
		props.forEach((k, v) -> System.out.println(k + "=" + v));
		
		System.out.println("========================================");
		
		System.out.println(props.get("java.version"));
		
	}
}
