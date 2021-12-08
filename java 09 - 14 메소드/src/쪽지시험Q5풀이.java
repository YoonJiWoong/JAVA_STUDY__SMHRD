import java.util.Scanner;

public class 쪽지시험Q5풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 로그인 할 수 있는 정보
		String id = "dldmsql";
		String pw = "1214";
		
		// 사용자가 입력한 로그인 정보
		String input_id = "";
		String input_pw = "";
		
		// 키보드 입력 도구
		Scanner sc = new Scanner(System.in);
		while(true) {
			// !쓰면 반대루~~
			System.out.println("id : ");
			input_id = sc.next();
			System.out.println("pw : ");
			input_pw = sc.next();
			
			if(!id.equals(input_id) || !pw.equals(input_pw)) {
				System.out.println("다시확인하세요");
			}else {
				System.out.println(id + "님 환영합니다"); // 변수명으로 글쓰기!!
				break;
			}
			
			
			
		}
		

	}

}
