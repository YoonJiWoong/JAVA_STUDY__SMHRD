import java.util.Random;

public class ex03_�迭�ǽ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ������ �迭�� �� ����ϱ�
		Random rd = new Random(); 
		// ũ�Ⱑ 10�� ������ �迭 ����

		int [] array1 = new int[10];
		
		array1[1] = 023;
		
		// ������ �ڸ��� 0 ~ 19������ ������ ���� ���� �ֱ�

		for (int i = 0; i<array1.length; i++)
		{
		array1[i] = rd.nextInt(20) + 1;
		System.out.print("�迭�ǰ� :" + array1[i] + " ");
		
		
		}
	
	}

}
