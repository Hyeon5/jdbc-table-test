package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberSelectView implements View {

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 아이디 입력 : ");
		String id = sc.next();
		System.out.print("조회할 회원의 암호 입력 : ");
		int pw = sc.nextInt();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMember(id, pw);
		// 모든정보 포함 / id만 포함 / null
		if(dto == null) {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		}
		else {
			if(dto.getName() == null) {				
				System.out.println("암호가 일치하지 않습니다.");
			}
			else {
				System.out.println(dto);
			}
		}
	}

}
