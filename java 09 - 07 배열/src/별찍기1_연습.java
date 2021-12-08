
public class 별찍기1_연습 {

	public static void main(String[] args) {
		// ***@@@*
		// @**@@**
		// @@*@***
		for (int up = 1, down = 3; up <= 3; up++, down--) 
				{
			for (int a = 1; a <= up; a++) {
				System.out.print(" ");

			}
			for (int b = 1; b <= down; b++) {
				System.out.print("*");

			}
			for (int c = 1; c <= down; c++) {
				System.out.print(" ");

			}
			for (int d = 1; d <= up; d++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int up = 1, down = 3; up <= 3 ; up++, down--) {
			// 조건을 : up <= 3 && down >=1 써도 되나요?
			for (int c = 1; c <= down; c++) {
				System.out.print("*");

			}
			for (int d = 1; d <= up; d++) {
				System.out.print(" ");
			}

			for (int a = 1; a <= up; a++) {
				System.out.print("*");

			}
			for (int b = 1; b <= down; b++) {
				System.out.print(" ");

			}
			System.out.println();

		}
	}
}
