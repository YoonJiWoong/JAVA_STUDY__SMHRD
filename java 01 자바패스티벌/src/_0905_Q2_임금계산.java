import java.util.Scanner;

public class _0905_Q2_�ӱݰ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int money = 0;
		if(input >8) {
			money = (int)((input-8)*5000*1.5+40000);
			System.out.println("�� �ӱ���"+ money +"�Դϴ�.");
		}
		else if (input <=8) {
			money = input * 5000;
			System.out.println("�� �ӱ���"+money+"�Դϴ�.");
		}
			
	}

}
