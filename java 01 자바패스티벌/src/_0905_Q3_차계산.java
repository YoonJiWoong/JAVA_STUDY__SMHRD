import java.util.Random;
import java.util.Scanner;

public class _0905_Q3_차계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A입력>>");
		int a = sc.nextInt();
		System.out.print("B입력>>");
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("결과" + c);

		do {
			System.out.print("A입력>>");
			a = sc.nextInt();
			System.out.print("B입력>>");
			b = sc.nextInt();
			c = a - b;
			System.out.println("결과 >> " + c);

		} while (a != 0 && b != 0);
		System.out.println("종료");
	}
}