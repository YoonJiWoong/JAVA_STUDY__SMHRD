import java.util.Scanner;

public class _0904_Q2_���̾�Ʈ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ :");
		int ���� = sc.nextInt();
		System.out.print("��ǥ ������ :");
		int ��ǥ = sc.nextInt();
		int ���� = 1;
		do {
			System.out.print(����+"���� ���� ������ : ");
			����++;
			int ���� = sc.nextInt();
			���� = ���� - ����;
			
		}while(����>��ǥ);
		System.out.println(��ǥ+"kg�޼� �����մϴ�.");
	}

}
