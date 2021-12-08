
public class 메소드응용1_1 {

	public static void main(String[] args) {

		// 2. 입력된 숫자의 약수들을 알려주는 메소드
		// 메소드 이름 : getDivisors
		// 입력인자 (매개변수) : 정수 1개
		// 반환타입 (리턴타입) : 정수형 배열

		// 메소드 호출
		int base = 10;
		int[] result_array = getDivisors(base);
		for (int i = 0; i < result_array.length; i++) {
			System.out.print(result_array[i] + " ");
		}

	}

	// public 광범위?
	// private 메소드가 정의되어 있는 곳
	
	private static int[] getDivisors(int base) {
		// 10의 약수를 구하려면 1부터 10까지 숫자를 올려가면서 나눗셈

		int count1 = 0;
		int arrayindex = 0;
		for (int i = 1; i <= base; i++) {
			if (base % i == 0) {
				arrayindex++;
			}
		}

		int array[] = new int[arrayindex];

		for (int j = 1; j <= base; j++) {
			if (base % j == 0) {
				array[count1] = j;
				count1++;
			}
		}
		return array;
	}
}
