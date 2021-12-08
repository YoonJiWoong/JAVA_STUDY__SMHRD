
public class 이차원배열03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][5];
		int data = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		// 04 03 02 01 00
		// 14 13 12 11 10
		
		for(int row =0; row<array.length; row++)
		{
			for(int col = array.length-1; col>=0; col--) //array.length-1 = 4
			{
				System.out.print(array[row][col] + "\t");
			}System.out.println();
		}

	}

}
