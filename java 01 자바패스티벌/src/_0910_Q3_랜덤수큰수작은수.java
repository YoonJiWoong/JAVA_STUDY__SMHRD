import java.util.Random;

public class _0910_Q3_랜덤수큰수작은수 {

	public static void main(String[] args) {

		Random rd = new Random();

		int array[] = new int[8];

		for (int i = 0; i < array.length; i++) {

			array[i] = rd.nextInt(100);

		}

		System.out.print("배열의 모든 값: ");

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}

		// array i 가 array i+1보다 크면 자리를 바꿔. 이걸 7번 반복해

		// 또 처음부터 시작해. 그런데 이젠 6번 해야해

		for (int j = 1; j < array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

				}
			}
		}
		System.out.println();

		// 7번째 숫자가 가장 큰수고 0번째 숫자가 가장 작은수야

		System.out.println("가장 큰 수 : " + array[7]);
		System.out.println("가장 작은 수 :" + array[0]);
	}
}
