package collection.arraylist;

import java.util.ArrayList;

import collection.Member; // Member클래스는 collection 패키지에 있으므로 사용하려면 import해얗한다잉!

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ArrayList 선언 !
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // Member형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) { // ArrayList에 회원을 추가하는 메서드
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i); // get()메서드로 회원을 순차적으로 가져옴.
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
} // class MemberArrayList
