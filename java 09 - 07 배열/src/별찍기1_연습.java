
public class �����1_���� {

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
			// ������ : up <= 3 && down >=1 �ᵵ �ǳ���?
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
