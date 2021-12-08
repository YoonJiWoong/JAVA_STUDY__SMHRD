import java.util.Scanner;

public class 조건문03_홀수짝수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println(number+"짝수입니다");
			// 수학에서의 비교 =
			// java 에서의 비교 ==
		}
		else {
			System.out.println(number+"홀수입니다.");
		}
	}

}
