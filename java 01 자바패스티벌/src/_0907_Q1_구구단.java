import java.util.Scanner;

public class _0907_Q1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܼ� �Է� : ");
		int dan = sc.nextInt();
		System.out.println("��� �� ���� ��� : ");
		int su = sc.nextInt();
		
		System.out.println(dan+"��");
		for (int a =1; a <=su; a++)
		{
			System.out.println(dan+"*"+a+"="+(dan*a));
		}
	}

}
