import java.util.Scanner;

public class 약수1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
		System.out.println();
		System.out.print(number + "의 약수 :");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.print(i + " ");
		}

	}

}
