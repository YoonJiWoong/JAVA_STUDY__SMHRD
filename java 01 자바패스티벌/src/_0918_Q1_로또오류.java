import java.util.Random;

public class _0918_Q1_�ζǿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int array[] = new int[6]; // �ζǴ� 6�� ��ȣ �����ϱ�

		for (int i = 0; i < array.length;) {// int i = 0; i < array.length; i++ ���ָ� �߰��� i++ �������� �ߺ������Ҷ� i--��... 
			array[i] = rd.nextInt(45) + 1; // 1~45����
			
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) { //���� �迭�� ������ �� �����״�...  array[1]=array[1] ó��
					i--; // i--���ָ� �ٽ� ���������� �ٽ� ���� ��÷
				}
			}
			i++; // �ߺ� ���ٸ� i�� 1 Ŀ����, �ƴ� ���� i�� ��, i--, i==, i
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("����� ���� :" + array[i]);
		}

	}

}
