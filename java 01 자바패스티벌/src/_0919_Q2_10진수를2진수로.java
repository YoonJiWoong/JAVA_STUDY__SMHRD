import java.util.Arrays;
import java.util.Scanner;

public class _0919_Q2_10������2������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� >>");
		int number = sc.nextInt();
		int Binary = 0;
		int count = 1;
		int indexNumber = number; 
		while (true) {
			indexNumber = indexNumber / 2;
				
			count++;
			if (indexNumber == 1) {
				break;
			}
		}
		// ���� �ߴ� �Ǽ� 
		// Binary = number/2
		// if(Binary = 1) - �̷���� Binary�� ��� ������ �ʴ� number�� ��� �����ִ� ���� ������ ���� ����� �����

		int i = 0;
		int array[] = new int[count];
		while (true) {
			Binary = number % 2;
			array[i] = Binary;
			number = number / 2;
			i++;
			if (number == 1) {
				array[i] = 1;
				break;
			}

		}

		for (int j = count - 1; j >= 0; j--) {// i�� �ᵵ �ȴ�
			System.out.print(array[j] + " ");
			
		}

	}

}
