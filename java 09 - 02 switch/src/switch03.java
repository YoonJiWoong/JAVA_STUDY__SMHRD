import java.util.Scanner;

public class switch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int c = 800;
		int w = 500;
		int vw = 1500;
		System.out.println("�޴��� ������ 1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��)");
		
        int a = sc.nextInt();	   
 		
		if (a == 1) {
			System.out.println("�Ž������� :" + (money-c));
		}
		else if (a ==2) {
			System.out.println("�Ž������� :" + (money-w));
		}
		else if (a == 3) {
			System.out.println("�Ž������� :" + (money-vw));
		}
	}
	
}
