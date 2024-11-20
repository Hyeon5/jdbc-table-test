package main;

import java.util.Scanner;

import view.MemberDeleteView;
import view.MemberInsertView;
import view.MemberSelectListView;
import view.MemberSelectView;
import view.View;

public class MemberMain {

	public static void main(String[] args) {
		View view = null;//new View하위클래스객체();
		while(true) {
		System.out.println("회원관리 프로그램 메뉴");
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 탈퇴");
		System.out.println("4. 내 정보 조회");
		System.out.println("5. 회원 리스트 조회");
		System.out.println("6. 조건 조회");
		System.out.println("7. 종료");
		System.out.print(" 번호 입력 : ");
		Scanner sc = new Scanner(System.in);
		int menunumber = sc.nextInt();
		if(menunumber == 7 ) {
			System.out.println("회원관리 프로그램을 종료합니다.");
			break;
			//return; //메소드 중단하고 호출 메소드 이동
			//System.exit(0);
		}
		else if(menunumber == 1) {
			System.out.println("회원 가입을 선택하셨습니다.");
			view = new MemberInsertView();
		}
		/*else if(menunumber == 2) {
			System.out.println("회원 정보 수정을 선택하셨습니다.");
			view = new MemberUpdateView();
		}*/
		else if(menunumber == 3) {
			System.out.println("회원 탈퇴를 선택하셨습니다.");
			view = new MemberDeleteView();
		}
		else if(menunumber == 4) {
			System.out.println("내 정보 조회를 선택하셨습니다.");
			view = new MemberSelectView();
		}
		else if(menunumber == 5) {
			System.out.println("회원 리스트 조회를 선택하셨습니다.");
			view = new MemberSelectListView();
		}
		view.input();
		}//while end
	}//main end

}//class end




