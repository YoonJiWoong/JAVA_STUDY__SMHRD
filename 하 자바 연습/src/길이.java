import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class 길이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("글자 입력");
		String input = sc.next();
		System.out.println(a(input));

	}

	public static String a(String b) {

		int length = b.length();

		if (length % 2 == 0) { // abcd -> /2하면 2이니깐 0~3이여서 1이 나와야하니.../이상~미만

			return b.substring(length / 2-1, length / 2 +1);

		} else { // abc (012 이니깐 1로 해서 2+1로)
			return b.substring(length/2,length/2 + 1);

		}

	}

}
