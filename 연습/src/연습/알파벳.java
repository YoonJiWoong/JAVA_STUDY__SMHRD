package ����;

import java.util.Scanner;

public class ���ĺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------���ĺ� �� �� ���ϱ� ----------");
		System.out.print("�Է� :");
		String input = sc.nextLine();
		char array[] = input.toCharArray();
		char al[] = new char[90-64];
	
			
			int count[] = new int[90-64];
			for(int j =65; j<=90; j++) {
				for(int i=0; i<array.length; i++) {
				al[j-65]=(char)j;
				if(array[i]==al[j-65]) {
					count[i]=1+count[i];
				}
				System.out.println((char)j+" : "+count[i]);
				}
			
		}
		
			
			
	}
	}

