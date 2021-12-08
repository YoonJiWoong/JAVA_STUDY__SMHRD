import java.util.Scanner;

public class switch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("금액을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int c = 800;
		int w = 500;
		int vw = 1500;
		System.out.println("메뉴를 고르세요 1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)");
		
        int a = sc.nextInt();	   
 		
		if (a == 1) {
			System.out.println("거스름돈은 :" + (money-c));
		}
		else if (a ==2) {
			System.out.println("거스름돈은 :" + (money-w));
		}
		else if (a == 3) {
			System.out.println("거스름돈은 :" + (money-vw));
		}
	}
	
}
