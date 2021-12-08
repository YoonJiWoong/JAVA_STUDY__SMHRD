import java.util.Scanner;

public class 이차원배열06_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		int[] answer = { 4, 5, 4, 1, 2 };
		int[] score = { 10, 20, 30, 20, 20 };
		int rightScore = 0;
		for (int i = 0; i < answer.length; i++) {
			System.out.print(i + 1 + "번째답 >>");
			input[i] = sc.nextInt();
		}

		for (int i = 0; i < answer.length; i++) {
			if (input[i] == answer[i]) {
				System.out.print("0" + "\t");
				rightScore = rightScore + score[i];
			}

			else {
				System.out.print("x" + " \t");
			}

		}
		System.out.println("\n총점 : " + rightScore);
	}
}
