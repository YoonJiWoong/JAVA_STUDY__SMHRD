import java.util.Scanner;

public class ���ǹ�05_�ӱݰ��_���� {
	
	// ��ǻ�Ͱ� �ʰ� ���� �ð� �Է� �̶�� ���ϸ� ���� ���� �ð��� �Է��Ұ�
	// �׷� �ʴ� �� ���� workTime �̶�� ������ �����
	// �׸��� workTiome �� ��� ���� 8���� ũ�ٸ�
	// 8�ð� ���ķ� ���� �ð� ���ʹ� 5000���� 1.5���� 7500������ �ñ��� �������
	// �� �Ŀ� �ʴ� �� �ϴ��� ����� �ָ��!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ѽð��Է�>>");
		int workTime = sc.nextInt();
		
		if(workTime>8) {
			int resultMoney = (int)(8*5000 + (workTime-8)*5000*1.5);
			// �Ҽ��� int ������. �Ǽ���  - (int) ���� ����ȯ ���ִ°�
			System.out.println("�� �ӱ� :" + resultMoney);
		}
		else {
			int resultMoney2 = workTime*500;
			System.out.println("���ӱ� :" +resultMoney2);
		}
	
	}
}
