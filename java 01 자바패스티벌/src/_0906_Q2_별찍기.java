import java.util.Scanner;

public class _0906_Q2_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int input = sc.nextInt();
		System.out.println();
		for(int num=input; num>=0; num--)
		{	
		for(int i = num; i>=0; i--)
		{
			System.out.print("*");
			
		}
		System.out.println();
		
	}
}
}

