import java.util.Random;

public class 배열1_배열중짝수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 크기가 10인 정수형 배열 선언
		int[] array1 = new int[10];

		// 임의의 값으로 배열 초기화
		Random rd = new Random();

		// 반복문을 활용해서 각각의 값을 초기화
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100);
		}
		// 짝수 출력
		// 짝수는 2로 나눈 나머지가 0인것만 출력
		System.out.print("array에 들어있는 짝수는");
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) { // 짝수
				System.out.print(" " + array1[i] + " ");
			}

		}
		System.out.println("입니다");
	}

}
