import java.util.Scanner;

public class ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		System.out.println();
		System.out.print(number + "�� ��� :");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.print(i + " ");
		}

	}

}
