import java.util.Scanner;

public class 메소드문제1_정수입력과차 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = getValue(num1, num2);
		System.out.println("결과확인 : " + result);

	}

	public static int getValue(int num1, int num2) {

		int result = num1 - num2;
		if (result < 0) {
			result = -result;
			// result *= -1; 이런 방법도 있다!
			return result;
		}
			
		if(result>0) {
			return result;
	}else
	return result;
		}
	

		
	}


