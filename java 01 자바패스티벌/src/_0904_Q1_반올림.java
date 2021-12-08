import java.util.Scanner;

public class _0904_Q1_반올림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자입력 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%10 > 5) {
			num = (num/10+1)*10;
		}
		else {
			num = num/10*10;
		}
		System.out.println("반올림 수"+num);
	}

}
