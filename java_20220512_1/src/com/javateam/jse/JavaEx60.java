package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaEx60 {
	
	public static void main(String[] args) {
		
		// List list = new ArrayList(); // raw type
		// List<String> list = new ArrayList<String>(); // (O)
		//List<String> list = new ArrayList<>(); // (O)
		// List<> list = new ArrayList<>(); // (X)
		// List<> list = new ArrayList<String>(); // (X)
		
		List<String> list = new ArrayList<String>();
		
		// list.add(1); // (X)
		// list.add(1F); // (X)
		list.add("Java"); // (O)
		list.add("C");
		list.addAll(1, Arrays.asList(new String[]{"C++", "Python", "Javascript"}));
		list.addAll(Arrays.asList("HTML", "CSS", "React.js"));
		list.add("C");
		list.add("C");
		System.out.println("리스트의 크기 : " + list.size());
		System.out.println("첫번째 요소 : " + list.get(0));
		System.out.println("마지막번째 요소 : " + list.get(list.size()-1));
		
		System.out.println("-----------------------------");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
		System.out.println("\n-----------------------------");
		
		for (String s : list) {
			System.out.print(s + ", ");
		}
		
		System.out.println("\n-----------------------------");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
		
		System.out.println("\n-----------------------------");
		
		// 람다 대(수) 프로그래밍((람다)함수형 프로그래밍)
		list.forEach(x->System.out.print(x + ", "));
		
		System.out.println("\n-----------------------------");
		
		list.forEach(System.out::println);
		
		System.out.println("\n-----------------------------");
		
		
	}
}
