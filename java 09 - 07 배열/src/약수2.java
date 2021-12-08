import java.util.Scanner;

public class 약수2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나머지가 0, 나누어 떨어지는거 : 약수

		for (int i = 2; i <= 29; i++) {
			int number = i;
			System.out.println();
			System.out.print(+number + "의 약수 :");
			for (int a = 1; a <= number; a++) {
				if (number % a == 0)
					System.out.print(" " + a + " ");
			}
		}
	}
}
