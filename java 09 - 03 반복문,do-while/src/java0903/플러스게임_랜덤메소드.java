package java0903;

import java.util.Random;
import java.util.Scanner;

public class 플러스게임_랜덤메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 선택에 따라서 덧셈게임 또는 뺄셈 게임이 되도록 해보자
		Random random = new Random();
		System.out.println("== Plus&Minus Game ==");
		Scanner sc = new Scanner(System.in);
		String yesOrNo;
		do {
			System.out.println("1.[덧셈] 2.[뺄셈]>>");

			int choice = sc.nextInt();

			int num1 = random.nextInt(100) + 1; //+1 을 해줘서 0~99가 아니라 1~100
			int num2 = random.nextInt(100) + 1;

			if (choice == 1)
				System.out.print(num1 + "+" + num2 + "=");
			else if (choice == 2)
				System.out.println(num1 + "-" + num2 + "=");

			int input = sc.nextInt(); // 정수 입력

			if (choice == 1) {
				if (num1 + num2 == input) {
					System.out.println("성공");
				} else {
					System.out.println("실패");
				}
			} else if (choice == 2) {
				if (num1 - num2 == input) {
					System.out.println("성공");
				} else {
					System.out.println("실패");
				}

			}
			System.out.println("계속하시곘습니까?(Y/N)");
			yesOrNo = sc.next();

		} while (yesOrNo.equals("Y") || yesOrNo.equals("y"));
	}
}
//리팩토링
