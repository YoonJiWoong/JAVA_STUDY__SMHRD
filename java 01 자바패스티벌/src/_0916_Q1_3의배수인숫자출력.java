import java.util.Scanner;

public class _0916_Q1_3�ǹ���μ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);

			int array[]=new int[10];

			for(int i=0; i<array.length; i++) {

				System.out.print(i+1+"��° ���� �Է� >>");

				array[i]=sc.nextInt();

				

			}

			System.out.print("3�� ��� : ");

			for(int i=0; i<array.length; i++) {

				if(array[i]%3==0) {

					System.out.print(array[i]+" ");

				}

			

		}
	}

}
