package java0903;

import java.util.Scanner;

public class 반복문02_정답 {

	public static void main(String[] args) {
		
		// 10보다 작은수를 입력한다면 반복
		// 10보다 큰 수를 입력한다면 종료!
		
//		if(true) {
//			System.out.println("열공");
//		}
		
		
		System.out.println("숫자입력: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// while ==> 몇 번 반복해야 하는지 모르는 경우에 사용
		while(true) {
			if(num>10) {
				break;}
			System.out.println("숫자입력: ");
			num = sc.nextInt();
			
			
			}
		System.out.println("프로그램 종료");	
		}
		
		
		
}

