
public class 메소드기초3_오버로딩_평균메소드 {

	public static void main(String[] args) {
		
		// 메소드 호출
		double rs = mean(60.5,75.3,98.5);
		// 결과 출력 (syso)
		System.out.println("평균 : " + rs);
		
		
		
		
	}
	// 메소드 정의 : kor, eng, math 3가지 값을 입력
	public static double mean(int kor,int eng,int math) {
	// 평균한다면 소수점 나오는게 좋으니 double
		
		double result = 0;
		result = (kor + eng + math) / (double)3;
		// 그냥 / 쓰면 무조건 정수형만 나옴!! 그래서 강제 형변환을 해주는데
		// 앞에다가 (double)를 써도 되고, 뒤에다가 (double)를 써도 되, 애초에 3.0을 쓰던가?
		return result;
	}
	
	// 메소드 중복 정의 : 같은 이름의 메소드를 정의하는 것
	// 매개변수의 데이터 타입이나 갯수가 다르게 작성해야 성립
	public static double mean(int kor,int eng,int math, int java) {
		
		double result = 0;
		result = (kor + eng + math + java ) / 4.0;
		
		
		return result;
	}
	// 각 과목점수를 실수로 입력
	public static double mean(double kor,double eng,double math) {
		
		double result = 0;
		result = (kor + eng + math ) / 3.0;
		
		
		return result;
	}
	

}
