package java0903;

import java.util.Scanner;

public class �ݺ���02_���� {

	public static void main(String[] args) {
		
		// 10���� �������� �Է��Ѵٸ� �ݺ�
		// 10���� ū ���� �Է��Ѵٸ� ����!
		
//		if(true) {
//			System.out.println("����");
//		}
		
		
		System.out.println("�����Է�: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// while ==> �� �� �ݺ��ؾ� �ϴ��� �𸣴� ��쿡 ���
		while(true) {
			if(num>10) {
				break;}
			System.out.println("�����Է�: ");
			num = sc.nextInt();
			
			
			}
		System.out.println("���α׷� ����");	
		}
		
		
		
}

