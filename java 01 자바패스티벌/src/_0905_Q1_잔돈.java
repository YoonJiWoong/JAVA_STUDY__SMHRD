import java.util.Scanner;

public class _0905_Q1_ÀÜµ· {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ÃÑ±Ý¾× ÀÔ·Â : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int A = input/10000;
		int B = input%10000/5000;
		int C = (input - (A*10000) - (B*5000))/1000;
		int D = (input - (A*10000) - (B*5000) - (C*1000))/500;
		int E = (input - (A*10000) - (B*5000) - (C*1000) - (D*500))/100;
				
		System.out.println("ÀÜµ·"+ input +"¿ø");
		System.out.println("10000¿ø"+A+"°³");
		System.out.println("5000¿ø"+B+"°³");
		System.out.println("1000¿ø"+C+"°³");
		System.out.println("500¿ø"+D+"°³");
		System.out.println("100¿ø"+E+"°³");
	
	}

}
