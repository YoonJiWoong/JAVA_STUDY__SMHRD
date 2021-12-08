
public class 별찍기1_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a1 = 1, b1 = 3, c1 = 3, d1 = 1; a1 <= 3; a1++, b1--, c1--, d1++) {
			for (int a = 0; a < a1; a++) {
				System.out.print(" ");

			}
			for (int b = 0; b < b1; b++) {
				System.out.print("*");

			}
			for (int c = 0; c < c1; c++) {
				System.out.print(" ");

			}
			for (int d = 0; d < d1; d++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int a1 = 1, b1 = 3, c1 = 3, d1 = 1; a1 <= 3 && b1>=1; a1++, b1--, c1--, d1++) {

			for (int c = 0; c < c1; c++) {
				System.out.print("*");

			}
			for (int d = 0; d < d1; d++) {
				System.out.print(" ");
			}

			for (int a = 0; a < a1; a++) {
				System.out.print("*");

			}
			for (int b = 0; b < b1; b++) {
				System.out.print(" ");

			}
			System.out.println();

		}
	}

}
