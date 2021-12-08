import java.util.Scanner;

public class 문자열주소 {

	public static void main(String[] args) {
		// 리터럴 상수
		int num = 10; 
		float f = 3.14f;
		String s = "바나나";
		// 10, 3.14f , 바나나  이런걸 리터럴 상수라고 한다!
		String s2 = "바나나";
		// 똑같이 바나나 라고 만들었어! s도 s2도 바나나 라는 리터럴 상수의 주소값 가르켜!
		// 10도 3.14f 는 기본형으로 있어 but) String 둘다 바나나 가르켜!
		// 그래서 equals 로 하면 true 나와
		System.out.println(s==s2);
		Scanner sc = new Scanner(System.in);
		System.out.println("바나나 라고 쳐봐 false 나올거야");
		String s3 = sc.next();
		// 뭘 입력할지 모르니... 항상 새롭게 공간 할당해! 문자열 저장해!
		System.out.println(s==s3);
		// 새로운 공간에 할당하니깐 달라서 false 야, equals는 값만보고 주소안봐~그래서 써
	}

}
