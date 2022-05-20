package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaEx66 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("종로", "설렁탕");
		map.put("무교", "낙지볶음");
		map.put("을지로", "생선구이");
		map.put("신당", "떡볶이");
		map.put("마장동", "육고기");
		map.put("마포", "돼지갈비");
		map.put("응암동", "감자탕");
		map.put("노량진", "회");
		map.put("장충", "족발");
		map.put("신림", "순대");
		map.put("대림", "마라탕");
		
		//System.out.println("map의 크기 : " + map.size());
		
		// 중복(Key)
		map.put("종로", "닭한마리");
		map.put("노량진", "컵밥");
		
		//System.out.println("map의 크기 : " + map.size());
		
		// 개별 요소
		//System.out.println("종로 = " + map.get("종로"));
		
		// 전체 요소
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String val = map.get(key);
			System.out.println(key + "=" + val);
		}
		
		System.out.println("=====================================");
		
		map.forEach((k, v) -> System.out.println(k + "=" + v));
		
		System.out.println("=====================================");
		
		map.keySet().forEach(k->System.out.println(k + "=" + map.get(k)));
		
		System.out.println("=====================================");
		
		map.entrySet().forEach(x->System.out.println(x));
		
		System.out.println("=====================================");
		
		map.entrySet().forEach(System.out::println);
	}
}
