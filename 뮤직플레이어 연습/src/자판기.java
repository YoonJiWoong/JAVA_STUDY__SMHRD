import java.util.Scanner;

public class ���Ǳ� {

	public static void main(String[] args) {
		// "�޴��� ������ 1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��)"
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �־��ּ���");
		int money = sc.nextInt();
		while(true) {
		System.out.println("�޴��� �������ּ��� 1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��) ���Ḧ �������� �����Ƿ��� �ƹ� ��ư�̳� ��������" );
		int menu = sc.nextInt();
		
		if (menu == 1) {
			if (money >= 800) {
				money = money - 800;
			} else {
				System.out.println("���� �����մϴ�.");
				break;
			}
		} else if (menu == 2) {
			if (money >= 500) {
				money = money - 500;
			} else {
				System.out.println("���� �����մϴ�.");
				break;
			}

		} else if (menu == 3) {
			if (money >= 1500) {
				money = money - 1500;
			} else {
				System.out.println("���� �����մϴ�.");
				break;
			}

		} else {
			System.out.println("����");
			break;
		}

		
		}
	}

}
