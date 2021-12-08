
public class 메소드기초1_메소드정의_호출 {
	// JDK : 자바 계발 도구+실행시키기 위한 환경(JRE) / JVM : 실제 실행시켜주는
	// main 메소드 : 프로그램의 시작점(실행 시킬 수 있는 지점)
	
	public static void main(String[] args) {
		// 메소드 호출(실행)
		addNumber(100,900);
		System.out.println("Main 끝");
		// 메소드 호출(실행)
		subThreeNumber(3.5f,1.2f,0.4f);
		// double 아니라 float 타입써서 뒤에 f를 붙여야해. 안그럼 오류 난다!
		
	}
	// 컨트롤 x : 오려두기
	
	// addNumber 메소드
	// 메소드 정의
	public static void addNumber(int num1, int num2) { 
		//public static void 메소드명() // ():매개변수
		
		int result = num1 + num2;
		System.out.println(result);
		
	}
	// subNumber 메소드 : 3개의 실수를 입력받아서 뺄셈
	public static void subThreeNumber(float n1,float n2,float n3) {
		float result = n1 - n2 - n3;
		// if) int result = ~~ 썼다. 그럼 변수형이 달라서 오류난다!
		System.out.println(result);
	}
	
	
}
