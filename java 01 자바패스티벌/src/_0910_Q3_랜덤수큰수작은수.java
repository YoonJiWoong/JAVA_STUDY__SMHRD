import java.util.Random;

public class _0910_Q3_������ū�������� {

	public static void main(String[] args) {

		Random rd = new Random();

		int array[] = new int[8];

		for (int i = 0; i < array.length; i++) {

			array[i] = rd.nextInt(100);

		}

		System.out.print("�迭�� ��� ��: ");

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}

		// array i �� array i+1���� ũ�� �ڸ��� �ٲ�. �̰� 7�� �ݺ���

		// �� ó������ ������. �׷��� ���� 6�� �ؾ���

		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

				}
			}
		}
		System.out.println();

		// 7��° ���ڰ� ���� ū���� 0��° ���ڰ� ���� ��������

		System.out.println("���� ū �� : " + array[7]);
		System.out.println("���� ���� �� :" + array[0]);
	}
}
