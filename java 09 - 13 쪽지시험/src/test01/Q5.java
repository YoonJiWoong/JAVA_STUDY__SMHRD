package test01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	
		while (true) {
			System.out.print("id :");
			String input_id = sc.next();
			System.out.print("pw :");
			String input_pd = sc.next();
			if (input_id.equals("dldmsql") && input_pd.equals("1214")) {
				System.out.println("dldmsql�� ȯ���մϴ�.!");
				break;
			}
			System.out.println("�ٽ�Ȯ���ϼ���");

		}
	}

}
