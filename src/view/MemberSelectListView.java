package view;

import java.util.ArrayList;
import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberSelectListView implements View {

	@Override
	public void input() {
		MemberDAO dao = new MemberDAO();
		int total = dao.getTotalCount();
		int totalPage = 0;
		int count = 3;
		if(total % count == 0) { totalPage = total / count; }
		else {totalPage = total / count + 1; }
		for(int i = 1; i <= totalPage; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(" 페이지까지 입력 가능합니다.");
		System.out.print("페이지번호 입력 : ");
		Scanner sc = new Scanner(System.in);
		int pagenumber = sc.nextInt();
		ArrayList<MemberDTO> list = dao.getMembers(pagenumber, count);
		for(MemberDTO dto : list) {
			System.out.println(dto/*.toString()*/);
		}
		
	}

}
