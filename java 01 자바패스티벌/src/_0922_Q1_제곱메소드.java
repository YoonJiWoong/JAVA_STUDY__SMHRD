
public class _0922_Q1_�����޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("���Ȯ�� : " + result);

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
