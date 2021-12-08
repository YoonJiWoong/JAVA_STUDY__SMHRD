import java.util.Scanner;

public class _0916_Q1_3의배수인숫자출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);

			int array[]=new int[10];

			for(int i=0; i<array.length; i++) {

				System.out.print(i+1+"번째 정수 입력 >>");

				array[i]=sc.nextInt();

				

			}

			System.out.print("3의 배수 : ");

			for(int i=0; i<array.length; i++) {

				if(array[i]%3==0) {

					System.out.print(array[i]+" ");

				}

			

		}
	}

}
