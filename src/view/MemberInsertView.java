package view;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberInsertView implements View {

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("암호 입력 : ");
		int pw = sc.nextInt();
		System.out.print("폰번호 입력(국번(4)-전번(4) : ");
		String phone = "010-" + sc.next();
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setPw(pw);
		dto.setPhone(phone);
		dto.setEmail(email);
		
		MemberDAO dao = new MemberDAO();
		String result = dao.insertMember(dto);
		System.out.println(result);
		/*1. 가입정보 
		아이디
		이름
		암호
		폰
		이메일
키보드 입력 

-> MemberDTO 
		
		-> MemberDAO:insertMember(MemberDTO) -> 저장
*/
	}

}
