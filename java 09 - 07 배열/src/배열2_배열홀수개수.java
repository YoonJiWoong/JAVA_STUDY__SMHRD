import java.util.Random;

public class �迭2_�迭Ȧ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		int[] array1 = new int[10];

		Random rd = new Random();

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}

		// �迭 �ȿ� �� �� Ȧ�� ���
		// ������ ���ؼ� Ȧ���� ������ ��
		int count = 0;
		System.out.print("array�� ����ִ� Ȧ����");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 != 0) { // array1[i] %2 == 1
				System.out.print(" " + array1[i] + " ");
				// Ȧ���� ������ �� ������ +1
				count = count + 1; // count++;
			}

		}
		//Ȧ���� ���� ���
		System.out.print("�̸�,\n�� " + count + "�� �Դϴ�.");
		//\n ��������
	}

}
