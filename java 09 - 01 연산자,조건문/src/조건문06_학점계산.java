import java.util.Scanner;

public class 조건문06_학점계산 {

	public static void main(String[] args) {
		
		// 컴퓨터야~~ 너가 점수를 입력하세요. 라고 말한다면 
		// 점수를 입력할테니 너는 grade 라는 변수에 담아줘
		// 그리고 grade 가 90 이상이면 'A학점 입니다.' 를 출력하고
		// 90점 미만 grade 가 80 이상이면 'B학점 입니다'를 출력하고
		// 80점 미만 grade 가 70 이상이면 'C학점 입니다'를 출력해줘~
		
		
		System.out.println("점수를 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		// 메모리 공간 차지, 메모리 낭비(누수)
		sc.close(); // 메모리 사라짐.
		
		// 가로 갯수 
		
		
 		int grade = sc.nextInt();
		
		if (grade >= 90) {
			System.out.print("A학점입니다");
		}
		else if (grade >= 80) {
			System.out.print("B학점입니다");
		}
		else if (grade >= 70) {
			System.out.print("C학점입니다");
		}
		
		if (grade >=60 ) {
			System.out.println("D");
			// 프로그램은 위에서 아래로... 첫번째 다중IF문 이고 / 두번째 IF문 
		}
		if (grade >=50) {
			System.out.println("휴학 ㄱㄱ");
		}
	}
}

