import java.util.Scanner;

public class ���ǹ�06_������� {

	public static void main(String[] args) {
		
		// ��ǻ�;�~~ �ʰ� ������ �Է��ϼ���. ��� ���Ѵٸ� 
		// ������ �Է����״� �ʴ� grade ��� ������ �����
		// �׸��� grade �� 90 �̻��̸� 'A���� �Դϴ�.' �� ����ϰ�
		// 90�� �̸� grade �� 80 �̻��̸� 'B���� �Դϴ�'�� ����ϰ�
		// 80�� �̸� grade �� 70 �̻��̸� 'C���� �Դϴ�'�� �������~
		
		
		System.out.println("������ �Է��ϼ��� >> ");
		Scanner sc = new Scanner(System.in);
		// �޸� ���� ����, �޸� ����(����)
		sc.close(); // �޸� �����.
		
		// ���� ���� 
		
		
 		int grade = sc.nextInt();
		
		if (grade >= 90) {
			System.out.print("A�����Դϴ�");
		}
		else if (grade >= 80) {
			System.out.print("B�����Դϴ�");
		}
		else if (grade >= 70) {
			System.out.print("C�����Դϴ�");
		}
		
		if (grade >=60 ) {
			System.out.println("D");
			// ���α׷��� ������ �Ʒ���... ù��° ����IF�� �̰� / �ι�° IF�� 
		}
		if (grade >=50) {
			System.out.println("���� ����");
		}
	}
}

