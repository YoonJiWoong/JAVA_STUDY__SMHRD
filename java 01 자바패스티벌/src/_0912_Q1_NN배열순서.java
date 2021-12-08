import java.util.Scanner;

public class _0912_Q1_NN배열순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 >>");
		int num = sc.nextInt();
		int [][] array = new int[num][num];
		int count = 1;
		for(int i = 0; i<array.length; i++)
		{
			for(int j = 0; j<array.length; j++)
			{
				array[i][j]=count;
				count++;
				System.out.print(array[i][j]+"\t");
			}System.out.println();
		}
		
		
		
	}

}
