
import java.util.Arrays;
import java.util.Scanner;

public class _0920_Q2_x입력보다작은수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >>");
		int n = sc.nextInt();
		System.out.print("X 입력 >>");
		int x = sc.nextInt();
		int array[]= new int[n];
		int j=0;
		for(int i =1; i<=n; i++) {
			System.out.print(i+"번째 정수 입력>>");
			int num = sc.nextInt();
			if(x>num) {
				array[j]=num;
				j++;
			}
		}
		
		System.out.println("결과 : "+Arrays.toString(Arrays.copyOf(array, j)));
		
	}

}
