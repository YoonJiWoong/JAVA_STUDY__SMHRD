import java.util.Scanner;

public class _0905_Q2_임금계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("일한시간을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int money = 0;
		if(input >8) {
			money = (int)((input-8)*5000*1.5+40000);
			System.out.println("총 임금은"+ money +"입니다.");
		}
		else if (input <=8) {
			money = input * 5000;
			System.out.println("총 임금은"+money+"입니다.");
		}
			
	}

}
