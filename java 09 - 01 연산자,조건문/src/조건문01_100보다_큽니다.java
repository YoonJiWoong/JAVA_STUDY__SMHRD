import java.util.Scanner;

public class 조건문01_100보다_큽니다 {

	public static void main(String[] args) {
		//Scanner 를 사용해서 int number => 값 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해 주세요 :");
		int number = sc.nextInt();
		
		// number 가 100보다 클때 "100보다 큽니다"
		
		if(number>100) {
			System.out.println("100보다 큽니다");
		}
		else if(number<=100 && number>90) //100보다 작거나 같고, 90보다 크다면 '90보다 큽니다'
			{
			System.out.println("90보다 큽니다.");
		}
		else if(number<=90 && number>80)
		{
			System.out.println("80보다 큽니다.");
		}
		else if(number<=80 && number>70) {
			System.out.println("70보다 큽니다.");
		}
		else if(number<=70)
			System.out.println("70보다 작거나 같습니다.");
		
	}
}


