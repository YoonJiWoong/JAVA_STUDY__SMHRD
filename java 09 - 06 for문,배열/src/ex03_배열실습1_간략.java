import java.util.Random;

public class ex03_�迭�ǽ�1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // ũ�Ⱑ 10�� ������ �迭 ����
	      int [] array1 = new int[10];

	      // ������ �ڸ��� 0 ~ 19 ������ ������ ���� ����ֱ�
	      Random rd = new Random();

	      for(int i = 0; i < array1.length; i++) {
	         array1[i] = rd.nextInt(20);
	      }


	      // ������ �迭�� �� ����ϱ�
	      for(int i = 0 ; i < array1.length; i++) {
	         System.out.print(array1[i]+" ");
	      }
	}

}
