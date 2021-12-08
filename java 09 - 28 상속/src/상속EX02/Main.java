package 상속EX02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 도형 넓이 계산 프로그램 (삼각형,사각형)
		// 1. 객체지향을 적용해서 설꼐
		// 2. 상속 개념을 적용
		// 3. 다형성을 이용해서 확장이 쉬운 프로그램으로 설계

		System.out.println("====도형 넓이 계산기====");
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("[1]삼각형 [2]사각형[3]종료>>");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 1. 데이터 입력
				System.out.print("삼각형의 밑변을 입력해주세요");
				double base = sc.nextDouble();
				System.out.print("삼각형의 높이을 입력해주세요");
				double height = sc.nextDouble();
				// 2. 삼각형 객체 생성
				Triangle t = new Triangle(base, height);
				// 3. 삼각형의 넓이 계산 후 출력
				System.out.println("삼각형의 넓이 :" + t.calArea()); //Triangle 라고 쓰면 안되!! 변수명 쓰기 Static 오류나옴
	//			System.out.print("삼각형의 넓이는"+new Triangle(base, height).calArea()); 이런식으로 바로 써도 된다!!

			} else if (choice == 2) {
				// 1. 데이터 입력
				// 2. 사각형 객체 생성
				// 3. 사각형의 넓이 계산 후 출력
				System.out.print("너비를 입력해주세요");
				double width = sc.nextDouble();
				System.out.print("높이을 입력해주세요");
				double height = sc.nextDouble();
				Renctangle rt = new Renctangle(width, height);
				System.out.print("삼각형의 넓이는" + rt.calArea()+"\n");

			} else if (choice == 3) {
				break;
			}
		}

	}

}
