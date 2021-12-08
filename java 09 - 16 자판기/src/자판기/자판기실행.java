package 자판기;

import java.util.Scanner;

public class 자판기실행 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		자판기 ven = new 자판기();

		
		System.out.print("입금해주세요!");
		int a1 = sc.nextInt();
		int a2 = ven.input1(a1);
		while(true) {

		System.out.println("메뉴를 선택하세요 ");
		System.out.println("1.커피 2.음료");
		int b1 = sc.nextInt();
		int b2 = ven.input2(b1);
		System.out.println("남은돈 :" + b2 + "원");
		System.out.println("더이상 구매하지 않으실려면 Y를 누르세요. 계속하시려면 아무키나 누르세요");
		String y = sc.next();
		
		if(y.equals("Y")) {
			System.out.println("거스름돈"+b2+"원");
			break;
		}
	}
	}
}
