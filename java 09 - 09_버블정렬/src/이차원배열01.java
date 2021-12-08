import java.util.Scanner;

public class 이차원배열01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][]array = new int [3][2];
		// 앞이 행, 뒤에가 열
		// 3행 2열

		Scanner sc = new Scanner(System.in);
//		
		int[][] array = new int[4][4];
		// 배열의 길이
		// array.length>>3
		// array[0].length >>4 or array[1].length 다 같은거야!

//		array[0][0] = sc.nextInt();
//		array[0][1] = sc.nextInt();
//		array[0][2] = sc.nextInt();
//		array[0][3] = sc.nextInt();
//		
//		array[1][0] = sc.nextInt();
//		array[1][1] = sc.nextInt();
//		array[1][2] = sc.nextInt();
//		array[1][3] = sc.nextInt();

		// 이중 반복문으로 array의 값을 넣어주세요
		// 1~16 까지의 값을 넣어주세요!
		int data = 1;

		// 행을 의미하는 반복문
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				array[i][j] = data;
				data++;
			}
		}

		System.out.println("배열값");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				System.out.print(array[i][j] + " ");

			}
		}

	}

}
