
import java.util.Arrays;
import java.util.Scanner;

public class _0920_Q2_x�Էº��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� >>");
		int n = sc.nextInt();
		System.out.print("X �Է� >>");
		int x = sc.nextInt();
		int array[]= new int[n];
		int j=0;
		for(int i =1; i<=n; i++) {
			System.out.print(i+"��° ���� �Է�>>");
			int num = sc.nextInt();
			if(x>num) {
				array[j]=num;
				j++;
			}
		}
		
		System.out.println("��� : "+Arrays.toString(Arrays.copyOf(array, j)));
		
	}

}
