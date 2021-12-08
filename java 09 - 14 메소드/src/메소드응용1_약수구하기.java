
public class 메소드응용1_약수구하기 {

	public static void main(String[] args) {

		// 1. 약수인지를 알려주는 메소드
		// 이름 : isDivisor
		// 입력인자(매개변수) : 정수 2개(나눔을 당하는 수, 약수인지 알아볼 숫자)
		// 반환타입(리턴타입) : 논리(boolean)

		// 메소드 호출를 먼저 쓰고 메소드 정의 만들기
		// 메소드 호출
		int base = 10, divisor = 2;
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
	}

	private static boolean isDivisor(int base, int divisor) {

		return base % divisor == 0;
		
		// boolean a = base % divisor == 0; 
		// return 이렇게도 풀고
		// 조건문으로도 풀어봤던문제
		
	} //이거 한번에 풀음? ㄴㄴ

}
