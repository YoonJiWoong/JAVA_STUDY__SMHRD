package ��;

import java.util.Scanner;

import ��Ʈ�ѷ�.���������;

public class ����main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		��������� ���� = new ���������();
		while(true) {
			
			System.out.println("�����ķ�!~");
			System.out.println("1.��� 2.������ 3.���� 4. ����");
			int input = sc.nextInt();
			
			if(input == 1) {
				// ���
				System.out.println(����.play());	
				
			}else if(input ==2){
				// ������
				System.out.println(����.nextPlay());		
			}else if (input ==3) {
				// ����
			}else if (input ==4) {
				// ����
			}
		}
		
		
		
	}

}
