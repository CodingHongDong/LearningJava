package com.javateam.jse;

public class JavaEx71 {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();
	}
}


class Thread1 extends Thread {

	@Override
	public void run() {
		
		for(int i = 0; i < 20; i++) {
			System.out.print("-");
		}
	}
	
}

class Thread2 extends Thread {

	@Override
	public void run() {
		
		for(int i = 0; i < 20; i++) {
			System.out.print("*");
		}
	}
	
}

class Thread3 extends Thread {

	@Override
	public void run() {
		
		for(int i = 0; i < 20; i++) {
			System.out.print("|");
		}
	}
	
}