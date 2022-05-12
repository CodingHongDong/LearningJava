package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaEx63 {

	public static void main(String[] args) {
			
		List<String> chDish1 = new ArrayList<>();
		String[] ch1 = {"짜장면", "우동", "짬뽕", "깐풍기",
					    "팔보채", "난자완스", "탕수육",
					    "찐교스", "라조기", "군만두"};
		
		List<String> chDish2 = new ArrayList<>();
		String[] ch2 = {"마라룽샤", "마라탕", "멘보샤", 
						"마라샹궈", "양꼬치", "양구이", "훠궈"};
		
		List<String> dish = new ArrayList<>();
		String[] arr = {"스시", "사시미", "덮밥", "찌개", "짜장면",
						"마라샹궈", "멘보샤", "훠궈", "똠양꿍",
						"미고랭", "짬뽕"};
		dish.addAll(Arrays.asList(arr));
		
		chDish1.addAll(Arrays.asList(ch1));
		chDish2.addAll(Arrays.asList(ch2));
		
		// 질의(quary)
		// Q1) 정통 중국 요리만 선별하여 정렬 후 나열
//		dish.stream()
//			.filter(x->chDish1.contains(x))
//			.sorted()
//			.forEach(x->System.out.print(x + " "));
		
		// Q2) 사천 요리만 선별하여 내림차순 정렬 후 나열
//		dish.stream()
//			.filter(x->chDish2.contains(x))
//			.sorted(Comparator.reverseOrder())
//			.forEach(x->System.out.print(x + " "));
		
		// Q3) 중국 요리(정통 + 사천)에 해당되지 않는 모든 음식 정렬 후 나열
		dish.stream()
			.filter(x->!chDish1.contains(x))
			.filter(x->!chDish2.contains(x))
			//.filter(x->!(chDish1.contains(x) || chDish2.contains(x)))
			.sorted(Comparator.reverseOrder())
			.forEach(x->System.out.print(x + " "));
	}
}
