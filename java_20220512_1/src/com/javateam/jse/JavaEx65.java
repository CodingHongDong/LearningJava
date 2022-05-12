package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class JavaEx65 {

	public static void main(String[] args) {
	
		NavigableSet<String> set = new TreeSet<>();
		String[] ch1 = {"짜장면", "우동", "짬뽕", "깐풍기",
					    "팔보채", "난자완스", "탕수육",
					    "찐교스", "라조기", "군만두"};
		
		set.addAll(Arrays.asList(ch1));
		set.add("찐교스");
		
		// System.out.println(set.size()); // 중복 배제, 순서없음
		
		
		
		// 기본 오름차순 정렬
		set.forEach(x->System.out.print(x + " "));
		System.out.println();
		
		set.descendingIterator()
		   .forEachRemaining(x->System.out.print(x + " "));
		
	}
}
