package java0903;

import java.util.Scanner;

public class �ݺ���03_���� {

	public static void main(String[] args) {

		// ��ǻ�;� ���� ���� �� ���� �Է��ϰ� ������ �ʴ�
		// A�Է�, B�Է��̶�� ����� ���شٸ�
		// ���� ���ڸ� �־��ٰ� �׸��� �ʴ� �� ������ A-B �� ������ָ� ��
		// ���� ������ ����ؼ� �ݺ��ϵ�
		// �׷��� ���� A��B�� 0,0�� �Է��ϸ� -> ���α׷� ���������
		
		Scanner sc = new Scanner(System.in);
		
		int numA=1;
		int numB=1;
		
		
		while(true) {
		//while -> ��� �ݺ��ؾ��ϴ��� �𸦶�
			
			if(numA==0 && numB==0) {
				break;
			}
		System.out.print("A�Է�>>");
		numA = sc.nextInt();
		
		System.out.print("B�Է�>>");
		numB = sc.nextInt();
		
		System.out.println("���>>"+(numA-numB));
		
		
		
		}
		
		
	}

}
