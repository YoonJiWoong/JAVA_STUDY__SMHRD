import java.util.Scanner;

public class _0906_Q1_����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int input = sc.nextInt();
		System.out.println();
		
		for(int num = 1; num<=input; num++)
		{
			
		for(int i = 1; i <=num; i++ )
		{
			System.out.print("*");
		}
			System.out.println();
		}
	}
}

