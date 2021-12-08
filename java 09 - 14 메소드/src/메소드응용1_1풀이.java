import java.util.Arrays;

public class �޼ҵ�����1_1Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 100, divisor = 2;
		boolean result = isDivisor(base, divisor);
		
		if (result == true) {
			System.out.println(divisor + "��" + base + "�Ǿ���̴�.");
		} else {
			System.out.println(divisor + "��" + base + "�Ǿ���� �ƴϴ�.");
		} 
		// 2. �Էµ� ������ ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : getDivisors
		// �Է����� (�Ű�����) : ���� 1��
		// ��ȯŸ�� (����Ÿ��) : ������ �迭

		// �޼ҵ� ȣ��
		int[] result_array = getDivisors(base);
		System.out.println(Arrays.toString(result_array));
		// Arrays.toString() : �迭�� 0��°���� ���������� ���ڿ��� �������
		// ����Ʈ ��� ctrl shift o

//		for (int i = 0; i < result_array.length; i++) {
//			System.out.print(result_array[i] + " ");
//		}
		
		// 3. �Էµ� ���ڰ� �Ҽ����� �˷��ִ� �޼ҵ�  : �Ҽ� - ����� 1�� �ڽ��ڽŸ� ����� ����
		// �޼ҵ� �̸� : isPrime
		// �Է����� : 1���� ū ���� 1��
		// ��ȯŸ�� : boolean 
		
		// �޼ҵ� ȣ��
		base = 17;
		boolean result_prime=isPrime(base);
		System.out.println(result_prime);
		
		
	}

	private static boolean isPrime(int base) {
		
		return getDivisors(base).length ==2 ;
		// <=�� ��µ� 2���ϱ� == �� ���?
		
	}
	private static int[] getDivisors(int base) {
		// 10�� ����� ���Ϸ��� 1���� 10���� ���ڸ� �÷����鼭 ������

		int[] array = new int[base]; // ����� ���� �迭

		int index = 0; // ����� �� ������ �˷��ִ� index

		for (int i = 1; i <= base; i++) {
			if (isDivisor(base,i)) { // ��� ����
				array[index++] = i;

			}
		}
		// return array; // �迭 ���� �̷���!

		// Arrays.copyOf(�迭, ���ϴ� ����) : �迭�� ���ϴ� ���̱��� ����
		return Arrays.copyOf(array, index);

	}
	private static boolean isDivisor(int base, int divisor) {

		return base % divisor == 0;
		
		// boolean a = base % divisor == 0; 
		// return �̷��Ե� Ǯ��
		// ���ǹ����ε� Ǯ��ô�����
		
	} //�̰� �ѹ��� Ǯ��? ����
		
}
