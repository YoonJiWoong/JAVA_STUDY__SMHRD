import java.util.Scanner;

public class ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� 0, ������ �������°� : ���

		for (int i = 2; i <= 29; i++) {
			int number = i;
			System.out.println();
			System.out.print(+number + "�� ��� :");
			for (int a = 1; a <= number; a++) {
				if (number % a == 0)
					System.out.print(" " + a + " ");
			}
		}
	}
}
