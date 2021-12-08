package bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		PiggyBank piggy = new PiggyBank();
		
		while(true){
	
		System.out.println("===돼지저금통 시뮬레이터===");
		System.out.println("[1]입금하기[2]출금하기[3]잔액확인");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("저금할 금액 입력 : ");
			int input_money = sc.nextInt();
			int reuslt_money=piggy.deposit(input_money);
			System.out.println("현재 누적된 금액 :"+reuslt_money);
		}else if(choice==2) {
			System.out.println("출금할 금액 입력");
			int outmoney = sc.nextInt();
			boolean result = piggy.withDraw(outmoney);
			
			if(result == true) {
				System.out.println("출금성공");
			}else {
				System.out.println("출금실패");
			}
			int a = piggy.getMoney();
			System.out.println("현재 누적된 금액 : "+a);
			
			
		}else if(choice==3) {
			int m = piggy.getMoney();
			System.out.println("현재 누적된 금액 : "+m);
			
		}
		}
		
	}
}
