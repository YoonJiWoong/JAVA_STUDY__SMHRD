
public class 이차원배열04 {

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
		// 40 30 20 10
		// 41 31 21 11

		for (int col = 0; col < array.length; col++) 
		{
			for (int row = array.length - 1; row >= 0; row--) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	

}
