
public class _0915_Q2_������ڱ��ϱ� {

	public static void main(String[] args) {

		System.out.println(getMiddle("hello"));

	}

	private static String getMiddle(String middle) {

		// ���ڿ��� ���̸� ���ϴ� ���� length

		int length = middle.length();

		if (length % 2 == 0) {

			return middle.substring(length / 2 - 1, (length / 2) + 1);

		}

		else {

			return middle.substring(length / 2, (length / 2) + 1);

		}

	}

}
