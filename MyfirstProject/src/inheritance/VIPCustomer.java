package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출 ");
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override // : 상위 클래스에 정의한 메서드가 하위 클래스에서 구현할 내용과 맞지 않을 경우에 하위 클래스에서 이 메서드를 재정의하는 것.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return super.calcPrice(price) - (int)(price * saleRatio);
	}
		
//	public String showVIPInfo() {
//		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
//	} -->이거 왜 오류뜰까아~~?
		
	
}

