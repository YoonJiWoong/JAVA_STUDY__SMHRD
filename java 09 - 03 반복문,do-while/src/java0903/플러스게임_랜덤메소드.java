package java0903;

import java.util.Random;
import java.util.Scanner;

public class �÷�������_�����޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ���ÿ� ���� �������� �Ǵ� ���� ������ �ǵ��� �غ���
		Random random = new Random();
		System.out.println("== Plus&Minus Game ==");
		Scanner sc = new Scanner(System.in);
		String yesOrNo;
		do {
			System.out.println("1.[����] 2.[����]>>");

			int choice = sc.nextInt();

			int num1 = random.nextInt(100) + 1; //+1 �� ���༭ 0~99�� �ƴ϶� 1~100
			int num2 = random.nextInt(100) + 1;

			if (choice == 1)
				System.out.print(num1 + "+" + num2 + "=");
			else if (choice == 2)
				System.out.println(num1 + "-" + num2 + "=");

			int input = sc.nextInt(); // ���� �Է�

			if (choice == 1) {
				if (num1 + num2 == input) {
					System.out.println("����");
				} else {
					System.out.println("����");
				}
			} else if (choice == 2) {
				if (num1 - num2 == input) {
					System.out.println("����");
				} else {
					System.out.println("����");
				}

			}
			System.out.println("����ϽÁٽ��ϱ�?(Y/N)");
			yesOrNo = sc.next();

		} while (yesOrNo.equals("Y") || yesOrNo.equals("y"));
	}
}
//�����丵
