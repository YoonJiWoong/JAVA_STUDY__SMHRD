package test01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String [] fruits= {"�ڸ�","����","�ٳ���","���",};
		
		System.out.print("ã����� ���� : ");
		String a = sc.next();
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals(a)) {
				System.out.println(a+"�� ��ġ��"+(i+1)+"���� �ֽ��ϴ�.");
	
			}
			
	}
}
}