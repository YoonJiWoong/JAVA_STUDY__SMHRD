package java0903;

import java.util.Scanner;

public class �ݺ���03_���� {

	public static void main(String[] args) {

		System.out.println("A �Է� >>");
		System.out.println("B �Է�>>");
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		while(true) {
			if(A==0 && B == 0) {
				break;
			}
			System.out.println("A �Է� >>");
			System.out.println("B �Է�>>");
			A = sc.nextInt();
			B = sc.nextInt();
		}
			System.out.println("����");
		
	}

}
