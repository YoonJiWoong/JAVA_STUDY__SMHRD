
public class �޼ҵ�����1_������ϱ� {

	public static void main(String[] args) {

		// 1. ��������� �˷��ִ� �޼ҵ�
		// �̸� : isDivisor
		// �Է�����(�Ű�����) : ���� 2��(������ ���ϴ� ��, ������� �˾ƺ� ����)
		// ��ȯŸ��(����Ÿ��) : ��(boolean)

		// �޼ҵ� ȣ�⸦ ���� ���� �޼ҵ� ���� �����
		// �޼ҵ� ȣ��
		int base = 10, divisor = 2;
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
	}

	private static boolean isDivisor(int base, int divisor) {

		return base % divisor == 0;
		
		// boolean a = base % divisor == 0; 
		// return �̷��Ե� Ǯ��
		// ���ǹ����ε� Ǯ��ô�����
		
	} //�̰� �ѹ��� Ǯ��? ����

}
