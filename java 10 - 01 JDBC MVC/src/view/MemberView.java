package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.ModelVO;

public class MemberView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("==ȸ���������α׷�==");
		
		while(true) {
			System.out.println("1.ȸ������  2.ȸ����������  3.ȸ������  4.��üȸ������  5.Ư��ȸ������  6.����" );
			System.out.print("�޴����� >>");
			int menu = sc.nextInt();
			if (menu ==1) {
				System.out.println("==ȸ������==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				
				MemberDAO dao = new MemberDAO();
				int cnt = dao.insert(id, pw, nick);
				if(cnt>0) {
					System.out.println("�Է¼���");
				}else {
					System.out.println("�Է½���");
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
