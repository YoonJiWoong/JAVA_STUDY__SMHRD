package java0903;

import java.util.Scanner;

public class 반복문03_연습 {

	public static void main(String[] args) {

		System.out.println("A 입력 >>");
		System.out.println("B 입력>>");
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		while(true) {
			if(A==0 && B == 0) {
				break;
			}
			System.out.println("A 입력 >>");
			System.out.println("B 입력>>");
			A = sc.nextInt();
			B = sc.nextInt();
		}
			System.out.println("종료");
		
	}

}
