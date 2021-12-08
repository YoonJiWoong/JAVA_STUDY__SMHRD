package 자판기;

public class 자판기 {

	int money;

	// 0.입금한돈
	public int input1(int m) {
		money = m;
		return money;
	}
	// 잔액 부족 확인 
	
	

	// 1. 메뉴선택
	public int input2(int m) {

		if (m == 1) {

			money = money - 500;
			System.out.println("커피 선택함");

		} else if (m == 2) {

			money = money - 1000;
			System.out.println("음료 선택함");
		} else {
			System.out.println("오류");
		}

		return money;

	}

}
