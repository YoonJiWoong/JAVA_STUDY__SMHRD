import java.util.Scanner;

public class _0905_Q3_�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		
		while(a != 0 && b!=0)
			{
			if(a==0 && b==0) {
				break;
			}
			System.out.println("A�Է�>>");
			a = sc.nextInt();
			
			System.out.println("B�Է�>>");
			b = sc.nextInt();
			
			System.out.println("���>>"+ (a-b));
			
			}
	}

}
