package com.javateam.jse;

import java.util.LinkedList;
import java.util.Queue;

public class JavaEx69 {
	
	public static void main(String[] args) {
		
		// FIFO(First In First Out) 먼저 들어간 것이 먼저 나옴~~
		Queue<String> qu = new LinkedList<>();
		qu.offer("샌드위치");
		qu.offer("견과바");
		qu.offer("바나나");
		qu.offer("초콜릿");
		
		System.out.print(qu.poll() + ", ");
		System.out.println(qu.size() + "개 남음");

		System.out.print(qu.poll() + ", ");
		System.out.println(qu.size() + "개 남음");
		
		System.out.print(qu.poll() + ", ");
		System.out.println(qu.size() + "개 남음");
		
		System.out.print(qu.poll() + ", ");
		System.out.println(qu.size() + "개 남음");
		
	}
}
