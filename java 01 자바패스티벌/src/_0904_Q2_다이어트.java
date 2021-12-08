import java.util.Scanner;

public class _0904_Q2_다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 :");
		int 현재 = sc.nextInt();
		System.out.print("목표 몸무게 :");
		int 목표 = sc.nextInt();
		int 주차 = 1;
		do {
			System.out.print(주차+"주차 감량 몸무게 : ");
			주차++;
			int 감량 = sc.nextInt();
			현재 = 현재 - 감량;
			
		}while(현재>목표);
		System.out.println(목표+"kg달성 축하합니다.");
	}

}
