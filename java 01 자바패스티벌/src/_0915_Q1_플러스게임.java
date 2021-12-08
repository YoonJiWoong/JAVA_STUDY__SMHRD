import java.util.Random;
import java.util.Scanner;

public class _0915_Q1_플러스게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		_0915_Q1_PlusGame game = new _0915_Q1_PlusGame();
		int count1=1;
		while(count1<=5) {
			
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);
			System.out.print(num1+"+"+num2+"=");
			int num3 = sc.nextInt();
			boolean count = game.plus(num1, num2, num3);
			if(count == false) {
				count1=count1+1;
			
			}
			
		}System.out.println("Game Over");
		
	}

}
