
public class �޼ҵ�����1_1 {

	public static void main(String[] args) {

		// 2. �Էµ� ������ ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : getDivisors
		// �Է����� (�Ű�����) : ���� 1��
		// ��ȯŸ�� (����Ÿ��) : ������ �迭

		// �޼ҵ� ȣ��
		int base = 10;
		int[] result_array = getDivisors(base);
		for (int i = 0; i < result_array.length; i++) {
			System.out.print(result_array[i] + " ");
		}

	}

	// public ������?
	// private �޼ҵ尡 ���ǵǾ� �ִ� ��
	
	private static int[] getDivisors(int base) {
		// 10�� ����� ���Ϸ��� 1���� 10���� ���ڸ� �÷����鼭 ������

		int count1 = 0;
		int arrayindex = 0;
		for (int i = 1; i <= base; i++) {
			if (base % i == 0) {
				arrayindex++;
			}
		}

		int array[] = new int[arrayindex];

		for (int j = 1; j <= base; j++) {
			if (base % j == 0) {
				array[count1] = j;
				count1++;
			}
		}
		return array;
	}
}
