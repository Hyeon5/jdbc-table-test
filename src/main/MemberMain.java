package main;

import java.util.*;

public class MemberMain {
	public static void main(String[] args) {
		while(true) {
			System.out.println("회원관리 프로그램 메뉴");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 내 정보 조회");
			System.out.println("5. 회원 리스트 조회");
			System.out.println("6. 검색 조회");
			System.out.println("7. 종료");
			System.out.println("번호 입력 : ");
			Scanner sc = new Scanner(System.in);
			int menunumber = sc.nextInt();
			if(menunumber == 7) {
				System.out.println("회원관리 프로그램을 종료합니다.");
				return; // 메소드 중단
				// System.exit(0); // 종료
			} else if(menunumber == 1){
				System.out.println("회원 가입을 선택하셨습니다.");
				//가입정보 키보드 입력 -> MemberDTO -> MemberDAO:inserMember(MemberDTO) -> 저장
				
			} else {
				System.out.println("회원관리 프로그램을 계속 보여드립니다.");
			}
		}
	}
}