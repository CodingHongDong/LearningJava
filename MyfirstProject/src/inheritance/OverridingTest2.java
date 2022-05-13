package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);  //VIP 고객 생성
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
		vc.calcPrice(10000) + "입니다.");

		// 선언한 Customer클래스형이 아닌 VIPCustomer클래스형이 호출됨. 왜?!
		// 선언한 클래스형이 아닌 생성된 인스턴스의 메서드를 호출한것이기 때문! 이것을 가상메서드라고한다잉!!
		// 가상 메서드 방식에 의해 VIPCustomer 인스턴스의 메서드가 호출된것! 두둥!
	}

}
