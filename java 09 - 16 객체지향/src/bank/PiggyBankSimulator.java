package bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		PiggyBank piggy = new PiggyBank();
		
		while(true){
	
		System.out.println("===���������� �ùķ�����===");
		System.out.println("[1]�Ա��ϱ�[2]����ϱ�[3]�ܾ�Ȯ��");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("������ �ݾ� �Է� : ");
			int input_money = sc.nextInt();
			int reuslt_money=piggy.deposit(input_money);
			System.out.println("���� ������ �ݾ� :"+reuslt_money);
		}else if(choice==2) {
			System.out.println("����� �ݾ� �Է�");
			int outmoney = sc.nextInt();
			boolean result = piggy.withDraw(outmoney);
			
			if(result == true) {
				System.out.println("��ݼ���");
			}else {
				System.out.println("��ݽ���");
			}
			int a = piggy.getMoney();
			System.out.println("���� ������ �ݾ� : "+a);
			
			
		}else if(choice==3) {
			int m = piggy.getMoney();
			System.out.println("���� ������ �ݾ� : "+m);
			
		}
		}
		
	}
}
