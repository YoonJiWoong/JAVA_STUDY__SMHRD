import java.util.Scanner;

public class ���ǹ�02_�����Է� {

	public static void main(String[] args) {
		
		// 1. age ��� ������ �� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��� �ּ���>>");
		int age = sc.nextInt();
		
		// 2. ���� age ���� 20���� ũ�ų� ���ٸ� '�����Դϴ�'����ϱ�
		if(age>=20) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("��� �Դϴ�");
		}
	}

}
