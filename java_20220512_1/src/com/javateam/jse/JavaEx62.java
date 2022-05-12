package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaEx62 {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<>();
		String[] arr = {"짜장면", "우동", "짬뽕",
					    "팔보채", "난자완스", "탕수육",
					    "찐교스", "라조기", "군만두"};
		
		list.addAll(Arrays.asList(arr));
		
		// 정렬(sorting)
		// list.sort(Comparator.naturalOrder()); // 오름차순(ascending)
		// list.sort(Comparator.reverseOrder()); // 내림차순(descending)
		
		// 부분 추출(subtract)
		// index 1 ~ 4까지만 출력 5인덱스는 미포함(exclusive:제외) ㅇㅋ?
		// list.subList(1, 5).forEach(x->System.out.print(x + " "));
		
		// list.clear(); // 모든 요소 삭제
		// System.out.println(list.size());
		
		// System.out.println("포함 여부 : " + list.contains("탕수육")); // true
		// System.out.println("포함 여부 : " + 
		//					  list.containsAll(Arrays.asList("마라탕", "멘보샤"))); // false
		
		// list.retainAll(Arrays.asList("탕수육", "멘보샤")); // 얘내빼고 다 삭제하기~
		
		// list.forEach(x->System.out.print(x + " "));
		
		// 배열로 치환
		String[] arr2 = new String[list.size()];
		arr2 = list.toArray(arr2);
		
		for (String s : arr2) System.out.print(s + " ");
		
	}
}
