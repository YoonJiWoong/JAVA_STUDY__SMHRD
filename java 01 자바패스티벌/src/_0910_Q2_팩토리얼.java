import java.util.Scanner;

public class _0910_Q2_���丮�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int input = sc.nextInt(); // ���� �Է¹ޱ�
		int factorial = 1; // ó�����۰�, 1�� ������ ���ϴ� �� �ڽ��� ����
		for(int i=1; i<=input; i++) // �Է¹��� ������ŭ �ݺ�
		{
			factorial = factorial * i; 
			// ex) 3�� �Է½� �ݺ����� ���� i=1 �϶� 1 i=2�϶� 1*2 i=3�϶� 2*3 �̷������� ��.
		}
		System.out.println("��� : "+ factorial);
	}

}
