package test01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >>");
		int number = sc.nextInt();
		System.out.println("10으로 나눈 몫 :" + number/10);
		System.out.println("10으로 나눈 나머지 :" + number%10);
	}

}
