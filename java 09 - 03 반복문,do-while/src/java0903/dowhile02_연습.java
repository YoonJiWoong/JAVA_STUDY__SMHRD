package java0903;

import java.util.Scanner;

public class dowhile02_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재몸무게 : ");
		int 현재 = sc.nextInt();
		System.out.println("목표몸무게 : ");
		int 목표 = sc.nextInt();
		int 주차 = 0;
		
		do {
			
		주차++;
		System.out.println(주차 + "주차 감량 몸무게 : ");
		int 감량 = sc.nextInt();
		현재 = 현재 - 감량;
		
	
		}while(목표 < 현재);
	System.out.println(목표+"kg 달성! 축하합니다");
		
	}

}
