import java.util.Scanner;

public class 자판기 {

	public static void main(String[] args) {
		// "메뉴를 고르세요 1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)"
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 넣어주세요");
		int money = sc.nextInt();
		while(true) {
		System.out.println("메뉴를 선택해주세요 1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) 음료를 구매하지 않으실려면 아무 버튼이나 누르세요" );
		int menu = sc.nextInt();
		
		if (menu == 1) {
			if (money >= 800) {
				money = money - 800;
			} else {
				System.out.println("돈이 부족합니다.");
				break;
			}
		} else if (menu == 2) {
			if (money >= 500) {
				money = money - 500;
			} else {
				System.out.println("돈이 부족합니다.");
				break;
			}

		} else if (menu == 3) {
			if (money >= 1500) {
				money = money - 1500;
			} else {
				System.out.println("돈이 부족합니다.");
				break;
			}

		} else {
			System.out.println("종료");
			break;
		}

		
		}
	}

}
