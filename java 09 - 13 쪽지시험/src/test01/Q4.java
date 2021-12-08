package test01;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int pay = 0;
		if(time >8) {
			pay = 5000*8+(time-8)*(int)(5000*1.5);
		}else
			pay = 5000 * time;
		
		
		
		System.out.println("총 임금은"+pay+"원 입니다.");
		
	}

}
