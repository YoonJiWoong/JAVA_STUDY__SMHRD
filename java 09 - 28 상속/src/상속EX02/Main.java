package ���EX02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ���� ���� ��� ���α׷� (�ﰢ��,�簢��)
		// 1. ��ü������ �����ؼ� ����
		// 2. ��� ������ ����
		// 3. �������� �̿��ؼ� Ȯ���� ���� ���α׷����� ����

		System.out.println("====���� ���� ����====");
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("[1]�ﰢ�� [2]�簢��[3]����>>");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 1. ������ �Է�
				System.out.print("�ﰢ���� �غ��� �Է����ּ���");
				double base = sc.nextDouble();
				System.out.print("�ﰢ���� ������ �Է����ּ���");
				double height = sc.nextDouble();
				// 2. �ﰢ�� ��ü ����
				Triangle t = new Triangle(base, height);
				// 3. �ﰢ���� ���� ��� �� ���
				System.out.println("�ﰢ���� ���� :" + t.calArea()); //Triangle ��� ���� �ȵ�!! ������ ���� Static ��������
	//			System.out.print("�ﰢ���� ���̴�"+new Triangle(base, height).calArea()); �̷������� �ٷ� �ᵵ �ȴ�!!

			} else if (choice == 2) {
				// 1. ������ �Է�
				// 2. �簢�� ��ü ����
				// 3. �簢���� ���� ��� �� ���
				System.out.print("�ʺ� �Է����ּ���");
				double width = sc.nextDouble();
				System.out.print("������ �Է����ּ���");
				double height = sc.nextDouble();
				Renctangle rt = new Renctangle(width, height);
				System.out.print("�ﰢ���� ���̴�" + rt.calArea()+"\n");

			} else if (choice == 3) {
				break;
			}
		}

	}

}
