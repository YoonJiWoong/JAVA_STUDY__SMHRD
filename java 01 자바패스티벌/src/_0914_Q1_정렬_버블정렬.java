import java.util.Arrays;
import java.util.Scanner;

public class _0914_Q1_����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			array[i] = sc.nextInt();
		}
			// ��������
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array.length - (j + 1); k++)
					if (array[k] > array[k + 1]) {
						int temp = array[k + 1];
						array[k + 1] = array[k];
						array[k] = temp;
					}

			}
			System.out.println(Arrays.toString(array));

			
			
			
		
		
	}

}
