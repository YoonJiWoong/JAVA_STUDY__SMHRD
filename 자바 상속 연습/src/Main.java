import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 삼각형, 사각형 넓이 구하면
		Scanner sc = new Scanner(System.in);
		System.out.println("====도형 넓이 계산기====");
		System.out.println("1.삼각형, 2.사각형 3.종료");
		int input = sc.nextInt();
		if (input == 1) {
			
			System.out.println(삼각형.getName()+"밑변 입력");
			double 밑변 = sc.nextDouble();
			System.out.println(삼각형.getName()+"높이 입력");
			double 높이 = sc.nextDouble();
			삼각형 t = new 삼각형(밑변, 높이);
			
			System.out.println("넓이 출력"+t.넓이());

		} else if (input == 2) {
			System.out.println(삼각형.getName()+"밑변 입력");
			double 밑변 = sc.nextDouble();
			System.out.println(삼각형.getName()+"높이 입력");
			double 높이 = sc.nextDouble();
			사각형 t = new 사각형(밑변, 높이);
	
			
			
		} else if (input == 3) {
		
		}

	}

}
