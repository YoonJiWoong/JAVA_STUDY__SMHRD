import java.util.Arrays;
import java.util.Scanner;

public class _0914_Q1_정렬_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		for(int i = 0; i<array.length; i++) {
			System.out.print((i+1)+"번째 수 입력 : ");
			array[i] =  sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
