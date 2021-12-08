
public class _0922_Q2_2진수를10진수로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "00101000";
		String array[] = str.split("");
		int num = 0;
		int ten = 0;

		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			if (array[i].equals("1")) {
				num = powerN(2, j);
				ten += num;

			}
		}

		System.out.println(str + "(2)" + "=" + ten + "(10)");

	}

	public static int powerN(int base, int n) {

		int num = base;
		if (n == 0) {
			num = 1;
		} else if (n == 1) {

			return base;
		}

		else {

			for (int i = 2; i <= n; i++) {
				num = num * base;
			}
		}
		return num;

	}

}
