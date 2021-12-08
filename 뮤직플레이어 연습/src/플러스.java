import java.util.Random;
import java.util.Scanner;

public class ÇÃ·¯½º {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Random rd = new Random();
		int count = 1;
		
		while(true) {
			int a = rd.nextInt(10)+1;
			int b = rd.nextInt(10)+1;
			System.out.print(a+"+"+b+"=");
			int c = sc.nextInt();
			
			if(a+b==c) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail");
				count++;
			}
			
			if(count == 5) {
				System.out.println("game over");
				break;
			}
			
			
		}
		
		
	}

}
