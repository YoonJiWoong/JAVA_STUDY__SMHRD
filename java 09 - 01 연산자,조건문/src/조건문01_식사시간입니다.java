import java.util.Scanner;

public class ���ǹ�01_�Ļ�ð��Դϴ� {

	public static void main(String[] args) {
		
		// �Ļ�ð� 1�� ~ 2�� ����
		// �Ļ�ð�(����)�� �Է� �޾Ƽ� '�Ľýð��Դϴ�.'�� ���
		// ����, ����, ȭ����! �� ����ϴ� ���α׷��� ����� �ּ���!
		
		// ��ǻ�;� �� �� ��� �ʰ� ����ٸ� ���� �ð��� �Է����ٰ�
		// �׷� �ʴ� �� �ð��� time �̶�� ������ �����
		// �׸��� time�� �ִ� ������ 1~2 ���̶�� '�Ļ�ð��Դϴ�'�� ����ϰ�
		// �ƴ϶�� '����, ����, ȭ����!' �̶�� ������ �������
		
		System.out.println("�� ��?? :");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		if (time>=1 && time<2) {
			System.out.println("�Ļ�ð� �Դϴ�");
		}
		else 
			System.out.println("����, ����, ȭ����!");
	}

}
