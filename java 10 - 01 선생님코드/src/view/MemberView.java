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
			System.out.println("1.ȸ������ 2.ȸ���������� 3.ȸ������ 4.��üȸ������ 5.Ư��ȸ������ 6.����");
			System.out.print("�޴� ���� >> ");
			int menu = sc.nextInt();
			
			if(menu==1) {
				System.out.println("==ȸ������==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				
				MemberDAO dao = new MemberDAO();
				ModelVO vo = new ModelVO(id, pw, nick);
				
				int cnt = dao.insert(vo);
				
				//6. ��� �� ó��
				if(cnt>0) {
					System.out.println("�Է¼���");
				}else {
					System.out.println("�Է½���");
				}
			}else if(menu==2) {
				System.out.println("ȸ�� ���� ����");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("1.pw, 2.nick");
				String choice = sc.next();
				System.out.print("������ DATA");
				String data = sc.next();
				
				MemberDAO dao = new MemberDAO();
				int cnt =dao.update(id, choice, data);
				
				if (cnt > 0) {
					System.out.println("��������");
				} else {
					System.out.println("��������");
				}
				
				
			}else if(menu==3) {
				System.out.println("ȸ�� ���� ����");
				System.out.print("ID : ");
				String id = sc.next();
				
				MemberDAO dao = new MemberDAO();
				int cnt = dao.delete(id);
				if (cnt > 0) {
					System.out.println("��������");
				} else {
					System.out.println("��������");
				}

				
				
			}else if(menu==4) {
				MemberDAO dao = new MemberDAO();
				ArrayList<ModelVO> al = dao.selectAll();
				
				//for_each
				//�迭, ��̸���Ʈ �ȿ� �ִ� ���� �ٷ궧 ȿ�������� ���
				//for(�迭/��̸���Ʈ  �ȿ� ����ִ� ��Ҹ� �ӽ������� ����� �̸� : �迭/��̸���Ʈ �̸�(���۷��� ������))
				for (ModelVO vo : al) {
					System.out.println("ID : "+ vo.getId());
					System.out.println("PW : "+ vo.getPw());
					System.out.println("NICK : "+ vo.getNick());
					System.out.println("===================");
				}
				
			}else if(menu==5) {
					System.out.println("== Ư�� ȸ������ ��� ==");
					System.out.print("id �Է� : ");
					String id = sc.next();
					
					MemberDAO dao = new MemberDAO();
					ModelVO vo =dao.selectOne(id);
					System.out.println("ID : "+vo.getId());
					System.out.println("PW : "+vo.getPw());
					System.out.println("NICK : "+vo.getNick());
					
				
			}else if(menu==6) {
				System.out.println("���α׷� ����!");
				break;
			}
		}

	}

}
