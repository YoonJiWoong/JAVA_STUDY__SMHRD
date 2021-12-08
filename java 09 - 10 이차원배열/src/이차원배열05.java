
public class 이차원배열05 {

	public static void main(String[] args) {
	

		int[][] array = new int[5][5];
		int data = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		
		// 44 34 24 14 04
		// 43 33 23 13 03
		for(int col=array.length-1; col>=0; col-- )
		{
		
			for(int row = array.length-1; row>=0; row-- )
			{
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();
		}
		System.out.println("****풀이****");
		
		for(int row = array.length-1; row>=0; row--)
		{
			for(int col = array.length-1; col>=0; col--)
			{
				System.out.print(array[col][row]+"\t ");;
			}System.out.println();
		}
		
	}

}
