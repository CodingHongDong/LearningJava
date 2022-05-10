package com.javateam.jse;

public class StringEx {
	public static void main(String[] args) {
		
		String str = "Hello My Name is Hong Dong Hwan";
		
		System.out.println(str.charAt(6)); // 6번 인덱스의 문자 리턴
		System.out.println(str.equals("Hello My Name is Hong Dong Hwan")); // true   문자열값 비교
		System.out.println(str.indexOf("Hong")); //"Hong" 문자열의 위치
		System.out.println(str.indexOf('H')); //'H' 문자의 위치
		System.out.println(str.substring(17)); // 17번 인덱스부터 끝까지 잘라냄
		System.out.println(str.substring(6, 13)); // 6번 인덱스부터 13번 전 인덱스(12번인덱스) 까지 문자열 잘라냄
		System.out.println(str.toLowerCase()); // 소문자로 변경
		System.out.println(str.toUpperCase()); // 대문자로 변경
		System.out.println(str.length()); // 문자열의 길이
		System.out.println(str.startsWith("Hello")); // "Hello" 으로 시작되는지 여부 확인
		System.out.println(str.endsWith("Hwan")); // "Hwan"으로 끝나는지 여부 확인
		System.out.println(str.replace("Hong", "Kim")); // "Hong"을 "Kim" 으로 치환
		System.out.println(str.toString());
		
		System.out.println("=====================");
		
		str = "    안녕 하세요,    반갑습니다.     ";
		System.out.println(str.trim()); // 앞뒤 공백 제거
		System.out.println(str.replaceAll(" ", "")); // 모든 공백 제거
		
	}
}
