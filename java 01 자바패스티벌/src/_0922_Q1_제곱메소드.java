
public class _0922_Q1_제곱메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);

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
