import java.util.Scanner;

public class _0911_Q1_NN�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("����N �Է� : ");
		int input = sc.nextInt();
		int [][] array = new int[input][input];
		int count = 1;
		for(int i=0; i<array.length; i++ )
		{
			for(int j=0; j<array.length; j++)
			{
				array[i][j] =count;
				count+=1;
			}
		}// �Է¹��� �迭���� 
		
		// �Է¹��� �迭 ���
		// 00 10 20 30 40
		// 01 11 21 31 41
		
		for(int row =0; row<array.length; row++)
		{
			for(int col=0; col<array.length; col++ )
			{
				System.out.print(array[col][row] +"\t");
			}System.out.println();
		}
		
			
	}
	}
}
