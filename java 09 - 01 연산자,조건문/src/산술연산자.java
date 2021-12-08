


public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 7;
		float num3 = 10.0f;
		double num4 = 7.0; // 자바에서 실수는 기본적으로 double 타입으로 인식
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
		
		// 문자열 타입 다루기
		String str1 = "10"; //String -> 사용자
		String str2 = "7";
		System.out.println(str1 +str2);
		System.out.println(num1 +str1); // 형변환 -> 숫자 num1이 문자열로 변환
		
		//내가
		//int num = 456;
		//System.out.print("결과확인 :");
		//System.out.print(num / 100 + "00");
		
		//정답 10의 자리 숫자 없애기
		//int number = 456;
		//System.out.println(number-number%100);
		//System.out.println(number/100*100); 
		//System.out.println(number/100+"00");
		
		//오렌지 박스 구하기
		int orange = 3729;
		int sizeOfBox = 52;
		
		int boxCount = orange/sizeOfBox;
		
		System.out.print("김모씨가 귤 박스를 줄 수 있는 박스의 수는:"+boxCount);
		
		int i = 2;
		System.out.println(++i);
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
	}

}
