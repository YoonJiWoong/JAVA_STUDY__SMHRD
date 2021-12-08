import java.util.Scanner;

public class 조건문01_가위바위보 {

	public static void main(String[] args) {

		// 가위 바위 보
		// 1. 가위, 바위, 보 Scanner를 통해서 string 변수인 user라는 변수에 담아주세요!

		System.out.print("가위 ,바위, 보 입력>>");

		Scanner sc = new Scanner(System.in);
		String user = sc.next();

		if (user.equals("바위")) // 만약 사용자가 주먹 입력 했다면 '승리'라고 출력
		{
			System.out.println("승리!");
		} else if (user.equals("가위")) {
			System.out.println("패배");
			// System.out.println("user :"+ user);

		} else if (user.equals("보")) {
			System.out.println("패배");
		} else {
			System.out.println("가위,바위,보를 정확하게 입력해주세요");
	}
}
}
