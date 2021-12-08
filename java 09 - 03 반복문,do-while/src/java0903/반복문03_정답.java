package java0903;

import java.util.Scanner;

public class 반복문03_정답 {

	public static void main(String[] args) {

		// 컴퓨터야 내가 숫자 두 개를 입력하고 싶으니 너는
		// A입력, B입력이라고 출력을 해준다면
		// 각각 숫자를 넣어줄게 그리고 너는 그 숫ㅈ를 A-B 로 출력해주면 되
		// 위의 과정을 계속해서 반복하되
		// 그런데 만약 A와B에 0,0을 입력하면 -> 프로그램 종료시켜줘
		
		Scanner sc = new Scanner(System.in);
		
		int numA=1;
		int numB=1;
		
		
		while(true) {
		//while -> 몇번 반복해야하는지 모를때
			
			if(numA==0 && numB==0) {
				break;
			}
		System.out.print("A입력>>");
		numA = sc.nextInt();
		
		System.out.print("B입력>>");
		numB = sc.nextInt();
		
		System.out.println("결과>>"+(numA-numB));
		
		
		
		}
		
		
	}

}
