import java.util.Scanner;

public class ���ڿ��ּ� {

	public static void main(String[] args) {
		// ���ͷ� ���
		int num = 10; 
		float f = 3.14f;
		String s = "�ٳ���";
		// 10, 3.14f , �ٳ���  �̷��� ���ͷ� ������ �Ѵ�!
		String s2 = "�ٳ���";
		// �Ȱ��� �ٳ��� ��� �������! s�� s2�� �ٳ��� ��� ���ͷ� ����� �ּҰ� ������!
		// 10�� 3.14f �� �⺻������ �־� but) String �Ѵ� �ٳ��� ������!
		// �׷��� equals �� �ϸ� true ����
		System.out.println(s==s2);
		Scanner sc = new Scanner(System.in);
		System.out.println("�ٳ��� ��� �ĺ� false ���ðž�");
		String s3 = sc.next();
		// �� �Է����� �𸣴�... �׻� ���Ӱ� ���� �Ҵ���! ���ڿ� ������!
		System.out.println(s==s3);
		// ���ο� ������ �Ҵ��ϴϱ� �޶� false ��, equals�� �������� �ּҾȺ�~�׷��� ��
	}

}
