import java.util.Scanner;

public class ��������Q6Ǯ�� {
	public static void main(String[] args) {

		// sequential search

		String[] f = { "���", "Ű��", "����", "�ڸ�", "��󸸽�", "������" };

		Scanner sc = new Scanner(System.in);
		System.out.print("ã����� ���� : ");
		String input = sc.next();

		int findIndex = -1;
		for (int i = 0; i < f.length; i++) {
			if (input.equals(f[i])) {

				findIndex = i;
				break; // ã�Ƽ� ���ߴ°� ����!!
			}
		}
		if (findIndex == -1) {
			System.out.println("ã�� ������ �����ϴ�");
		}else {
			System.out.println(input+"�� ��ġ��"+(findIndex+1)+"��°�Դϴ�.");
		}
		// �ε��� �ѹ� Ȱ���ϱ�!!
	}
}
