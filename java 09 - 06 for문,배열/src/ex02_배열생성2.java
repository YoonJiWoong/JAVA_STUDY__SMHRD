
public class ex02_�迭����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ����, ����, �� ����ֱ⸦ �ѹ��� �����غ���!
		
		// �迭 �����Ҷ� �迭�� �� ���� �˰� �ִ� ���
		// ex> 1�� : 30 2�� : 25 3�� : 28
		int[] array1 = { 10, 20, 30, 40 };
		
		
		// �� �л��� ���� ������ �������� �Ҷ�
		// �̸� ���� ���� �ּ� ������
		// �迭�� ������ ��ÿ� �迭�� �� ���� ��ȣ�� ���
		// int [] array1 = new int[5];

		// �迭�� ũ�� ���
		System.out.println("�迭��ũ�� : " + array1.length);
		// �迭 �ȿ� �ִ� �� ���
		System.out.println("�迭 �� �ҷ����� : ");
		for (int i = 0; i < array1.length; i++) { // i =4 /array1[4] ����!
			System.out.print("�迭�ǰ� : "+array1[i] + " ");
		}
	}
}
