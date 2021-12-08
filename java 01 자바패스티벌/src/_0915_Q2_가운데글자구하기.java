
public class _0915_Q2_가운데글자구하기 {

	public static void main(String[] args) {

		System.out.println(getMiddle("hello"));

	}

	private static String getMiddle(String middle) {

		// 문자열의 길이를 구하는 변수 length

		int length = middle.length();

		if (length % 2 == 0) {

			return middle.substring(length / 2 - 1, (length / 2) + 1);

		}

		else {

			return middle.substring(length / 2, (length / 2) + 1);

		}

	}

}
