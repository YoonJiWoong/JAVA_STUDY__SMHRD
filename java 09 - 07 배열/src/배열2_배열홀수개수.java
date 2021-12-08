import java.util.Random;

public class 배열2_배열홀수개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		int[] array1 = new int[10];

		Random rd = new Random();

		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}

		// 배열 안에 값 중 홀수 출력
		// 누적을 통해서 홀수의 갯수를 셈
		int count = 0;
		System.out.print("array에 들어있는 홀수는");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 != 0) { // array1[i] %2 == 1
				System.out.print(" " + array1[i] + " ");
				// 홀수의 개수를 셀 변수에 +1
				count = count + 1; // count++;
			}

		}
		//홀수의 갯수 출력
		System.out.print("이며,\n총 " + count + "개 입니다.");
		//\n 내려쓰기
	}

}
