import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		
		//���� �Է¹޾� ��, ����, ����, �ܿ� �� �´� ������ ���
		// �ܿ� = 12,1,2
		// �� = 3,4,5
		// ���� = 6,7,8
		// ���� = 9,10,11
		
		System.out.println("���� �Է����ּ���>>");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		//ctrl + alt + ����� (������ ���� �Ҷ�)
		
		//case 12,1,2:
			//System.out.println("�ܿ�");
		//case 1:
		//case 2:
		//case 3:
			//System.out.println("�ܿ�");
		//�ּ� : ��Ʈ�� ������
			
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
	
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
			System.out.println("����");
			break;
		case 10:
			System.out.println("����");
			break;
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("1~12������ ���ڸ� �Է����ּ���");
			//ctrl + alt + ����� : ������ ����� ���
			// defalut �� �߰��� ���ٸ� �� ���ǰ��� �Է������� �ٽ� 
		
		}
			
	}

}
