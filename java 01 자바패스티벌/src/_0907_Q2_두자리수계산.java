import java.util.Scanner;

public class _0907_Q2_���ڸ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// �� ���� �Է�
		System.out.print("ù ��° ���� �Է�>>");
		int first = sc.nextInt();
		System.out.print("�� ��° ���� �Է�>>");
		int second = sc.nextInt();
		// �����̵� : ��Ʈ ����Ű
		// �� ��� �� ���� ����ä�� �����Ű�� ��ĭ��...
		System.out.println(first * (second%10));
		System.out.println(first * (second%100-second%10)/10);
		//System.out.println(first * (second%100/10));
		System.out.println(first * (second/100));
		System.out.println(first * second);
	}

}
