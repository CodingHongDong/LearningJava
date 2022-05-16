package com.javateam.jse;

import java.util.Stack;

public class JavaEx68 {
	
	public static void main(String[] args) {
		
		// LIFO(Last In First Out) 마지막에 들어온 것이 가장 먼저 나감.
		Stack<String> st = new Stack<>();
		st.push("김밥");
		st.push("컵라면");
		st.push("도너츠");
		st.push("샌드위치");
		
		System.out.print(st.pop() + ", ");
		System.out.println(st.size() + "개 남음");
		
		System.out.print(st.pop() + ", ");
		System.out.println(st.size() + "개 남음");
		
		System.out.print(st.pop() + ", ");
		System.out.println(st.size() + "개 남음");
		
		System.out.print(st.pop() + ", ");
		System.out.println(st.size() + "개 남음");
		
	}
}
