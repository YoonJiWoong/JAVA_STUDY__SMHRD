import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		String input = sc.next();
		System.out.println(a(input));

	}

	public static String a(String b) {

		int length = b.length();

		if (length % 2 == 0) { // abcd -> /2�ϸ� 2�̴ϱ� 0~3�̿��� 1�� ���;��ϴ�.../�̻�~�̸�

			return b.substring(length / 2-1, length / 2 +1);

		} else { // abc (012 �̴ϱ� 1�� �ؼ� 2+1��)
			return b.substring(length/2,length/2 + 1);

		}

	}

}
