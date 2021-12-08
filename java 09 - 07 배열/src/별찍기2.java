
public class º°Âï±â2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		* 123
//		@ 321
//		@321
//		*123
		for (int up = 1, down = 1; up <= 3; up++, down++) {
			for (int a = 0; a < up; a++) {
				System.out.print("*");
			}
			for (int b = 3; b > down; b--) {
				System.out.print(" ");
			}
			for (int b = 3; b > down; b--) {
				System.out.print(" ");
			}
			for (int a = 0; a < up; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		///////////////////////////////////
		for (int up = 3, down = 0; up >= 1; up--, down++) {
			for (int a = 0; a < up; a++) {
				System.out.print("*");
			}
			for (int b = 0; b < down; b++) {
				System.out.print(" ");
			}
			for (int b = 0; b < down; b++) {
				System.out.print(" ");
			}
			for (int a = 0; a < up; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
