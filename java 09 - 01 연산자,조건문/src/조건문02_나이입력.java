import java.util.Scanner;

public class 조건문02_나이입력 {

	public static void main(String[] args) {
		
		// 1. age 라는 변수에 값 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요>>");
		int age = sc.nextInt();
		
		// 2. 만약 age 값이 20보다 크거나 같다면 '성인입니다'출력하기
		if(age>=20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("어린이 입니다");
		}
	}

}
