import java.util.Scanner;

public class _0907_Q2_두자리수계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 두 숫자 입력
		System.out.print("첫 번째 숫자 입력>>");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int second = sc.nextInt();
		// 한줄이동 : 알트 방향키
		// 두 기능 다 블럭을 씌운채로 실행시키면 두칸씩...
		System.out.println(first * (second%10));
		System.out.println(first * (second%100-second%10)/10);
		//System.out.println(first * (second%100/10));
		System.out.println(first * (second/100));
		System.out.println(first * second);
	}

}
