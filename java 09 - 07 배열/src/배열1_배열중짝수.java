import java.util.Random;

public class �迭1_�迭��¦�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ũ�Ⱑ 10�� ������ �迭 ����
		int[] array1 = new int[10];

		// ������ ������ �迭 �ʱ�ȭ
		Random rd = new Random();

		// �ݺ����� Ȱ���ؼ� ������ ���� �ʱ�ȭ
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}
		// ¦�� ���
		// ¦���� 2�� ���� �������� 0�ΰ͸� ���
		System.out.print("array�� ����ִ� ¦����");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) { // ¦��
				System.out.print(" " + array1[i] + " ");
			}

		}
		System.out.println("�Դϴ�");
	}

}
