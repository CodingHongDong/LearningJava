package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JavaEx64 {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		String[] ch1 = {"짜장면", "우동", "짬뽕", "깐풍기",
					    "팔보채", "난자완스", "탕수육",
					    "찐교스", "라조기", "군만두"};
		
		set.addAll(Arrays.asList(ch1));
		set.add("찐교스");
		
		// System.out.println(set.size()); // 중복 배제, 순서없음
		
		for(String s : set) {
			System.out.print(s + " ");
		}
		
		// 기본 오름차순 정렬
		// set.forEach(x->System.out.print(x + " "));
		
	}
}
