package java0903;

import java.util.Scanner;

public class dowhile02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������� : ");
		int nowkg = sc.nextInt();
		
		System.out.println("��ǥ ������ : ");
		int wantkg = sc.nextInt();
		
		int week=1; // ���������� �˱� ���� ����
		do {
			// �컩�� ����
			System.out.println(week + "���� ���� ������");
			int losskg = sc.nextInt();
			nowkg = nowkg - losskg; // ��������� ����
			week++;
			
		}while(nowkg>=wantkg);
		System.out.println(nowkg+"kg �޼� �����մϴ�.");
	}
	}


