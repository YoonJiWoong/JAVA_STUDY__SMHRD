import java.util.Scanner;

public class _0905_Q1_�ܵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�ѱݾ� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int A = input/10000;
		int B = input%10000/5000;
		int C = (input - (A*10000) - (B*5000))/1000;
		int D = (input - (A*10000) - (B*5000) - (C*1000))/500;
		int E = (input - (A*10000) - (B*5000) - (C*1000) - (D*500))/100;
				
		System.out.println("�ܵ�"+ input +"��");
		System.out.println("10000��"+A+"��");
		System.out.println("5000��"+B+"��");
		System.out.println("1000��"+C+"��");
		System.out.println("500��"+D+"��");
		System.out.println("100��"+E+"��");
	
	}

}
