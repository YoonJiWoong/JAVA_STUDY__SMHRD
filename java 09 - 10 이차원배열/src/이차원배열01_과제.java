
public class 이차원배열01_과제 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[][] array = new int[5][5];
		int data = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		// 이차원 배열 데이터 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) { // 2차원 배열 뒤에부터...
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}//컴퓨터 측면에선 for문에 한꺼번에 넣는게 좋지만, 유지보수측면에선 이렇게
}
