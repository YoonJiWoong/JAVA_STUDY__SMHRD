import java.util.Scanner;

public class switch03_���� {

	public static void main(String[] args) {

		System.out.println("�ݾ��� �Է��ϼ��� >>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // ����ڰ� ���� �ݾ�

		System.out.println("1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��)");
		int menu = sc.nextInt(); // ����ڰ� ������ �޴� ��ȣ

		int coka = 800;
		int water = 500;
		int bitaWater = 1500;

		// ����ڰ� ������ �޴��� ���� money�� �� ���� --> �ܵ�
		// ���� ����ڰ� �Է��� �ݾ��� ��ǰ�� ������ �۴ٸ�
		// '�ݾ��� �����մϴ�' -> ���x ����ڰ� �Է��� �ݾ��� ���
		if (menu == 1) {

			if (money < 800) {
				System.out.println("���� �����մϴ�");
			} else {
				money = money - coka;
			}
		} else if (menu == 2) {
			if (money < 500) {
				System.out.println("���� �����մϴ�");
			} else {
				money = money - water;
			}
		} else if (menu == 3) {
			if (money < 1500) {
				System.out.println("���� �����մϴ�");
			} else {
				money = money - bitaWater;

			}

		}

		// int money1 = money / 1000; System.out.println("�ܵ� : " + money + "��");
		// System.out.println("õ��" + money1 + "��");

		// if(money > 1000) {
//		System.out.println("õ��"+money/1000);
//		
//		int a = money/1000;
//		int b = (money-a*1000)/500;
//		int c = (money-a*1000-b*500)/100;
//	System.out.println("õ��"+a+" ��, " + "�����"+b+" �� ,"+"100��"+c+"�� ");

		// õ��¥�� �ܵ� ���� ���ϱ�

	}

}

//Crtl A ��ü ���� �Ŀ� ctrl + shift + f
