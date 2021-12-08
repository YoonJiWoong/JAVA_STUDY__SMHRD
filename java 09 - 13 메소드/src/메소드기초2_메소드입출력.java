
public class 메소드기초2_메소드입출력 {
		// public static int main(String[] args) 가능은 하지만 거의 안쓴다.
	public static void main(String[] args) {
		// 정수 1개를 입력하면 10의 자리 이하는 제거하는 메소드
		// 444 -> 400
		// 111 -> 100
		
		// 메소드 호출
		String rs1 = kill10(444);
		String rs2 = kill10(111);
		System.out.println("rs1 : "+ rs1);
		System.out.println("rs2 : "+rs2);
	}
	// 메소드 정의 / 애초에 리턴되는 자료형을 정해서... 애초에 서로 이야기해서 둘이 정함
	public static String kill10(int num) {
		// 정수를 입력해서 실행하면 문자열이 나온다.
		 String result = (num / 100) + "00";
		// int result1 = num-num%100;
		//System.out.println(result1);
		 return result;
		// 아무것도 안나가면 void
	}

}
