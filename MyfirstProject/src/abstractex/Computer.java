package abstractex;

public abstract class Computer {
	
	public abstract void display(); // Computer에서는 구현하지 않고, 이 두 메서드 구현에 대한 책임을
	public abstract void typing();  // 상속받는 클래스에 위임한다 ! 
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
