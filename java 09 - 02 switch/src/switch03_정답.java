import java.util.Scanner;

public class switch03_정답 {

	public static void main(String[] args) {

		System.out.println("금액을 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // 사용자가 넣은 금액

		System.out.println("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)");
		int menu = sc.nextInt(); // 사용자가 선택한 메뉴 번호

		int coka = 800;
		int water = 500;
		int bitaWater = 1500;

		// 사용자가 선택한 메뉴에 따라 money의 값 변경 --> 잔돈
		// 만약 사용자가 입력한 금액이 제품의 값보다 작다면
		// '금액이 부족합니다' -> 계산x 사용자가 입력한 금액이 출력
		if (menu == 1) {

			if (money < 800) {
				System.out.println("돈이 부족합니다");
			} else {
				money = money - coka;
			}
		} else if (menu == 2) {
			if (money < 500) {
				System.out.println("돈이 부족합니다");
			} else {
				money = money - water;
			}
		} else if (menu == 3) {
			if (money < 1500) {
				System.out.println("돈이 부족합니다");
			} else {
				money = money - bitaWater;

			}

		}

		// int money1 = money / 1000; System.out.println("잔돈 : " + money + "원");
		// System.out.println("천원" + money1 + "개");

		// if(money > 1000) {
//		System.out.println("천원"+money/1000);
//		
//		int a = money/1000;
//		int b = (money-a*1000)/500;
//		int c = (money-a*1000-b*500)/100;
//	System.out.println("천원"+a+" 개, " + "오백원"+b+" 개 ,"+"100원"+c+"개 ");

		// 천원짜리 잔돈 갯수 구하기

	}

}

//Crtl A 전체 선택 후에 ctrl + shift + f
