import java.util.Scanner;

public class ���ǹ�04_�ݿø� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�:");
		int number = sc.nextInt();
		
		int oneJali = number %10; 
		if(oneJali>=5) { // 10���� �������� �������� 5���� ũ��? �۳�?�� ���� �ݿø�
			number = (number-oneJali)+10; // �ݿø�, ���� ���ڿ� �������� ���� +10
		}
		else {
			number = number-oneJali; // �ݿø�, ���� ���ڿ� �׳� �������� ����
		}
		System.out.println("�ݿø� ��" + number);
		//if(number % 10 >= 5) {
			//System.out.println("�ݿø� ��" + (number - number % 10 +10));
		
		//else {
			//System.out.println("�ݿø� ��" + (number - number % 10 ));
		
			
	}
}