import java.util.Scanner;

public class 시스템입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 입력: ");
		//정수 입력
		int number = sc.nextInt();
		System.out.println("입력한값 :"+ number);
	}

}
