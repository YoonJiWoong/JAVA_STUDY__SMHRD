package test01;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ѽð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		int pay = 0;
		if(time >8) {
			pay = 5000*8+(time-8)*(int)(5000*1.5);
		}else
			pay = 5000 * time;
		
		
		
		System.out.println("�� �ӱ���"+pay+"�� �Դϴ�.");
		
	}

}
