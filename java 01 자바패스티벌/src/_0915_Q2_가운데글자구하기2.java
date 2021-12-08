
public class _0915_Q2_가운데글자구하기2 {

	public static void main(String[] args) {

		String input = "power";

		String result = getMiddle(input);

		System.out.println(result);

	}

	private static String getMiddle(String input) {

		String[] str = input.split("");

		String result_str = str[str.length / 2];

		if (str.length % 2 == 0) {

			result_str = str[(str.length / 2) - 1] + result_str;
			// STR[]+STR[] 된다
		}

		return result_str;

	}

}
