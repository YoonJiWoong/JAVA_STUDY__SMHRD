import java.util.Scanner;

public class �������迭01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][]array = new int [3][2];
		// ���� ��, �ڿ��� ��
		// 3�� 2��

		Scanner sc = new Scanner(System.in);
//		
		int[][] array = new int[4][4];
		// �迭�� ����
		// array.length>>3
		// array[0].length >>4 or array[1].length �� �����ž�!

//		array[0][0] = sc.nextInt();
//		array[0][1] = sc.nextInt();
//		array[0][2] = sc.nextInt();
//		array[0][3] = sc.nextInt();
//		
//		array[1][0] = sc.nextInt();
//		array[1][1] = sc.nextInt();
//		array[1][2] = sc.nextInt();
//		array[1][3] = sc.nextInt();

		// ���� �ݺ������� array�� ���� �־��ּ���
		// 1~16 ������ ���� �־��ּ���!
		int data = 1;

		// ���� �ǹ��ϴ� �ݺ���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				array[i][j] = data;
				data++;
			}
		}

		System.out.println("�迭��");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				System.out.print(array[i][j] + " ");

			}
		}

	}

}
