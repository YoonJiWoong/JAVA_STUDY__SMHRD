import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// �ﰢ��, �簢�� ���� ���ϸ�
		Scanner sc = new Scanner(System.in);
		System.out.println("====���� ���� ����====");
		System.out.println("1.�ﰢ��, 2.�簢�� 3.����");
		int input = sc.nextInt();
		if (input == 1) {
			
			System.out.println(�ﰢ��.getName()+"�غ� �Է�");
			double �غ� = sc.nextDouble();
			System.out.println(�ﰢ��.getName()+"���� �Է�");
			double ���� = sc.nextDouble();
			�ﰢ�� t = new �ﰢ��(�غ�, ����);
			
			System.out.println("���� ���"+t.����());

		} else if (input == 2) {
			System.out.println(�ﰢ��.getName()+"�غ� �Է�");
			double �غ� = sc.nextDouble();
			System.out.println(�ﰢ��.getName()+"���� �Է�");
			double ���� = sc.nextDouble();
			�簢�� t = new �簢��(�غ�, ����);
	
			
			
		} else if (input == 3) {
		
		}

	}

}
