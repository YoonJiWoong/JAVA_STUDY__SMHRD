// import java.util.Scanner;

public class 메소드기초5_시분초변환매소드 {

	public static void main(String[] args) {
//		// secondToHMS
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//		System.out.println("초 입력 :");
//		int a = sc.nextInt();
//		
//		String time = secondToHMS(a);
//		System.out.println(time);
//		}

		// 2. 메소드 호출
		String time = secondToHMS(3850);
		System.out.println(time);

	}

	public static String secondToHMS(int second) {
		// 메소드 입력 : secondToHMS
		// 입력 : 정수 타입 => 초단위
		// 반환 : 문자열 타입 => 0시 0분 0초
		// test case : 60 => 0시 1분 0초
//					 : 185 => 0시 3분 5초
//					 : 3600 => 1시 0분 0초
		int H = second / 3600;
		int M = second % 3600 / 60;
		int S = second % 60;
		// 바로 60으로 나눠도 되! %3600%60이럴필요 없다.
		String result = H + "시" + M + "분" + S + "초";
		return result;
	}

}
