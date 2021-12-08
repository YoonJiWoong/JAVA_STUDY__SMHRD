import java.util.Scanner;

public class _0908_Q1_1247 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("n ют╥б : ");
		System.out.println();
		// 1 2 3 4 5 6
		int input = scanner.nextInt();
		int num = 1;
		for(int i=0; i<input; i++)
		{
			
			num = num + i;
			System.out.print(" " + num +" ");

	}

}
}