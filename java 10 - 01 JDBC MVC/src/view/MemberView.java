package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.ModelVO;

public class MemberView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("==회원관리프로그램==");
		
		while(true) {
			System.out.println("1.회원가입  2.회원정보수정  3.회원삭제  4.전체회원정보  5.특정회원정보  6.종료" );
			System.out.print("메뉴선택 >>");
			int menu = sc.nextInt();
			if (menu ==1) {
				System.out.println("==회원가입==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				
				MemberDAO dao = new MemberDAO();
				int cnt = dao.insert(id, pw, nick);
				if(cnt>0) {
					System.out.println("입력성공");
				}else {
					System.out.println("입력실패");
				}
				
			}else if (menu ==2) {
				
			}else if (menu ==3) {
				
			}else if (menu ==4) {
				
				MemberDAO dao= new MemberDAO();
				ArrayList<ModelVO> al = dao.selectAll();
				
				for(int i =0; i<al.size(); i++) {
					System.out.println(al.get(i).getNick());
				}
					
				
				
			}else if (menu ==5) {
				
			}else if (menu ==6) {
				break;
			}
				
		
		}
		
		
		
		
	}

}
