package ���Ǳ�;

import java.util.Scanner;

public class ���Ǳ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		���Ǳ� ven = new ���Ǳ�();

		
		System.out.print("�Ա����ּ���!");
		int a1 = sc.nextInt();
		int a2 = ven.input1(a1);
		while(true) {

		System.out.println("�޴��� �����ϼ��� ");
		System.out.println("1.Ŀ�� 2.����");
		int b1 = sc.nextInt();
		int b2 = ven.input2(b1);
		System.out.println("������ :" + b2 + "��");
		System.out.println("���̻� �������� �����Ƿ��� Y�� ��������. ����Ͻ÷��� �ƹ�Ű�� ��������");
		String y = sc.next();
		
		if(y.equals("Y")) {
			System.out.println("�Ž�����"+b2+"��");
			break;
		}
	}
	}
}
