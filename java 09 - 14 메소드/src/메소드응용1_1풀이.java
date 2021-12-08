import java.util.Arrays;

public class 메소드응용1_1풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base = 100, divisor = 2;
		boolean result = isDivisor(base, divisor);
		
		if (result == true) {
			System.out.println(divisor + "은" + base + "의약수이다.");
		} else {
			System.out.println(divisor + "은" + base + "의약수가 아니다.");
		} 
		// 2. 입력된 숫자의 약수들을 알려주는 메소드
		// 메소드 이름 : getDivisors
		// 입력인자 (매개변수) : 정수 1개
		// 반환타입 (리턴타입) : 정수형 배열

		// 메소드 호출
		int[] result_array = getDivisors(base);
		System.out.println(Arrays.toString(result_array));
		// Arrays.toString() : 배열을 0번째부터 끝번쨰까지 문자열로 만들어줌
		// 임포트 써야 ctrl shift o

//		for (int i = 0; i < result_array.length; i++) {
//			System.out.print(result_array[i] + " ");
//		}
		
		// 3. 입력된 숫자가 소수인지 알려주는 메소드  : 소수 - 약수가 1과 자시자신만 약수로 갖는
		// 메소드 이름 : isPrime
		// 입력인자 : 1보다 큰 정수 1개
		// 반환타입 : boolean 
		
		// 메소드 호출
		base = 17;
		boolean result_prime=isPrime(base);
		System.out.println(result_prime);
		
		
	}

	private static boolean isPrime(int base) {
		
		return getDivisors(base).length ==2 ;
		// <=로 썼는데 2개니깐 == 로 써야?
		
	}
	private static int[] getDivisors(int base) {
		// 10의 약수를 구하려면 1부터 10까지 숫자를 올려가면서 나눗셈

		int[] array = new int[base]; // 약수를 담을 배열

		int index = 0; // 약수가 들어갈 공간을 알려주는 index

		for (int i = 1; i <= base; i++) {
			if (isDivisor(base,i)) { // 약수 성립
				array[index++] = i;

			}
		}
		// return array; // 배열 리턴 이렇게!

		// Arrays.copyOf(배열, 원하는 길이) : 배열을 원하는 길이까지 복제
		return Arrays.copyOf(array, index);

	}
	private static boolean isDivisor(int base, int divisor) {

		return base % divisor == 0;
		
		// boolean a = base % divisor == 0; 
		// return 이렇게도 풀고
		// 조건문으로도 풀어봤던문제
		
	} //이거 한번에 풀음? ㄴㄴ
		
}
