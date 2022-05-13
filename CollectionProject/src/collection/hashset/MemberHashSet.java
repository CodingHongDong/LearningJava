package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next(); // 회원을 하나씩 가져와서
			int tempID = member.getMemberID(); // 아이디 비교
			if(tempID == memberID) { //같은 아이디인경우
				hashSet.remove(member); // 회원 삭제
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	// 모든 회원 출력
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
