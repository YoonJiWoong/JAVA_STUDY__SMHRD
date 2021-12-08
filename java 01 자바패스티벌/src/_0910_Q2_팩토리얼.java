import java.util.Scanner;

public class _0910_Q2_팩토리얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt(); // 정수 입력받기
		int factorial = 1; // 처음시작값, 1에 무엇을 곱하던 그 자신이 나옴
		for(int i=1; i<=input; i++) // 입력받은 정수만큼 반복
		{
			factorial = factorial * i; 
			// ex) 3을 입력시 반복문을 통해 i=1 일때 1 i=2일때 1*2 i=3일때 2*3 이런식으로 감.
		}
		System.out.println("출력 : "+ factorial);
	}

}
