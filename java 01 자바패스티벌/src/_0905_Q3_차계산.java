import java.util.Random;
import java.util.Scanner;

public class _0905_Q3_����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A�Է�>>");
		int a = sc.nextInt();
		System.out.print("B�Է�>>");
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("���" + c);

		do {
			System.out.print("A�Է�>>");
			a = sc.nextInt();
			System.out.print("B�Է�>>");
			b = sc.nextInt();
			c = a - b;
			System.out.println("��� >> " + c);

		} while (a != 0 && b != 0);
		System.out.println("����");
	}
}