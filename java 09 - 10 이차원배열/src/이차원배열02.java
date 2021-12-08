
public class 이차원배열02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub

		int[][] array = new int[5][5];
		int data = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		// 행과 열 바꾸어서 출력
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print(array[col][row] + "\t");
			}
			System.out.println();
		}
	
	}

}
