// import java.util.Scanner;

public class �޼ҵ����5_�ú��ʺ�ȯ�żҵ� {

	public static void main(String[] args) {
//		// secondToHMS
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//		System.out.println("�� �Է� :");
//		int a = sc.nextInt();
//		
//		String time = secondToHMS(a);
//		System.out.println(time);
//		}

		// 2. �޼ҵ� ȣ��
		String time = secondToHMS(3850);
		System.out.println(time);

	}

	public static String secondToHMS(int second) {
		// �޼ҵ� �Է� : secondToHMS
		// �Է� : ���� Ÿ�� => �ʴ���
		// ��ȯ : ���ڿ� Ÿ�� => 0�� 0�� 0��
		// test case : 60 => 0�� 1�� 0��
//					 : 185 => 0�� 3�� 5��
//					 : 3600 => 1�� 0�� 0��
		int H = second / 3600;
		int M = second % 3600 / 60;
		int S = second % 60;
		// �ٷ� 60���� ������ ��! %3600%60�̷��ʿ� ����.
		String result = H + "��" + M + "��" + S + "��";
		return result;
	}

}
