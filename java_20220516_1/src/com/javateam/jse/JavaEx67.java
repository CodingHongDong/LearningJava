package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class JavaEx67 {
	
	public static void main(String[] args) {
		
		//Map<String, String> map = new HashMap<>();
		
		// 기본적으로 키(Key) 중심으로 오름차순 정렬
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("종로", "설렁탕");
		map.put("무교", "낙지볶음");
		map.put("을지로", "생선구이");
		map.put("신당동", "떡볶이");
		map.put("마장동", "육고기");
		map.put("마포", "돼지갈비");
		map.put("응암동", "감자탕");
		map.put("노량진", "회");
		map.put("장충", "족발");
		map.put("신림", "순대");
		map.put("대림", "마라탕");
		
		// 값들만 나열
		//map.values().forEach(System.out::println);
		
		// 전체 나열
		//map.entrySet().forEach(System.out::println);
		
		//System.out.println("========================");
		
		// 내림차순 정렬
		//map.descendingKeySet().forEach(k->System.out.println(k+"="+map.get(k)));
		
		//System.out.println("========================");
		
		// 일부분 추출
		//map.subMap("구로", "신당동")
		//map.subMap("구로", true, "신당동", true)
		map.headMap("신당동")
		.forEach((k, v) -> System.out.println(k+"="+map.get(k)));
		
		
	}
}
