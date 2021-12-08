import java.util.Scanner;

public class _0907_Q1_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 : ");
		int dan = sc.nextInt();
		System.out.println("어느 수 까지 출력 : ");
		int su = sc.nextInt();
		
		System.out.println(dan+"단");
		for (int a =1; a <=su; a++)
		{
			System.out.println(dan+"*"+a+"="+(dan*a));
		}
	}

}
