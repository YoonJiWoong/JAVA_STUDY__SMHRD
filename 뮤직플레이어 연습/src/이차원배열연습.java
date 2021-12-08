import java.util.Scanner;

public class 이차원배열연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int input = sc.nextInt();
		int num = 1;
		int array[][] = new int[input][input];
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[1].length; j++) {
				array[i][j] = num++;

			}

		}
//		00 01 02 03 04
//		14 13 12 11 10
//		20 21 22 23 24

		for (int i = 0; i < array.length; i++) {
			if(i%2 == 0) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j] + " ");
					
				}
				System.out.println();
				
			}else {
				for (int k = array.length - 1; k >= 0; k--) {
					System.out.print(array[i][k] + " ");
				}
				System.out.println();
				
			}

		}

	}

}
