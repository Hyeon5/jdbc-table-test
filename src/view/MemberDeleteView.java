package view;

import java.util.Scanner;

import dao.MemberDAO;

public class MemberDeleteView implements View {

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("탈퇴할 아이디 입력 : ");
		String id = sc.next();
		System.out.print("탈퇴할 회원의 암호 입력 : ");
		int pw = sc.nextInt();
		if(id.equals("")) {
		System.out.println(":"+id+":");
		}
		MemberDAO dao = new MemberDAO();
		String result = dao.deleteMember(id, pw);
		System.out.println(result);
		
	}

}
