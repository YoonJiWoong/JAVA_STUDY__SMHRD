
public class �������迭01_���� {

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
		// ������ �迭 ������ ���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) { // 2���� �迭 �ڿ�����...
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}//��ǻ�� ���鿡�� for���� �Ѳ����� �ִ°� ������, �����������鿡�� �̷���
}
