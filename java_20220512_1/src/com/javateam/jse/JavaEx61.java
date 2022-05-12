package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx61 {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<>();
		String[] arr = {"짜장면", "우동", "짬뽕",
					    "팔보채", "난자완스", "탕수육",
					    "찐교스", "라조기", "군만두"};
		
		// list = Arrays.asList(arr); // 요소의 첨가/삭제 X
		// list.remove(0); 	  	// (X)
		// list.add("마라탕");  	// (X) java.lang.UnsupportedOperationException
		
		list.addAll(Arrays.asList(arr));
		list.add("마라탕");
		list.remove("찐교스");
		list.remove(0);
		list.add(1, "깐풍기");
		list.removeAll(Arrays.asList("탕수육", "마라탕", "라조기"));
		
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		System.out.println(list);
		
	}
}
