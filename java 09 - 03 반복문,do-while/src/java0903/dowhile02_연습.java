package java0903;

import java.util.Scanner;

public class dowhile02_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������� : ");
		int ���� = sc.nextInt();
		System.out.println("��ǥ������ : ");
		int ��ǥ = sc.nextInt();
		int ���� = 0;
		
		do {
			
		����++;
		System.out.println(���� + "���� ���� ������ : ");
		int ���� = sc.nextInt();
		���� = ���� - ����;
		
	
		}while(��ǥ < ����);
	System.out.println(��ǥ+"kg �޼�! �����մϴ�");
		
	}

}
