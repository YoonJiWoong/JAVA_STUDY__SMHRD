package java0903;

import java.util.Scanner;

public class dowhile02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재몸무게 : ");
		int nowkg = sc.nextInt();
		
		System.out.println("목표 몸무게 : ");
		int wantkg = sc.nextInt();
		
		int week=1; // 몇주차인지 알기 위한 변수
		do {
			// 살빼는 로직
			System.out.println(week + "주차 감량 몸무게");
			int losskg = sc.nextInt();
			nowkg = nowkg - losskg; // 현재몸무게 변경
			week++;
			
		}while(nowkg>=wantkg);
		System.out.println(nowkg+"kg 달성 축하합니다.");
	}
	}


