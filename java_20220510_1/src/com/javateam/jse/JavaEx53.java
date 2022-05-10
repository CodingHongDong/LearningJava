package com.javateam.jse;

import java.util.Objects;


public class JavaEx53 {
	
	String food;
	String flavor;
	int money;
	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + money;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof JavaEx53))
			return false;
		JavaEx53 other = (JavaEx53) obj;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (money != other.money)
			return false;
		return true;
	}
	*/
	
	


	@Override
	public int hashCode() {
		return Objects.hash(flavor, food, money);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaEx53 other = (JavaEx53) obj;
		return Objects.equals(flavor, other.flavor) && Objects.equals(food, other.food) && money == other.money;
	}

	public static void main(String[] args) {
		
		JavaEx53 obj = new JavaEx53();
		// System.out.println(obj); // toString() 묵시적으로 호출
		// System.out.println(obj.toString());
		// 객체의 고유값
		// ex) java.jse.JavaEx53@4361bd48
		
		JavaEx53 obj2 = new JavaEx53();
		// obj=obj2; // true
		
		// System.out.println(obj.equals(obj2)); // false
		
		// 동등 비교 : 그 객체들 자체 보다는 내용물(멤버)들로 비교
		obj.food = "치킨";
		obj.flavor = "달콤 매콤 바삭";
		obj.money = 8000;
		
		obj2.food = "치킨";
		obj2.flavor = "달콤 매콤 바삭";
		obj2.money = 8000;
		
		System.out.println(obj.equals(obj2));
		
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("-----------------------------");
		
		System.out.println(obj);
		System.out.println(obj.toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JavaEx53 [food=");
		builder.append(food);
		builder.append(", flavor=");
		builder.append(flavor);
		builder.append(", money=");
		builder.append(money);
		builder.append("]");
		return builder.toString();
	}

//	@Override
//	public String toString() {
//		return "JavaEx53 [food=" + food + ", flavor=" + flavor + ", money=" + money + "]";
//	}
	
	
	
}
