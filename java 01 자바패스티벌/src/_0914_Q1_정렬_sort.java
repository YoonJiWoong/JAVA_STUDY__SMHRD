import java.util.Arrays;
import java.util.Scanner;

public class _0914_Q1_����_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		for(int i = 0; i<array.length; i++) {
			System.out.print((i+1)+"��° �� �Է� : ");
			array[i] =  sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
