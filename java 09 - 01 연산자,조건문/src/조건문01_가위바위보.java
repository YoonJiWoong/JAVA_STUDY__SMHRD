import java.util.Scanner;

public class ���ǹ�01_���������� {

	public static void main(String[] args) {

		// ���� ���� ��
		// 1. ����, ����, �� Scanner�� ���ؼ� string ������ user��� ������ ����ּ���!

		System.out.print("���� ,����, �� �Է�>>");

		Scanner sc = new Scanner(System.in);
		String user = sc.next();

		if (user.equals("����")) // ���� ����ڰ� �ָ� �Է� �ߴٸ� '�¸�'��� ���
		{
			System.out.println("�¸�!");
		} else if (user.equals("����")) {
			System.out.println("�й�");
			// System.out.println("user :"+ user);

		} else if (user.equals("��")) {
			System.out.println("�й�");
		} else {
			System.out.println("����,����,���� ��Ȯ�ϰ� �Է����ּ���");
	}
}
}
