import java.util.Scanner;

public class 조건문05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("일한 시간 입력하세요 :");
		int time = sc.nextInt();
		if(time<8) {
			System.out.println("총 임금은 :" + (time * 5000));
		}
		else {
			System.out.println("총임금은 :" + (40000 + (time - 8)*7500));
	}
	}
}

